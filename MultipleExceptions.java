import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

public class MultipleExceptions {
    public static void main(String[] args) {
        Ex obj=new Ex();
        obj.display();
    }
    
}
class Ex{
    void display()
    {
        //Multiple Exceptions
        try{
            int a=5/0;
            int b[]=new int[5];
            b[6]=3;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException h)
        {
            System.out.println(h);
        }
    }
}
