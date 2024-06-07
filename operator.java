public class operator {
    void add()
    {
        int a=10,b=30;
        System.out.println("a+b="+a+b);//concatination operator.
        System.out.println("a+b="+(a+b));
    }
    public static void main(String[] args) {
        operator obj=new operator();
        obj.add();
    }
    
}
