public class laptop {
    String name = "";
    String processor = "";
    int price = 0;
    int ram = 0;
public static void main(String[]args){
    laptop l1 = new laptop();
    l1.name = "dell";
    l1.processor = "i5";
    l1.price = 50;
    l1.ram = 8;
    
    laptop l2 = new laptop();
    l2.name = "hp";
    l2.processor = "i4";
    l2.price = 55;
    l2.ram = 8;

    System.out.println(l1.name);
    System.out.println(l2.price);
}
}
