import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
			
		System.out.println("배열의 크기를 입력하세요");
		int size = scan.nextInt();
		int[] data = new int[size];
		
		System.out.println("배열에 들어갈 값(음이 아닌 한자리 정수)");
		for(int i=0; i<data.length; i++) {
			data[i] = scan.nextInt();
		}
		
		scan.close();
		
		// 소수판단 알고리즘

		int max = 0;
		int val = 0;
		for(int i=0; i<data.length; i++) {
			val = val * 10 + data[i];
			
			
		}
	}
}

//n개의 음이 아닌 한 자리 정수를 입력받아 배열에 저장한다.
//이들 중 1개 이상의 연속된 정수들을 합(1,3 = 13)하여 얻을 수 있는 소수들 중 최대값 출력