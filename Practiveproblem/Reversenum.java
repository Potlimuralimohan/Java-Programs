package Practiveproblem;

public class Reversenum {
    public static void main(String[] args)
    {
        int num=12345;
        int res=0;
        while(num>0)
        {
            int val=num%10;
            res=res*10+val;
            num/=10;
        }
        System.out.println(res);
    }
}
