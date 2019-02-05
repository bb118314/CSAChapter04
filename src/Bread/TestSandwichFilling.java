package Bread;

public class TestSandwichFilling {
    public static void main(String[] args) {
        SandwichFilling sandwichFilling1 = new SandwichFilling("Ham", 1);
        sandwichFilling1.display();
        SandwichFilling sandwichFilling2 = new SandwichFilling("PB&J", 36462);
        sandwichFilling2.display();
        SandwichFilling sandwichFilling3 = new SandwichFilling("Turkey", 21472);
        sandwichFilling3.display();
    }

}
