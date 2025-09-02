package Creational.Builder;

public class BuilderDemo {
    public static void main(String[] args) {


        Meal meal = new Meal.MealBuilder("panner", "kofta", "lassi")
                .setDessert("halwa").setAppetizer("chhach").build();

        System.out.println(meal);
    }
}
