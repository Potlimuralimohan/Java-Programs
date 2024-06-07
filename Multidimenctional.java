public class Multidimenctional {
    public static void main(String[] args) {
        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];

        // array of Strings
        String[] strArray = new String[3];

        System.out.println(intArray.getClass());
        System.out.println(
            intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass().getSuperclass());
        System.out.println(shortsArray.getClass().getSuperclass());
        System.out.println(strArray.getClass().getSuperclass());
    }
}
