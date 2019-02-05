package Bread;

public class SandwichFilling {
    private String btype;
    private int bcalories;
    public SandwichFilling(String type, int calories1 ){
        this.btype = type;
        bcalories = calories1;
    }
    public void display() {
        if(bcalories > 1) {
            System.out.println(btype + " contains " + bcalories + " calories.");
        }
        else{
            System.out.println(btype + " contains " + bcalories + " calorie.");
        }

    }
}
