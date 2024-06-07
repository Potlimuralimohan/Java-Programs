public class Numberfor {
    public static void main(String[] args) {
        Ex obj=new Ex();
        obj.display();
    }
    
}
class Ex{
    void display()
    {
        try{
            String str=null;
            System.out.println(str.length());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Exception Handeled....");
    }
}
