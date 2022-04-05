import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        factorization(n);
        
    }
    
    public static void factorization(int num){
        int i=2;
        while(true){
            if(num==1){
                break;
            }
            else if(num%i==0){
                num = num / i;
                System.out.println(i);
                factorization(num);
                break;
            }
            else{
                i++;
                continue;
            }
        }
    }
}
