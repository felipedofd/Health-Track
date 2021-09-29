

public class Activity extends Category{

    int codActivity;
    String date;
    String quantityHour;
    double calorie;
    double weight;



    public Activity(String description, int codCat, double calorieHour) {
        super(description, codCat, calorieHour);
    }

    public Activity() {
        super();
    }


    public void includeActivity(int codActivity, String date, String quantityHour, double calorie) {
        System.out.println("============================= CADASTRO DE ATIVIDADES =============================");
        System.out.printf("O USUARIO INSERIU A ATIVIDADE: %s, NO DIA: %s, COM DURAÇÃO DE: %s, E PERDEU %s CALORIAS%n",
                codActivity, date, quantityHour, calorie );

        System.out.println();


    }

    void calculate() {

    }

    @Override
    public String toString() {
        return "Activity{" +
                "codActivity=" + codActivity +
                ", date='" + date + '\'' +
                ", quantityHour='" + quantityHour + '\'' +
                ", calorie=" + calorie +
                '}';
    }
}
