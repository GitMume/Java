import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(fibonacci(n));
    }
    
    public static int fibonacci(int num){
        if(num<=1){
            return num;
        }
        else{
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
}
