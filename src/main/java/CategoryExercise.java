public class CategoryExercise {

    String exerciseType;
    float calorie;

    public CategoryExercise(String exerciseType, float calorie) {
        this.exerciseType = exerciseType;
        this.calorie = calorie;
    }
          public CategoryExercise() {
        }

        void includeActivity() {

        }


    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public float getCalorie() {
        return calorie;
    }

    public void setCalorie(float calorie) {
        this.calorie = calorie;
    }





    @Override
    public String toString() {
        return "CategoryExercise{" +
                "description='" + exerciseType + '\'' +
                ", codCat=" +
                ", calorieHour=" + calorie +
                '}';
    }
}
