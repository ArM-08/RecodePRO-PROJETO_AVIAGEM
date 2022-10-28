
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Permissoes;
import Connection.conexao;

public class permissoesDAO {

	Connection conn = null;
    PreparedStatement pstm = null;
    
    public void save(Permissoes permissao) { 

        String sql = "INSERT INTO permissoes(id_permissao,tipoPerm)" + " VALUES(?,?)";

        
        try {
            conn = conexao.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, permissao.getId());
            pstm.setString(2, permissao.getTipo());
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


    public void removeByNome(int id_permissao, String tipoPerm) {
	
	String sql = "DELETE FROM permissoes WHERE id_permissao = ? AND tipoPerm = ? ";
	
	try {
		conn = conexao.createConnectionToMySQL();
		
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, id_permissao);
		
		pstm.setString(2, tipoPerm);
		
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

   
    public void update(Permissoes permissao) {
	String sql = "UPDATE permissoes SET id_permissao = ?, tipoPerm = ?" + "WHERE id_permissao = ?";
	
	try {
		conn = conexao.createConnectionToMySQL();

		pstm = conn.prepareStatement(sql);

		pstm.setInt(1, permissao.getId());

		pstm.setString(2, permissao.getTipo());

		
		pstm.setInt(3, permissao.getId());

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

     public List<Permissoes> getPermissao() {

        String sql = "SELECT * FROM permissoes";

        List<Permissoes> permissoes = new ArrayList<Permissoes>();

         ResultSet rset = null;

        try {
             conn = conexao.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

             while (rset.next()) {

            	 Permissoes permissao = new Permissoes();

            	 permissao.setId(rset.getInt("id_permissao"));

            	 permissao.setTipo(rset.getString("tipoPerm"));

            	 permissoes.add(permissao);
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
        return permissoes;
     }

}
     
     
     
     
