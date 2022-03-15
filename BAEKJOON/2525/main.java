import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int plus_hour = 0;
        int minute = sc.nextInt();
        int need_time = sc.nextInt();
        
        minute += need_time;

        plus_hour = minute / 60;
        minute = minute % 60;

        hour += plus_hour;
      
        if(hour==24){
          hour=0;
        }
        else if(hour>24){
          hour-=24;
        }
      
        System.out.println(hour+" "+minute);
        
    }
}
