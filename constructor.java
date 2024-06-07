public class constructor {
    String name;
    int rno;
    constructor()
    {
        name="murali";
        rno=12;
    }
    constructor(String str,int n)
    {
        name=str;
        rno=n;
    }
    public static void main(String args[])
    {
        constructor ob=new constructor();
        System.out.println(ob.name);
        //int num=Integer.parseInt(ob.rno);
        System.out.println(ob.rno);
        //System.out.println(num);
        constructor s2=new constructor("murali",123);
        System.out.println(s2.name);
        System.out.println(s2.rno);
    }
}
