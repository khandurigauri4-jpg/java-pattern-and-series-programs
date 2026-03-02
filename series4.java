// S = a - a^3 + a^5 - a^7
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int i , n ;
        double sum = 0.0d;
        int k = 1;
        
        n = sc.nextInt();
        System.out.println("enter the value of a");
       int a = sc.nextInt();
        for( i = 1; i<=n ; i++)
        {
            if(i%2==0)
            sum = sum - Math.pow(a,k);
            else
            sum = sum + Math.pow(a,k);
            k += 2;
        }
        System.out.println("sum is = " + sum);
    }
}