import java.util.*;

public class Question1 {
    static String st;
    static int cash, n, a, b;
    static void swaping (){
        char str[] = st.toCharArray ();
        int i = 0;
        for (int a = 0; a < str.length; a++)
            if (str[a] == '1')
            {
                i = a;
                break;
            }
        int j = str.length - 1;

        while (j > i)
        {
            if (cash < a)
                break;
            if (str[j] == '0')
            {
                if (str[i] == '0')
                    i++;
                else
                {
                    char temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                    cash = cash - a;
                    j--;
                }
            }
            else
                j--;
        }
        st = new String (str);
    }
    static void flip () {
        char str[] = st.toCharArray();
        int i = 0;

        for (int a = 0; a < str.length; a++)
            if (str[a] == '1') {
                i = a;
                break;
            }
        while (cash >= b) {
            if (i == str.length)
                break;
            if (str[i] == '1') {
                str[i] = '0';
                i++;
                cash = cash - b;
            }
        }
        st = new String(str);
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        st = obj.next();
        cash = obj.nextInt();
        a = obj.nextInt();
        b = obj.nextInt();

        if (a < b){
            swaping();
            flip();
        }
        else {
            flip();
            swaping();
        }
        System.out.println(Integer.parseInt(st,2));
    }
}
