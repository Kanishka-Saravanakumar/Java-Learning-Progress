import java.util.Scanner;

public class divisible { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Enter a number: "); 
        int num = scan.nextInt(); 
                if (num % 5 == 0 && num % 3 == 0) { 
            System.out.println("divisible"); 
        } else { 
            System.out.println("not divisible"); 
        } 
        
        scan.close(); 
    } 
}