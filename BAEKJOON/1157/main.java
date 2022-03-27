import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        
        int cnt[] = new int[26];
        
        for(int i=0;i<s.length();i++){
            int num = s.charAt(i)-'A';
            cnt[num]++;
        }
        
        int max=0;
        char c = '?';
        
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]>max){
                max = cnt[i];
                c = (char)(i+'A');
            }
            else if(cnt[i]==max){
                c = '?';
            }
        }
        System.out.println(c);
    }
}
