public class Thisvarib {
    int a=10;
    void display()
    {
        int a=200;
        System.out.println(a);//locacl variables are accessed only
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        //int val=10;
        Thisvarib obj=new Thisvarib();
        obj.display();
        System.out.println(obj.a);
    }
    
}
