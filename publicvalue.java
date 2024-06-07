/**
 * publicvalue
 */
public class publicvalue {

    public static void main(String[] args) {
        System.out.println("Murali");
        final int va=30;
        //va=40;
        System.out.println(va);
        // while (true) {
        //     System.out.println("Murali");
        // }
        // System.out.println('A'+"Murali");
        // //System.out.println('A'+'Murali');
        // System.out.println("3"+3);
        // System.out.println('3'+3);
        // System.out.println("murali"+"murali");
        // String val="murlai";
        // val="mohan";
        // short mynum=12000;
        // System.out.println(mynum);
        // System.out.println(val);
        // char num=65;

        // System.out.println(num);
        // System.out.println('A');
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}
