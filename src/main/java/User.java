public class User extends UserData {

    String userName;
    double weight;
    double height;

    public User() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(String userName, double weight, double height) {
        this.userName = userName;
        this.weight = weight;
        this.height = height;
    }

    public User(String email, double weight, double height, String phone, String userName, String password, String cpf, String fullName, int codUser, String gender, String address, String userName1, double weight1, double height1) {
        super(email, weight, height, phone, userName, password, cpf, fullName, codUser, gender, address);
        this.userName = userName1;
        this.weight = weight1;
        this.height = height1;
    }

    public void consultUser(String nameUser, int userCode) {
        this.setFullName(fullName = nameUser);
        this.setCodUser(codUser = userCode);


    }
}
