package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import connector.conexao;
import modelo.Carrinho;
import java.text.SimpleDateFormat;



public class carrinhoDAO {

	Connection conn = null;
    PreparedStatement pstm = null;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public void save(Carrinho carrinho) { 
        
        // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
        // de dados
         

        String sql = "INSERT INTO carrinho(valorTotal, dataCompra )" + " VALUES(?,?)";

        
        try {
            // Cria uma conexão com o banco
            conn = conexao.createConnectionToMySQL();

            // Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

           
            // Adicionar o valor do segundo parâmetro da sql
            pstm.setDouble(1, carrinho.getTotal());
            
            pstm.setDate(2, new Date(formatter.parse(carrinho.getdataCompra()).getTime()));

            // Executa a sql para inserção dos dados
            pstm.execute();} catch (Exception e) {
                e.printStackTrace();
            } finally { 
                // Fecha as conexões 
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
		conn = conexao.createConnectionToMySQL(); //cria a conexao
		
		pstm = conn.prepareStatement(sql); // passa comando sql para o objeto pstm
		
		pstm.setInt(1, id_carrinho);  //seta no comando sql

		pstm.execute(); //executa o comando sql que esta no objeto pstm
		
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
		//Cria uma conexão com o banco
		conn = conexao.createConnectionToMySQL();
		//Cria um preparedStatment, classe usada para executar a query
		pstm = conn.prepareStatement(sql);
		//Adiciona o valor do primeiro parametro da sql
		pstm.setInt(1, carrinho.getidCarrinho());
		//Adiciona o valor do segundo parametro da sql
		pstm.setDouble(2, carrinho.getTotal());

		
		pstm.setInt(3, carrinho.getidCarrinho());
		// Executa a sql para inserção dos dados
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

        // Classe que vai recuperar os dados do banco de dados
         ResultSet rset = null;

        try {
             conn = conexao.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            // Enquanto existir dados no banco de dados, faça
             while (rset.next()) {



                // Recupera o id do banco e atribui ele ao objeto
            	 carrinhos.setidCarrinho(rset.getInt("id_carrinho"));

                // Recupera o nome do banco e atribui ele ao objeto
            	 carrinhos.setTotal(rset.getDouble("valorTotal"));

                // Adiciono o contato recuperado, a lista de contatos
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
     
     
     
     
