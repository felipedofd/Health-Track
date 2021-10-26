import java.sql.*;
import java.util.ArrayList;


public class InfoUserDAO {
    public ArrayList<UserInfo> getAll() {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                    "RM88840",
                    "fiap21");

            System.out.println("CONECTADO!!!");

            Statement stmt = connection.createStatement();

            ResultSet result = stmt.executeQuery("SELECT * FROM T_USER_INFO");

            while (result.next()) {
                System.out.println(result.getString("NM_USER") + " " + result.getInt("NR_PESO"));
            }


            connection.close();

        } catch (SQLException e) {
            System.out.println("DEU RUIM NO LOGIN!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("DEU RUIM NO DRIVER JDBC!!!");
            e.printStackTrace();
        }


        ArrayList<UserInfo> listInfoUser = new ArrayList<>();
        listInfoUser.add(new UserInfo("Bahia", 90, 1.92));
        listInfoUser.add(new UserInfo("Kant", 70, 1.64));
        listInfoUser.add(new UserInfo("Ceara", 60, 1.55));
        listInfoUser.add(new UserInfo("Jhow", 75, 1.62));
        listInfoUser.add(new UserInfo("Ozeias", 86, 1.65));
        listInfoUser.add(new UserInfo("Makulele", 56, 1.76));
        listInfoUser.add(new UserInfo("Bozonaro", 112, 1.80));
        listInfoUser.add(new UserInfo("Lula", 66, 2.00));
        listInfoUser.add(new UserInfo("Ciro", 78, 1.90));
        listInfoUser.add(new UserInfo("Haddad", 100, 1.88));

        return listInfoUser;


    }
}



//        INSERT INTO T_USUARIO (nm_user, nr_peso) VALUES ('Bahia', '90');
//        INSERT INTO T_USUARIO (nm_user, nr_peso) VALUES ('Kant', '70');
//        INSERT INTO T_USER_INFO (nm_user, nr_peso) VALUES ('Ceara', '60');
//        INSERT INTO T_USER_INFO (nm_user, nr_peso) VALUES ('Jhow', '75');
//        INSERT INTO T_USER_INFO (nm_user, nr_peso) VALUES ('Ozeias', '86');
//        INSERT INTO T_USER_INFO (nm_user, nr_peso) VALUES ('Makulele', '56');
//        INSERT INTO T_USER_INFO (nm_user, nr_peso) VALUES ('Bozonaro', '112');
//        INSERT INTO T_USER_INFO (nm_user, nr_peso) VALUES ('Lula', '66');
//        INSERT INTO T_USER_INFO (nm_user, nr_peso) VALUES ('Ciro', '78');
//        INSERT INTO T_USER_INFO (nm_user, nr_peso) VALUES ('Haddad', '100');