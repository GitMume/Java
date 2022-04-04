import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min=n;
        int sum=0;
        
        for(int i=m;i<=n;i++){
            int cnt=0;
            if(i<2){
                cnt++;
            }
            for(int j=2;j<i;j++){
                if(i%j==0){
                    cnt++;
                    break;
                }
            }
            if(cnt==0){
                sum+=i;
                if(min>i){
                    min = i;
                }
            }
        }
        
        if(sum==0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
    
}
