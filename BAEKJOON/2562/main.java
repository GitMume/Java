import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=9;
        int arr[] = new int[N];
        int max = 0;
        int cnt = 0;
        
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
                cnt = i+1;
            } 
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
