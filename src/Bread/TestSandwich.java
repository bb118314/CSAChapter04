package Bread;

import Bread.Sandwich;

public class TestSandwich {
    public static void main(String[] args) {
        Sandwich Sandwich1 = new Sandwich("Ham", 5, "Rye", 5);
        Sandwich1.display();
        Sandwich Sandwich2 = new Sandwich("PB&J", 10, "Wheat", 20);
        Sandwich2.display();
        Sandwich Sandwich3 = new Sandwich("Turkey", 100, "White", 50);
        Sandwich3.display();

    }
}
