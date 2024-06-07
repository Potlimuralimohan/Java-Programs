class Variable
{
    int a=10;//instance variable.
    static int var=20;//static variable;//where ever we can access we can access the variables.
    public static void main(String args[])
    {
        //with out creating the objects in the instance variables it con't be executed.
        int b=20;//local variables.
        Variable ob=new Variable();
        System.out.println("Instance Variable ="+ob.a);
        System.out.println("static Variables="+var);
        System.out.println("Local Variables="+b);

    }
}