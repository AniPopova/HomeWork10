import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);
        System.out.println("За да изчислим факториела на вашето число, моля въведете го тук: ");
        int number = newInput.nextInt();
        int fact = 1;
        int initialNum;
        for (initialNum = 1; initialNum <= number; initialNum++) {
            fact = fact * initialNum;
        }
        System.out.println("Факториел от " + number + " е: " + fact);
    }
}
