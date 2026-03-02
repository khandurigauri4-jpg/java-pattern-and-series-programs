// S = 2-4+6-8....n
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int i , n , sum = 0 , a = 2;
        n = sc.nextInt();
        for( i = 1; i<=n ; i++)
        {
            if(i%2==0)
            sum = sum - a;
            else
            sum = sum+a;
            a += 2;
        }
        System.out.println("sum is = " + sum);
    }
}