package Practiveproblem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Flow.Subscriber;

public class Secondsmall {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2};
        int firstsmall=arr[0];
        int secondsmall=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<firstsmall)
            {
                secondsmall=firstsmall;
                firstsmall=arr[i];
            }
            else if((arr[i] >firstsmall) && (arr[i]<secondsmall))
            {
                secondsmall=arr[i];
            }
        }
        System.out.println(secondsmall);
        System.out.println(firstsmall);
    }
}
