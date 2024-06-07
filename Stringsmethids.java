public class Stringsmethids {
    public static void main(String[] args) {
        String str=new String("   Hello");
        System.out.println(str);
        //str=str.concat("Welome");//not concatinated.
        System.out.println(str.length());
        System.out.println(str.indexOf('o'));
        System.out.println("Charactor at"+str.charAt(2));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.compareTo("Murali"));
        System.out.println(str.trim());

    }
}
