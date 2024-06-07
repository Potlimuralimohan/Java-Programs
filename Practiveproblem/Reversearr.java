package Practiveproblem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reversearr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        //int newarr[] =new int[5];
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int a=arr[start];
            arr[start]=arr[end];
            arr[end]=a;
            start++;
            end--;
            
        }
        System.out.println(Arrays.toString(arr));

    }
}
