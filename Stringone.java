public class Stringone {
    public static void main(String[] args) {
        byte ascii[]={71,70,71};

        String firststring=new String(ascii);

        System.out.println(firststring);

        String secondstring=new String(ascii,1,2);
        System.out.println(secondstring);
    }
}
