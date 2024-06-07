public class Nullpointer {
    public static void main(String[] args) {
        Ex obj=new Ex();
        obj.display();
    }
    
}
class Ex{
    void display()
    {
        try
        {
            String str="hello";
            int num=Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        System.out.println("Exception Handeled");

    }
}
