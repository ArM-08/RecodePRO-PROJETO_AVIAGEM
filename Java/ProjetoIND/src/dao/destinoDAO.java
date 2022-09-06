package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Destinos;
import connector.conexao;
public class destinoDAO {

	Connection conn = null;
    PreparedStatement pstm = null;
    
    public void save(Destinos destino) { 
        
        // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
        // de dados
         

        String sql = "INSERT INTO destinos(nome,valor)" + " VALUES(?,?)";

        
        try {
            // Cria uma conexão com o banco
            conn = conexao.createConnectionToMySQL();

            // Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            // Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, destino.getNome());
            // Adicionar o valor do segundo parâmetro da sql
            pstm.setDouble(2, destino.getPreco()); 
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


    public void removeByNome(int idDestinos, String nome) {
	
	String sql = "DELETE FROM destinos WHERE id_destino = ? AND nome = ? ";
	
	try {
		conn = conexao.createConnectionToMySQL(); //cria a conexao
		
		pstm = conn.prepareStatement(sql); // passa comando sql para o objeto pstm
		
		pstm.setInt(1, idDestinos);  //seta o nome no comando sql
		
		pstm.setString(2, nome); //seta o telefone no comando sql
		
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

   
    public void update(Destinos destino) {
	String sql = "UPDATE destinos SET nome = ?, valor = ?" + "WHERE id_destino = ?";
	
	try {
		//Cria uma conexão com o banco
		conn = conexao.createConnectionToMySQL();
		//Cria um preparedStatment, classe usada para executar a query
		pstm = conn.prepareStatement(sql);
		//Adiciona o valor do primeiro parametro da sql
		pstm.setString(1, destino.getNome());
		//Adiciona o valor do segundo parametro da sql
		pstm.setDouble(2, destino.getPreco());
		
		pstm.setInt(3, destino.getIDDestinos());
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

     public List<Destinos> getDestino() {

        String sql = "SELECT * FROM destinos";

        List<Destinos> destino = new ArrayList<Destinos>();

        // Classe que vai recuperar os dados do banco de dados
         ResultSet rset = null;

        try {
             conn = conexao.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            // Enquanto existir dados no banco de dados, faça
             while (rset.next()) {

                Destinos Destino = new Destinos();

                // Recupera o id do banco e atribui ele ao objeto
                 Destino.setIDDestinos(rset.getInt("id_destino"));

                // Recupera o nome do banco e atribui ele ao objeto
                 Destino.setNome(rset.getString("nome"));
                 
                 // Recupera o telefone do banco e atribui ele ao objeto
                 Destino.setPreco(rset.getDouble("valor"));

                // Adiciono o contato recuperado, a lista de contatos
                 destino.add(Destino);
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
        return destino;
     }

     
  
     
     
     
     public List<Destinos> getBusca(String nome) {

         String sql = "SELECT * FROM destinos WHERE nome = ?";

         List<Destinos> busca = new ArrayList<Destinos>();

         // Classe que vai recuperar os dados do banco de dados
          ResultSet rset = null;

         try {
              conn = conexao.createConnectionToMySQL();

             pstm = conn.prepareStatement(sql);
             
             pstm.setString(1, nome);
             
             rset = pstm.executeQuery();

             // Enquanto existir dados no banco de dados, faça
              while (rset.next()) {

                 Destinos Destino = new Destinos();

              // Recupera o id do banco e atribui ele ao objeto
                 Destino.setIDDestinos(rset.getInt("id_destino"));

                // Recupera o nome do banco e atribui ele ao objeto
                 Destino.setNome(rset.getString("nome"));
                 
                 // Recupera o telefone do banco e atribui ele ao objeto
                 Destino.setPreco(rset.getDouble("valor"));


                 // Adiciono o contato recuperado, a lista de contatos
                  busca.add(Destino);
                  
               
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