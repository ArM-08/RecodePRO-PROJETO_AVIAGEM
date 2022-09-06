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
        
        // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
        // de dados
         

        String sql = "INSERT INTO usuario(id_login,Senha,nomeUsuario, email, id_permissao)" + " VALUES(?,?,?,?,?)";

        
        try {
            // Cria uma conexão com o banco
            conn = conexao.createConnectionToMySQL();

            // Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            // Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, cliente.getIDLogin());
            // Adicionar o valor do segundo parâmetro da sql
            pstm.setString(2, cliente.getSenha());
            // Adiciona o valor do terceiro parâmetro da sql
            pstm.setString(3, cliente.getNome());
         // Adiciona o valor do terceiro parâmetro da sql
            pstm.setString(4, cliente.getEmail());
            // Adiciona o valor do terceiro parâmetro da sql
            pstm.setInt(5, cliente.getPermissoes().getId());

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


    public void removeByNome(String idlogin, String senha) {
	
	String sql = "DELETE FROM usuario WHERE id_login = ? AND senha = ? ";
	
	try {
		conn = conexao.createConnectionToMySQL(); //cria a conexao
		
		pstm = conn.prepareStatement(sql); // passa comando sql para o objeto pstm
		
		pstm.setString(1, idlogin);  //seta o nome no comando sql
		
		pstm.setString(2, senha); //seta o telefone no comando sql
		
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

   
    public void update(Cliente cliente) {
	String sql = "UPDATE usuario SET nomeUsuario = ?, senha = ?, email = ?" + "WHERE id_login = ?";
	
	try {
		//Cria uma conexão com o banco
		conn = conexao.createConnectionToMySQL();
		//Cria um preparedStatment, classe usada para executar a query
		pstm = conn.prepareStatement(sql);
		//Adiciona o valor do primeiro parametro da sql
		pstm.setString(1, cliente.getNome());
		//Adiciona o valor do segundo parametro da sql
		pstm.setString(2, cliente.getSenha());
		//Adiciona o valor do terceiro parametro da sql
		pstm.setString(3, cliente.getEmail());
		
		pstm.setString(4, cliente.getIDLogin());
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

     public List<Cliente> getCliente() {

        String sql = "SELECT * FROM usuario";

        List<Cliente> clientes = new ArrayList<Cliente>();

        // Classe que vai recuperar os dados do banco de dados
         ResultSet rset = null;

        try {
             conn = conexao.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();
            
            // Enquanto existir dados no banco de dados, faça
             while (rset.next()) {

                Cliente cliente = new Cliente();

                // Recupera o id do banco e atribui ele ao objeto
                 cliente.setIDLogin(rset.getString("id_login"));

                // Recupera o nome do banco e atribui ele ao objeto
                 cliente.setNome(rset.getString("nomeUsuario"));
                 
                 // Recupera o telefone do banco e atribui ele ao objeto
                 cliente.setSenha(rset.getString("senha"));
                 
                // Recupera a idade do banco e atribui ele ao objeto
                 cliente.setEmail(rset.getString("email"));

                // Adiciono o contato recuperado, a lista de contatos
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

         // Classe que vai recuperar os dados do banco de dados
          ResultSet rset = null;

         try {
              conn = conexao.createConnectionToMySQL();

             pstm = conn.prepareStatement(sql);
             
             pstm.setString(1, nome);
             
             rset = pstm.executeQuery();

             // Enquanto existir dados no banco de dados, faça
              while (rset.next()) {

                 Cliente cliente = new Cliente();

                 // Recupera o id do banco e atribui ele ao objeto
                 cliente.setIDLogin(rset.getString("id_login"));

              // Recupera o nome do banco e atribui ele ao objeto
                 cliente.setNome(rset.getString("nomeUsuario"));
                 
                 // Recupera o telefone do banco e atribui ele ao objeto
                 cliente.setSenha(rset.getString("senha"));
                 
                // Recupera a idade do banco e atribui ele ao objeto
                 cliente.setEmail(rset.getString("email"));


                 // Adiciono o contato recuperado, a lista de contatos
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
     
     
     
     
