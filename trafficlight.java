import java.util.Scanner;
public class trafficlight{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a color(red,yellow,green):");
        String color = scan.next();
    if(color.equals("red")){
        System.out.println("stop");
    }
    else if(color.equals("yellow")){
        System.out.println("start");
    }
    else if(color.equals("green")){
        System.out.println("go");
    }
    else{
        System.out.println("invalid");
    }
    scan.close();
    }
}