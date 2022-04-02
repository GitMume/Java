import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int result = 0;

        
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            for(int j=2;j<num;j++){
                if(num%j==0){
                    cnt++;
                }
            }

            if(cnt==0&&num!=1){
                result++;
            }
            cnt=0;
        }

        System.out.println(result);  

    }

}
