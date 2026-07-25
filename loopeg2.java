import java.util.Scanner;
public class loopeg2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter a");
        int a = scan.nextInt();
          System.out.println("Enter b:");
        int b = scan.nextInt();
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
    
}