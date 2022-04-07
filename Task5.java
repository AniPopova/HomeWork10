import java.util.*;
public class Task5 {
    public static void main(String[] args) {

        String myWord = "";
        String reversedString = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Въведете дума, за проверим дали е палиндром: ");
        myWord  = in.nextLine();
        int length = myWord.length();
        for ( int i = length - 1; i >= 0; i-- )
            reversedString = reversedString + myWord.charAt(i);
        if (myWord.equals(reversedString))
            System.out.println("Думата "+myWord+" е палиндром.");
        else
            System.out.println("Думата не е палиндром.");


    }
}
