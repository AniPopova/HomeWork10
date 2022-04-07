import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Кажете колко реда искате да е вашият тригълник: ");
        int beginning, empty, end, size = userChoice.nextInt();
        for (beginning = 0; beginning <= size - 1; beginning++) {
            for (empty = 0; empty <= beginning; empty++) {
                System.out.print(" ");
            }
            for (end = 0; end <= size - 1 - beginning; end++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }
    }

}