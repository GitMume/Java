import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        
        for(int i=0;i<C;i++){   
            double sum = 0;
            double cnt = 0;
            double result = 0;
            
            int arr[] = new int[sc.nextInt()];
            
            for(int j=0;j<arr.length;j++){
                arr[j] = sc.nextInt();
                sum+=arr[j];
            }
            
            result = sum / arr.length;
            for(int k=0; k<arr.length; k++){
                if(arr[k]>result){
                    cnt++;
                }
            }
            System.out.println(String.format("%.3f",(cnt/arr.length)*100)+"%");
        }
        sc.close();
    }
}
