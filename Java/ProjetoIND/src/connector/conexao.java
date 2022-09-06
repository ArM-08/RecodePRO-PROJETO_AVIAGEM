package connector;


import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {

   //Nome do usuário do mysql
   private static final String USERNAME = "root";

   //Senha do mysql
   private static final String PASSWORD = "alan3771";

   //Dados de caminho, porta e nome da base de dados que irá ser feita a conexão
   private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/projetoind";
   
// * Cria uma conexão com o banco de dados MySQL utilizando o nome de usuário e senha fornecidos
// * @param username
// * @param senha
// * @return uma conexão com o banco de dados
// * @throws Exception

 public static Connection createConnectionToMySQL() throws Exception{

    //Cria a conexão com o banco de dados
    Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

    return connection;
 }
}