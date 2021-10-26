import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        System.out.println("INFORMAÇÕES DOS USUARIOS PROVENIENTES DO BANCO DE DADOS");

        ArrayList<UserInfo> listInfoUserDAO = new InfoUserDAO().getAll();





        for (UserInfo userInfo : listInfoUserDAO) {
            System.out.println(userInfo.toString());
        }
    }
}
