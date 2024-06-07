public class ThreadMethods {
public static void main(String[] args) {
    Th t1=new Th();
    Th t2=new Th();
    /*System.out.println("ID="+t1.getId());
    System.out.println("Name of the Thread is"+t1.getName());
    t1.setName("Murali");
    System.out.println("Name of the Thread after changing its name is"+t1.getName());
    System.out.println("Priority of Thread is"+t1.getPriority());
    t1.setPriority(10);
    System.out.println("Priority of Thread after the changing is"+t1.getPriority());
    */


    t1.start();  
    try{
        t1.join();
    }
    catch(Exception e)
    {

    }
    System.out.println("Thread1 Status"+t1.isAlive());
    t2.start();
}
}
class Th extends Thread{
    public void run()
    {
        Thread t=currentThread();
        System.out.println("Thread Status:"+t.isAlive());
        for(int i=0;i<=5;i++)
        {
            try{
                t.sleep(1000);//waiting for thousand milliseconds.
            }
            catch(Exception e){

            }
            System.out.println(i); 
        }
    }
}
