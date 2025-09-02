package Creational.Builder;


public class Meal {

    private String mainDish;
    private String sideDish;
    private String drink;
    private String dessert;
    private String appetizer;

    private Meal(MealBuilder builder){
        this.mainDish = builder.mainDish;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.appetizer = builder.appetizer;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", drink='" + drink + '\'' +
                ", dessert='" + dessert + '\'' +
                ", appetizer='" + appetizer + '\'' +
                '}';
    }

    public static class MealBuilder {

        private String mainDish;
        private String sideDish;
        private String drink;
        private String dessert = "Default Dessert";
        private String appetizer = "Default Appetizer";

        public MealBuilder(String mainDish, String sideDish, String drink) {
            this.mainDish = mainDish;
            this.sideDish = sideDish;
            this.drink = drink;
        }

        public MealBuilder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public MealBuilder setAppetizer(String appetizer) {
            this.appetizer = appetizer;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }
}
