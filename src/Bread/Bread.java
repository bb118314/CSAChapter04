package Bread;

public class Bread {
    private String type;
    private int calories;
    public final static String MOTTO = "The Staff of Life";
    public Bread(String type, int calories1 ){
        this.type = type;
        calories = calories1;
    }
    public void display() {
        if(calories > 1) {
            System.out.println(type + " contains " + calories + " calories.");
            System.out.println(MOTTO);
        }
        else{
            System.out.println(type + " contains " + calories + " calorie.");
            System.out.println(MOTTO);
        }

    }
}
