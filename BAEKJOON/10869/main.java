import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>=1){
            if(b<=10000){
                System.out.println(a+b);
                System.out.println(a-b);
                System.out.println(a*b);
                System.out.println(a/b);
                System.out.println(a%b);
            }
        }
    }
}
