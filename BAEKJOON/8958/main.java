import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }
        sc.close();
        
        for(int i=0;i<arr.length;i++){
            int sum=0;
            int plus=0;
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)=='O'){
                    plus++;
                }else{
                    plus=0;
                }
                sum+=plus;
            }
            System.out.println(sum);
        } 
    }
}
