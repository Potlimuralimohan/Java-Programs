/**
 * staticvarm
 */
class staticvarm {
    static int a=10;
    static void display()
    {
        System.out.println("Static Methos");
    }
    static{
        System.out.println("Static Block");
    }

    // public static void main(String args[])
    // {
    //     System.out.println(a);
    //     display();
    // }
}
/**
 * Staticvarm
 */
class Staticvarm {
    public static void main(String args[])
    {
        System.out.println(staticvarm.a);
        staticvarm.display();
    }

    
}