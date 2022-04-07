import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner readMe = new Scanner(System.in);
        System.out.println("Въведете колко реда да е вашият триъгълник: ");
        int i;
        int j;
        int size= readMe.nextInt();

        for (i = size; i >= 1; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

