import java.util.Arrays;

public class overloading {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        The value does not get manipulated its stays same as mentioned in the method

        number(70);
        number("Nothing");
        sum(65,565,565,65,65,656,565,623,323,23,23,232,3,5465,46,656532524,2);
    }
    static void number(int b){
        b = 50;
        System.out.println(b);
    }

    static void number(String a){
        a = "Name";
        System.out.println(a);
    }

    static void sum(int ...r){
        System.out.println(Arrays.toString(r));

    }
}

