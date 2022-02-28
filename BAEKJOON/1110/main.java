import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int N1 = N;
        int cnt = 0;
        
        while(true){
            N=((N%10)*10)+(((N/10)+(N%10))%10);
            cnt++;
            if(N==N1){
                break;
            }
        }
        System.out.println(cnt);
    }
}
