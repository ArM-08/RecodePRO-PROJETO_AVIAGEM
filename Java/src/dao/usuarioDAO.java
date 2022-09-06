package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import connector.conexao;
public class usuarioDAO {



	Connection conn = null;
    PreparedStatement pstm = null;
    
    public void save(Cliente cliente) { 
        String sql = "INSERT INTO usuario(id_login,Senha,nomeUsuario, email, id_permissao)" + " VALUES(?,?,?,?,?)";

        
        try {
            conn = conexao.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, cliente.getIDLogin());

            pstm.setString(2, cliente.getSenha());

            pstm.setString(3, cliente.getNome());

            pstm.setString(4, cliente.getEmail());

            pstm.setInt(5, cliente.getPermissoes().getId());

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


    public void removeByNome(String idlogin, String senha) {
	
	String sql = "DELETE FROM usuario WHERE id_login = ? AND senha = ? ";
	
	try {
		conn = conexao.createConnectionToMySQL();
		
		pstm = conn.prepareStatement(sql);
		
		pstm.setString(1, idlogin);
		
		pstm.setString(2, senha);
		
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

   
    public void update(Cliente cliente) {
	String sql = "UPDATE usuario SET nomeUsuario = ?, senha = ?, email = ?" + "WHERE id_login = ?";
	
	try {

		conn = conexao.createConnectionToMySQL();

		pstm = conn.prepareStatement(sql);

		pstm.setString(1, cliente.getNome());
		pstm.setString(2, cliente.getSenha());
		pstm.setString(3, cliente.getEmail());
		pstm.setString(4, cliente.getIDLogin());
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

     public List<Cliente> getCliente() {

        String sql = "SELECT * FROM usuario";

        List<Cliente> clientes = new ArrayList<Cliente>();
         ResultSet rset = null;

        try {
             conn = conexao.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

             while (rset.next()) {

                Cliente cliente = new Cliente();

                 cliente.setIDLogin(rset.getString("id_login"));
                 cliente.setNome(rset.getString("nomeUsuario"));
                 cliente.setSenha(rset.getString("senha"));
                 cliente.setEmail(rset.getString("email"));
                 clientes.add(cliente);
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
        return clientes;
     }

     
  
     
     
     
     public List<Cliente> getBusca(String nome) {

         String sql = "SELECT * FROM usuario WHERE id_login = ?";

         List<Cliente> busca = new ArrayList<Cliente>();
          ResultSet rset = null;

         try {
              conn = conexao.createConnectionToMySQL();

             pstm = conn.prepareStatement(sql);
             
             pstm.setString(1, nome);
             
             rset = pstm.executeQuery();
              while (rset.next()) {

                 Cliente cliente = new Cliente();
                 cliente.setIDLogin(rset.getString("id_login"));
                 cliente.setNome(rset.getString("nomeUsuario"));
                 cliente.setSenha(rset.getString("senha"));
                 cliente.setEmail(rset.getString("email"));
                  busca.add(cliente);
                  
               
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
         return busca;
      }

     
}
     
     
     
     
