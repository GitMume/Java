import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger big = new BigInteger(sc.next());
        BigInteger big2 = new BigInteger(sc.next());
        System.out.println(big.add(big2));
    }
}
