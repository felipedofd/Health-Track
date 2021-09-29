public class UserData extends Activity {

    //CRIANDO CLASSE USUARIOS//

    String email;
    String phone;
    String password;
    String cpf;
    String fullName;
    int codUser;
    String gender;
    String address;

    public UserData() {

    }

    //CRIANDO METODOS GETTER and SETTERS

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCodUser() {
        return codUser;
    }

    public void setCodUser(int codUser) {
        this.codUser = codUser;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    //CRIANDO METODOS//


    public UserData(String email, double weight, double height, String phone, String userName, String password,
                    String cpf, String fullName, int codUser, String gender, String address) {
        this.email = email;

        this.phone = phone;

        this.password = password;
        this.cpf = cpf;
        this.fullName = fullName;
        this.codUser = codUser;
        this.gender = gender;
        this.address = address;
    }


    public void includeUser(String nameUser, int userCode) {
        this.setFullName(fullName = nameUser);
        this.setCodUser(codUser = userCode);


        System.out.println("============================= CADASTRO DE USUARIO =============================");

        System.out.println(String.format("O usuario %s foi inserido no sistema com o codigo de usuario %s ", fullName, codUser));

        System.out.println();


    }


    public void changeData(String ChangeData) {

    }

    public void includeAccount(String nameUser, int userCode, String pass, String mail, String tell, String home, String sex ) {
        this.setFullName(fullName = nameUser);
        this.setCodUser(codUser = userCode);
        this.setPassword(password = pass );
        this.setEmail(email = mail);
        this.setPhone(phone = tell);
        this.setAddress(address = home);
        this.setGender(gender = sex);


        System.out.println("============================= CADASTRO DE NOVA CONTA =============================");

        System.out.println(String.format("O nova conta de %s foi inserido no sistema com o codigo de usuario %s ", fullName, codUser));

        System.out.println();




    }
}
