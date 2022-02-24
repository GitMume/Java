import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2=0;
        if(num1 >= 1000){
            if(num1 <=3000){
                num2 = num1 - 543;
                System.out.println(num2);
            }
        }
        else{
            System.out.println("범위 내의 수를 입력하세요.");
        }
        
    }
}
