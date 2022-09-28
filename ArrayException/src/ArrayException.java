public class ArrayException {
    public static void main(String []newworld){
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        try{
            System.out.println("Welcome");
            System.out.println("String: " + array[10]);
            System.out.println("Program terminated");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch block");

        }
    }
}
