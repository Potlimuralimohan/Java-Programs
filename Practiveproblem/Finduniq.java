package Practiveproblem;

import java.util.Scanner;

public class Finduniq {
    public static void main(String[] args) {
        String arr[]=new String[4];
        Scanner sc=new Scanner(System.in);
        String val="12";
        System.out.println(Integer.parseInt(val));
        for(int i=0;i<4;i++)
        {
            System.out.println("enter the number");
            String num=sc.next();
            arr[i]=num;
        }
        System.out.println("\n");

        for(int i=0;i<4;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
