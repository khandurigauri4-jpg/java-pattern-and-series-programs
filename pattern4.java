// number's triangle
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int i , j , k = 1 , n;
        n = sc.nextInt();
         for(i = 1; i<=n ; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    
    }
}