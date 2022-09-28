
    class Calculator {
        public int add(int i, int j) {
            return i + j;
        }
    }

    class AdvancedCalculator extends Calculator {
        public int sub(int i, int j) {

            return i - j;
        }
    }

    public class Inheritance {
    public static void main(String[] args) {
        AdvancedCalculator a = new AdvancedCalculator();
        System.out.println(a.add(4, 6));
        System.out.println(a.sub(5, 2));
    }
}
