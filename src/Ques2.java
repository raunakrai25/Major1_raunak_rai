import java.util.*;

public class Ques2 {
    public static int convertBase (int M, int b)

    {

        int r = M % b;

        M = M / b;

        while (M >= b && (M % b == r)) {

            M = M / b;
        }

        if (M == r) {
            return 1;
        }
        return 0;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int M = sc.nextInt ();

        int b = 2;


        while (convertBase (M, b) != 1)

            b++;

        System.out.println (b);
    }
}
