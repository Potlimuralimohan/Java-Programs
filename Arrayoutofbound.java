public class Arrayoutofbound {
    public static void main(String[] args) {
        Ex obj=new Ex();
        obj.display();
    }
}
//reast of the code is executed correctly.
class Ex{
    void display()
    {
        try{
            int a[]=new int[5];
            a[6]=5;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
    }
}
