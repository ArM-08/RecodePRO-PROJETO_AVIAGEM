package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Connection.conexao;
import modelo.Carrinho;
import java.text.SimpleDateFormat;



public class carrinhoDAO {

	Connection conn = null;
    PreparedStatement pstm = null;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    
    public void save(Carrinho carrinho) { 
        
        String sql = "INSERT INTO carrinho(valorTotal, dataCompra, id_login)" + " VALUES(?,?,?)";

        
        try {

            conn = conexao.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setDouble(1, carrinho.getTotal());
            pstm.setDate(2, new Date(formatter.parse(carrinho.getdataCompra()).getTime()));
            pstm.setString(3, carrinho.getCliente().getIDLogin());
            pstm.execute();} catch (Exception e) {
                e.printStackTrace();
            } finally { 
                try {
                    if (pstm != null) {

                        pstm.close();
                    }

                    if (conn != null) {
                        conn.close();
                    }

                } catch (Exception e) {

                    e.printStackTrace();
                }
            }
        }


    public void removeByNome(int id_carrinho) {
	
	String sql = "DELETE FROM carrinho WHERE id_carrinho = ?";
	
	try {
		conn = conexao.createConnectionToMySQL();
		
		pstm = conn.prepareStatement(sql);
		
		pstm.setInt(1, id_carrinho);

		pstm.execute();
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if (pstm!= null) {
				pstm.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

   
    public void update(Carrinho carrinho) {
	String sql = "UPDATE carrinho SET id_carrinho = ?, valorTotal = ?" + "WHERE id_carrinho = ?";
	
	try {
		
		conn = conexao.createConnectionToMySQL();
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, carrinho.getidCarrinho());
		pstm.setDouble(2, carrinho.getTotal());

		
		pstm.setInt(3, carrinho.getidCarrinho());
		pstm.execute();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if (pstm!= null) {
				pstm.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

     public List<Carrinho> getCarrinho() {

        String sql = "SELECT * FROM carrinho";

        List<Carrinho> carrinho = new ArrayList<Carrinho>();
        Carrinho carrinhos = new Carrinho();
         ResultSet rset = null;

        try {
             conn = conexao.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();
             while (rset.next()) {
            	 carrinhos.setidCarrinho(rset.getInt("id_carrinho"));

            	 carrinhos.setTotal(rset.getDouble("valorTotal"));

            	 carrinho.add(carrinhos);
             }
         } catch (Exception e) {

            e.printStackTrace();
         } finally {

            try {
                if (rset != null) {
                    rset.close();
                 }
                if (pstm != null) {
                    pstm.close();
                 }
                if (conn != null) {
                     conn.close();
                 }
            } catch (Exception e) {
                e.printStackTrace();
             }
         }
        return carrinho;
     }

}
     
     
     
     
