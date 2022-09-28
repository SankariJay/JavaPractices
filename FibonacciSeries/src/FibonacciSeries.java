// 1,1,2,3,5,8,13...
public class FibonacciSeries {
    public static void main(String[] args) {
        int a=1, b=1, s=0;
        System.out.print("1 1 ");
        while(s<=500){
            s = a+b;
            if(s<500)
                System.out.print(s + " ");
                a = b;
                b = s;

        }
    }
}
