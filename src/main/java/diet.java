public class diet extends BodyBuilding {

    private int protein, calories;

    public diet(String name, int age, double weight, int protein, int calories) {
        super(name, age, weight);
        this.protein = protein;
        this.calories = calories;
    }

    public int getProtein() {
        return protein;
    }

    public int getCalories() {
        return calories;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public  void setCalories(int calories) {
        this.calories = calories;
    }

    public double proteinToWeightRatio(){
        return (getWeight() * this.protein)/this.protein; //just doing for fun
    }
}
