import java.util.Scanner;
public class ternaryoperator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        int greater = (a>b) ? a:b;
        System.out.println(greater);

    }
}
