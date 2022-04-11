import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String regex = "^[A-F]?A+F+C+[A-F]?$";
        
        for(int i=0;i<n;i++){
            String word = br.readLine();
            if(word.matches(regex)){
                System.out.println("Infected!");
            }
            else{
                System.out.println("Good");
            }
        }
    }
}
