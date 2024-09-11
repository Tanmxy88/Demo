import java.util.Scanner;

public class Changevalue {

    int x = 60;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int a = 2;

             if(a <= num){
                 if(num % a == 0){
                     System.out.println("Prime");
                 };
                 System.out.println("Not a Prime number ");
             }else {
                 System.out.println("Prime number");
             }

// method
    }
    static int name(int x){
        x = 70;
        System.out.println(x);
        return x;
    }

}


