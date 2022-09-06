
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Permissoes;
import connector.conexao;

public class permissoesDAO {

	Connection conn = null;
    PreparedStatement pstm = null;
    
    public void save(Permissoes permissao) { 
        
        // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
        // de dados
         

        String sql = "INSERT INTO permissoes(id_permissao,tipoPerm)" + " VALUES(?,?)";

        
        try {
            // Cria uma conexão com o banco
            conn = conexao.createConnectionToMySQL();

            // Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            // Adiciona o valor do primeiro parâmetro da sql
            pstm.setInt(1, permissao.getId());
            // Adicionar o valor do segundo parâmetro da sql
            pstm.setString(2, permissao.getTipo());
        

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


    public void removeByNome(int id_permissao, String tipoPerm) {
	
	String sql = "DELETE FROM permissoes WHERE id_permissao = ? AND tipoPerm = ? ";
	
	try {
		conn = conexao.createConnectionToMySQL(); //cria a conexao
		
		pstm = conn.prepareStatement(sql); // passa comando sql para o objeto pstm
		
		pstm.setInt(1, id_permissao);  //seta no comando sql
		
		pstm.setString(2, tipoPerm); //seta  no comando sql
		
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

   
    public void update(Permissoes permissao) {
	String sql = "UPDATE permissoes SET id_permissao = ?, tipoPerm = ?" + "WHERE id_permissao = ?";
	
	try {
		//Cria uma conexão com o banco
		conn = conexao.createConnectionToMySQL();
		//Cria um preparedStatment, classe usada para executar a query
		pstm = conn.prepareStatement(sql);
		//Adiciona o valor do primeiro parametro da sql
		pstm.setInt(1, permissao.getId());
		//Adiciona o valor do segundo parametro da sql
		pstm.setString(2, permissao.getTipo());

		
		pstm.setInt(3, permissao.getId());
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

     public List<Permissoes> getPermissao() {

        String sql = "SELECT * FROM permissoes";

        List<Permissoes> permissoes = new ArrayList<Permissoes>();

        // Classe que vai recuperar os dados do banco de dados
         ResultSet rset = null;

        try {
             conn = conexao.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            // Enquanto existir dados no banco de dados, faça
             while (rset.next()) {

            	 Permissoes permissao = new Permissoes();

                // Recupera o id do banco e atribui ele ao objeto
            	 permissao.setId(rset.getInt("id_permissao"));

                // Recupera o nome do banco e atribui ele ao objeto
            	 permissao.setTipo(rset.getString("tipoPerm"));

                // Adiciono o contato recuperado, a lista de contatos
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
     
     
     
     
