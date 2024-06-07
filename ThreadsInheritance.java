import java.util.*;
public class ThreadsInheritance {
    public static void main(String[] args) {
        Single t=new Single();//creating the object.
        t.start();
    }
}
class Single extends Thread{
    public void run()//overriding the run function which is return in the class.
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}
