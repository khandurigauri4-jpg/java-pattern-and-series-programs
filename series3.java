// series
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int i , n , sum = 0 , sumj = 0 , prod = 1 , result;
        n = sc.nextInt();
        for( i = 1; i<=n ; i++)
        {
            sumj = 0;
            prod = 1;
            for(int j = 1; j<=i ; j++)
            {
                sumj = sumj + j;
                prod = prod*j;
            }
            result = sumj/prod;
            sum = sum + result;
        }
        System.out.println("sum is = " + sum);
    }
}