public class interfaces {
    public static void main(String[] args) {
        ab obj=new ab();
        obj.Adisplay();
        obj.Ashow();
        obj.Bdisplay();
        obj.Bshow();
    }
    
}
//interfaces only contain the abstrace classes
interface A{
    void Adisplay();
    void Ashow();
}
interface b{
    void Bdisplay();
    void Bshow();
}

class ab implements A,b{
    public void Adisplay()
    {
        System.out.println("A Display");
    }
    public void Ashow()
    {
        System.out.println("A Show");
    }
    public void Bdisplay()
    {
        System.out.println("B Display");
    }
    public void Bshow()
    {
        System.out.println("B Show");
    }
}
