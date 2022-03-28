import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt=1;
        int range=2;
        
        if(N==1){
            System.out.println("1");
        }
        else {
            while(range<=N){
                range = range + (cnt*6);
                cnt++;
            }
            System.out.println(cnt);
        }
        
    }
}
