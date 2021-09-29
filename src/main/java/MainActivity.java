public class MainActivity {
    static UserData user1 = new UserData();
    static Activity user1Activity = new Activity();

    public static void main(String[] args) {

        // INSTANCIANDO USUARIO //

        user1.codUser = 01;
        user1.address = "Rua 12 São Camilo Jundiai";
        user1.cpf = "355.543.234.54";

        user1.password = "12345";
        user1.fullName = "Immanuel Kant";
        user1.gender = "masculino";


        user1.email = "kantdagalera@cavalo.com.br";
        user1.phone = "(11) 95300-3162";

        user1.includeUser(user1.fullName, user1.codUser);




        // INSTANCIANDO NOVA ATIVIDADE FISICA //


        user1Activity.codActivity = 01;
        user1Activity.date = "30/08/2021";
        user1Activity.quantityHour = "30 minutos";
        user1Activity.calorie = 200;

        user1Activity.includeActivity(user1Activity.codActivity, user1Activity.date, user1Activity.quantityHour, user1Activity.calorie);


        User user2 = new User();
        user2.setFullName("José do Carmo");
        user2.setAddress("Rua Bahia, n 123 Jundiai, SP");
        user2.userName ="bahia";
        user2.includeUser("Felipe", 123);

        user2.includeActivity(1,"13/11/2020", "1 hora", 150);

        user2.consultUser(user2.getUserName(), user2.getCodUser());

        user2.consultUser(user2.getUserName(), user2.getCodUser());

        User newAccount = new User();
        newAccount.includeAccount("Bahia", 3, "oxeBahia", "bahia@salvador.com.br", "1195555555", "Rua bahia N 128 Jundiai SP","Masculino");
    }
}
