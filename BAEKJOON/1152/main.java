import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        StringTokenizer st = new StringTokenizer(s," ");
        
        System.out.println(st.countTokens());
        
    }
}
