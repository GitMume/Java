import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int b_cp=b;
        
        System.out.println(a*(b%10));
        b = b - (b%10);
        System.out.println(a*((b%100)/10));
        b = b - (b%100);
        System.out.println(a*(b/100));
        System.out.println(a*b_cp);
    }
}
