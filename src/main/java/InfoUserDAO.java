import java.util.ArrayList;


public class InfoUserDAO {
    public ArrayList<UserInfo> getAll() {

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
