package connector;


import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {

   private static final String USERNAME = "root";
   private static final String PASSWORD = "alan3771";
   private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/projetoind";


 public static Connection createConnectionToMySQL() throws Exception{

    Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

    return connection;
 }
}