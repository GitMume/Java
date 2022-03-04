import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = 10;
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt()%42;
        }
        for(int j=0;j<N-1;j++){
            for(int k=j+1;k<N;k++){
              if(arr[j]!=-1){ //값이 -1인 arr는 중복으로 처리 안되게
                if(arr[j]==arr[k]){ //값이 같다면,
                    arr[j]=-1; //배열에 -1 넣어줌.
                }
              }
            }
        }
        
        int cnt=0; //중복되지 않은 값의 수
        
        for(int i=0;i<N;i++){
            if(arr[i]==-1){
                continue;
            }else{
              cnt++;
            }
        }

      System.out.println(cnt);
      sc.close();
    }
  
}
