import java.util.Scanner;
class q2{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        double score = sc.nextDouble();
        sc.nextLine();
        var department = sc.nextLine();
        System.out.println("My name is "+ name);
        System.out.println("My score is " + score/10);
        System.out.println("My department is "+ department);
    }
}