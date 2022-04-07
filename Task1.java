import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Въведете едно число от 0 до 100: ");
        int theNumber = userInput.nextInt();
        System.out.println("Вашият избор е: "+theNumber);
        if(theNumber<0 || theNumber >100) {
            System.out.println("Числото не може да е по-малко от 0 и по-голямо от 100. Задайте друго!");
        }
        else {
            for(; theNumber>0 && theNumber<101; theNumber++){
            System.out.println("Числата в поредицата са: "+ theNumber);

            }
        }
    }
}
