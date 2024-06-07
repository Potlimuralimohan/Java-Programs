public class dowhile {
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<0);
        System.out.println(Integer.MIN_VALUE);
        for(;;)
        {
            System.out.println("Infinite loop");
        }
    }
}
