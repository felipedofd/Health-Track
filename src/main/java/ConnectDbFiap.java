import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectDbFiap {
    public static Connection obterConexao() {
        Connection connection = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                    "RM88840",
                    "fiap21");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}


//
//            PreparedStatement pstmt = connection
//                    .prepareStatement("INSERT INTO T_USER_INFO" +
//                            "(NM_USER, NR_PESO" +
//                            "VALUES (?, ?");
//
//            pstmt.setString(1, "Azor");
//            pstmt.setFloat(2, 88); //ALTERAÇÃO PESO USUARIO
//            pstmt.executeUpdate();
//
//            pstmt.setString(1, "Tapogigio");
//            pstmt.setFloat(2, 85); //ALTERAÇÃO PESO USUARIO
//            pstmt.executeUpdate();
//
//            pstmt.setString(1, "Carioca");
//            pstmt.setFloat(2, 58); //ALTERAÇÃO PESO USUARIO
//            pstmt.executeUpdate();
//
//            pstmt.setString(1, "Gaucho");
//            pstmt.setFloat(2, 95); //ALTERAÇÃO PESO USUARIO
//            pstmt.executeUpdate();
//
//            pstmt.setString(1, "Catarina");
//            pstmt.setFloat(2, 71); //ALTERAÇÃO PESO USUARIO
//            pstmt.executeUpdate();


//            Statement stmt = connection.createStatement();
////          CRUD NO BANCO
//            stmt.executeUpdate(
//                    "INSERT INTO T_USER_INFO (NM_USER, NR_PESO)" + "VALUES ('Azor', 88)");
//
//            stmt.executeUpdate(
//                    "INSERT INTO T_USER_INFO (NM_USER, NR_PESO)" + "VALUES ('Tapogigio', 85)");
//
//            stmt.executeUpdate(
//                    "INSERT INTO T_USER_INFO (NM_USER, NR_PESO)" + "VALUES ('Carioca', 58)");
//
//            stmt.executeUpdate(
//                    "INSERT INTO T_USER_INFO (NM_USER, NR_PESO)" + "VALUES ('Gaucho', 95)");
//
//            stmt.executeUpdate(
//                    "INSERT INTO T_USER_INFO (NM_USER, NR_PESO)" + "VALUES ('Catarina', 71)");

//          CONSULTANDO O BANCO

//            pstmt = connection.prepareStatement("SELECT * FROM T_USER_INFO WHERE NM_USER = ?");
//            pstmt.setString(1, "BahiaA");
//            ResultSet result = pstmt.executeQuery();
//
//            while (result.next()) {
//                System.out.println
//                        ("USUARIO: " + result.getString("NM_USER") + " " + "ESTA PESANDO: " +
//                                result.getInt("NR_PESO") + "KG");
//            }
//
//            ResultSet result = stmt.executeQuery("SELECT * FROM T_USER_INFO");


//
//            while (result.next()) {
//                System.out.println(result.getString("NM_USER") + " " + result.getInt("NR_PESO"));
//            }
//

//            connection.close();
//
//        } catch (SQLException e) {
//            System.out.println("DEU RUIM NO LOGIN!!!");
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            System.out.println("DEU RUIM NO DRIVER JDBC!!!");
//            e.printStackTrace();
//        }






