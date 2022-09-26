import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        
            Scanner sc = new Scanner(System.in);
            String k = sc.nextLine();
            sc.close();
            if (k.isEmpty()){
            throw new IllegalArgumentException("Пустые строки вводить нельзя");
        }
    }
}
        
    

