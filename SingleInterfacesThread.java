import java.util.*;
public class SingleInterfacesThread {
    public static void main(String[] args) {
        Single s=new Single();//object for the runnable interface class.
        Thread t=new Thread(s);//passing the variables to the thread class.
        t.start();
    }
    
}
class Single implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}
