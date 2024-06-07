package Practiceproblem;

class LCM {
    public int myVal(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}

public class Gcd {
    // Euclidean algorithm for GCD
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num = 10; 
        int num1 = 40;

        // Find GCD using the Euclidean algorithm
        int gcd = findGCD(num, num1);
        System.out.println("GCD: " + gcd);

        // Create an LCM object and calculate the LCM
        LCM ob = new LCM();
        int lcm = ob.myVal(num, num1, gcd);
        System.out.println("LCM: " + lcm);
    }
}
