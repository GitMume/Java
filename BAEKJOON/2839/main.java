import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
       
        if(N==4 || N==7){
            result = -1;
        }
        else if(N%5 == 0){
            result = N/5;
        }
        else if(N%5 == 1 || N%5 == 3){
            result = (N/5)+1;
        }
        else if(N%5 == 2 || N%5 == 4){
            result = (N/5)+2;
        }
        System.out.println(result);
        
    }
}
