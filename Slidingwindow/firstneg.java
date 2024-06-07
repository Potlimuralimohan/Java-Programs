package Slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import javax.management.Query;
import javax.swing.plaf.synth.SynthStyle;

public class firstneg {
    public static void main(String[] args) {
        System.out.println("integer arr size n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter arr values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("inter window size k>");
        int k=sc.nextInt();

        Queue<Integer>queue=new LinkedList<>();
        List<Integer>list=new ArrayList<>();

        int i=0,j=0;
        while (j<arr.length) {
            if(arr[j]<0)
            {
                queue.add(arr[j]);
            }
            if(j-i+1 <k)
            {
                j++;
            }
            else if(j-i+1 ==k)
            {
                if(queue.isEmpty())
                {
                    list.add(0);
                }
                else{
                    list.add(queue.peek());
                    if(arr[i]==queue.peek())
                    {
                        queue.poll();
                    }
                }

                i++;
                j++;

            }
            
        }
        System.out.println(list);
    }

}
