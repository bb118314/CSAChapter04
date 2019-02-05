package Bread;

public class Sandwich {
    private String ctype;
    private int ccalories;
    private String dtype;
    private int dcalories;
    private int totcalories;
    private int breadcal;

    public Sandwich(String type, int calories1, String type2, int calories2){
        this.ctype = type;
        ccalories = calories1;
        this.dtype = type2;
        dcalories = calories2;
        breadcal = dcalories * 2;
        totcalories = breadcal + ccalories;

    }

    public Sandwich(String type, int calories1, String type2, int calories2, int total ){
        this.ctype = type;
        ccalories = calories1;
        this.dtype = type2;
        dcalories = calories2;
        totcalories = total;
    }
    public void display() {

            System.out.println("A " + ctype + " sandwich with " + ccalories + " calories on " + dtype + " bread that has " + dcalories + " calories per slice will have "
            + totcalories + " total calories");
        }

    }

