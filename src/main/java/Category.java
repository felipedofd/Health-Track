public class Category {


    String description;
    int codCat;
    double calorieHour;

    public Category() {

    }

    void includeActivity() {

    }

    public Category(String description, int codCat, double calorieHour) {
        this.description = description;
        this.codCat = codCat;
        this.calorieHour = calorieHour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCodCat() {
        return codCat;
    }

    public void setCodCat(int codCat) {
        this.codCat = codCat;
    }

    public double getCalorieHour() {
        return calorieHour;
    }

    public void setCalorieHour(double calorieHour) {
        this.calorieHour = calorieHour;
    }

    boolean inactive(String codCat) {

        return false;
    }

    void removeCat(int codCat) {

    }

    @Override
    public String toString() {
        return "Category{" +
                "description='" + description + '\'' +
                ", codCat=" + codCat +
                ", calorieHour=" + calorieHour +
                '}';
    }
}
