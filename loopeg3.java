public class loopeg3 { 
    public static void main(String[] args) { 
        int count = 0; 
        
        for (int i = 1; i <= 10; i++) { 
            if (i % 2 == 0) {
            } else { 
                count = count + 1; 
                System.out.println("Odd number: " + i); 
                System.out.println("Current Count: " + count); 
            } 
        } 
    } 
}
