/*
{ 5 0 0 0 0
  0 5 0 0 0
  0 0 5 0 0
  0 0 0 5 0
  0 0 0 0 5} */

public class FiveCrossFiveMatrix {
    public static void main( String[] args){
        int n =  5;
        for( int i = 1; i<=n; i++){
            for( int j =1; j<=n; j++){
                if(i==j)
                System.out.print("5 ");
                else
                    System.out.print("0 ");
            }
            //for(int j =1; j<=n; j++ )
               // System.out.print(5);
                System.out.println( );

        }
    }
}
