import java.util.Scanner;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        System.out.println(Math.min((h-y),Math.min((w-x),Math.min(x,y))));
    }
}
