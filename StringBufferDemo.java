public class StringBufferDemo {
    public static void main(String args[])
    {
        StringBuffer str=new StringBuffer("Welcome");
        System.out.println(str);
        System.out.println(str.append("toJAVA"));
        System.out.println(str.insert(4,"HOW"));
        System.out.println(str);
        System.out.println(str.delete(4, 7));
        //System.out.println(str.reverse());
        System.out.println(str.indexOf("Wel"));
        System.out.println(str.charAt(6));
        System.out.println(str.substring(3));
        System.out.println(str.subSequence(11, 13));
        System.out.println(str);

    }
}
