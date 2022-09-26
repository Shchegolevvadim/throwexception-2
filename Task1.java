// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
import java.util.InputMismatchException;
import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {
        System.out.println("Введите дробное число");
        try {
        Scanner sc = new Scanner(System.in);
        Float k = sc.nextFloat();
        method(k);
        sc.close();}
        catch (InputMismatchException e){
            System.out.println("Введите дробное число");
        }
        
    }
    public static Float method(Float k){
        if(k!=0 && k>-1000000 && k<1000000){
        System.out.println(k);}
        return k;
    }

}