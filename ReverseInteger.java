import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input N1 = ");
        int n1 = sc.nextInt();
        System.out.print("Input N2 = ");
        int n2 = sc.nextInt();

        System.out.println("output 1: "+reversedInt(n1));
        System.out.println("output 1: "+reversedInt(n2));

    }

    public static int reversedInt(int n){
        long rev = 0;

        while(n!=0){
            int digit = n%10;
            n/=10;
            rev = rev*10+digit;
        }

        if(rev > Integer.MAX_VALUE || rev< Integer.MIN_VALUE){
            return 0;
        }

        return (int)rev;
    }
}
