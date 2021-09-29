import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {


        ArrayList<UserInfo> listInfoUserDAO = new InfoUserDAO().getAll();


        System.out.println("INFORMAÇÕES DOS USUARIOS");


        for (UserInfo userInfo : listInfoUserDAO) {
            System.out.println(userInfo.toString());
        }
    }
}
