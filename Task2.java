public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {8,16,24,32,64,72,88,16,24,64};
        try {
            int d = 0;
            
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
}
