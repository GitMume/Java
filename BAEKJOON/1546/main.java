import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //시험 본 과목의 개수 N
		double arr[] = new double[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextDouble();
		}
		
        sc.close();
		
		double sum = 0; //성적의 합
		Arrays.sort(arr); //세준이 점수 중 최댓값을 알기 위해 정렬
		
		for(int i=0;i<N;i++) {
			sum += ((arr[i] / arr[N-1]) * 100); //세준이가 구한 점수/M*100
		}
		System.out.print(sum / N); //새로운 평균
	}
}
