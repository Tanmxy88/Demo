import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        boolean finalnumber = isnumber(num);
        System.out.println(finalnumber);
    }

    static boolean isnumber(int num){
        int original = num;
        int count = 0;

        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            count = count + rem*rem*rem;
        }
            if(original == count){
                return true;
            }
            return false;
    }
}
