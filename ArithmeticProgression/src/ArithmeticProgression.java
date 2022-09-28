import java.util.Scanner;


/*public class ArithmeticProgression {
    static void ArithmeticProgression(int a, int d, int n){
        int current_value =a;
        for( int i =0; i<=n; i++) {
            System.out.println(current_value + " ");
        }
        public static void main(String[] args){
            int a =3, d = 3, n = 15;
        }
        printArithmeticProgression(a, d, n);
        }
        } */
class ArithmeticProgression
{
    static void printArithmeticProgression(int a, int d, int n)
    {

        // Printing AP by simply adding d
        // to previous term.
        int curr_term;
        curr_term=a;
        for (int i = 1; i <= n; i++)
        { System.out.print(curr_term + " ");
            curr_term =curr_term + d;

        }
    }

    // Driver code
    public static void main(String[] args)
    {
// starting number
        int a = 2;

// Common difference
        int d = 1;

// N th term to be find
        int n = 5;

        printArithmeticProgression(a, d, n);
    }
}



