// Inverted triangle
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int i , j , n;
        n = sc.nextInt();
         for(i = n; i>0; i--)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    
    }
}