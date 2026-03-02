// printing fibonacci series
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int a = 0 , b = 1 , n , c;
        n = sc.nextInt();
        System.out.print(a + " " + b + " ");
         for(int i = 2 ; i<n ; i++)
        {
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
}
}
}