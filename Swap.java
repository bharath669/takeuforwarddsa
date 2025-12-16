
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a^b;
        b=(a^b)^b;
        a=(a^b)^b;
        System.out.println("after swaping the number for a and b is :"+a+"and"+ b);
    }
}
