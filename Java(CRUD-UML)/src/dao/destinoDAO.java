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
   
        String sql = "INSERT INTO destinos(nome,valor)" + " VALUES(?,?)";

        try {

            conn = conexao.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, destino.getNome());
            pstm.setDouble(2, destino.getPreco()); 
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


    public void removeByNome(int idDestinos, String nome) {
	
	String sql = "DELETE FROM destinos WHERE id_destino = ? AND nome = ? ";
	
	try {
		conn = conexao.createConnectionToMySQL();
		
		pstm = conn.prepareStatement(sql);
		
		pstm.setInt(1, idDestinos);
		
		pstm.setString(2, nome);
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

   
    public void update(Destinos destino) {
	String sql = "UPDATE destinos SET nome = ?, valor = ?" + "WHERE id_destino = ?";
	
	try {
		conn = conexao.createConnectionToMySQL();
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, destino.getNome());
		pstm.setDouble(2, destino.getPreco());
		pstm.setInt(3, destino.getIDDestinos());
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

         ResultSet rset = null;

        try {
             conn = conexao.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();
             while (rset.next()) {

                Destinos Destino = new Destinos();

                 Destino.setIDDestinos(rset.getInt("id_destino"));

                 Destino.setNome(rset.getString("nome"));

                 Destino.setPreco(rset.getDouble("valor"));

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

          ResultSet rset = null;

         try {
              conn = conexao.createConnectionToMySQL();

             pstm = conn.prepareStatement(sql);
             
             pstm.setString(1, nome);
             
             rset = pstm.executeQuery();

              while (rset.next()) {

                 Destinos Destino = new Destinos();

                 Destino.setIDDestinos(rset.getInt("id_destino"));

                 Destino.setNome(rset.getString("nome"));

                 Destino.setPreco(rset.getDouble("valor"));

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