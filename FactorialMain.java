import java.util.*;

import pack.Factorial;
import pack.Packdemo;
public class FactorialMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Factorial obj=new Factorial();
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        obj.Fact(n);
        // Packdemo obj2=new Packdemo();
        // obj2.show();
    }
}
