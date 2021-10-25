import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDbFiap {

    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                    "RM88840",
                    "fiap21");

            System.out.println("CONECTADO!!!");

            connection.close();

        } catch (SQLException e) {
            System.out.println("DEU RUIM NO LOGIN!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("DEU RUIM NO DRIVER JDBC!!!");
            e.printStackTrace();
        }
    }
}
