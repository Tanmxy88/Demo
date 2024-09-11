import java.util.Scanner;
import java.util.stream.StreamSupport;

public class primenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        boolean value = prime(num);
        System.out.println(value);

    }

    static boolean prime(int num){
        if(num <= 1){
            return false;
        }
        int a = 2;
        while(a * a <= num){
            if(num % a == 0){
                System.out.println("Not prime");
                return false;
            }num++;

        }
        if(num % a == 0){
            return false;
        }
        return true;
    }
}
