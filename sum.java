public class sum {
    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    void sub(int num1, int num2){
        System.out.println(num1 - num2);
    }
    
    public static void main(String[] args) {
        sum obj = new sum();
        int num1 = 5; 
        int num2 = 10; 
        obj.add(num1, num2);

         num1 = 100;
         num2 = 50;
        obj.sub(num1,num2);
    }
}
