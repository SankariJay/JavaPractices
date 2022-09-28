public class DemoException {
    public static void main(String[] args) {
        int i=8, j=0, k=0;
        try{
             k = i/j;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't be divided by zero " + e);
        }
        System.out.println(k);
    }
}
