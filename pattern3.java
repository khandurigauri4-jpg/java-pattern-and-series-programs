// Pyramid Triangle
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int i , j , k , n;
        n = sc.nextInt();
         for(i = 1; i<=n ; i++)
        {
            for(j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(k = 1; k<= 2*i-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}