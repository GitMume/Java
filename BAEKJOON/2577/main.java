import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a*b*c;
        
        /* 0에서부터 9까지의 숫자가 몇 번 쓰였느냐이므로 배열의 크기는 10 */
        int arr[]= new int[10];
        
        /* 한 자리씩 숫자를 판단해 그 숫자에 맞는 배열에 ++(카운팅) 해줌 */
        while(result!=0){
            arr[result%10] ++;
            result /= 10;
        }
        
        /* arr[0]~arr[9] 배열 출력 */
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        
    }
}
