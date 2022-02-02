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
		System.out.println("에러체크");
		for(int i=0; i<data.length; i++) {
			System.out.println("data[" + i + "] = " + data[i]);
		}

		int max = 0;
		for(int i=0; i<data.length; i++) {
			for(int j=i; j<data.length; j++) {
				int val = 0;
				for(int k=i; k<=j; k++) {
					val = val*10 + data[k];
				}
				boolean isPrime = true;
				for(int l=2; l<=val/2 && isPrime; l++) {
					if(val % l == 0) {
						isPrime = false;
					}
				}
				if(isPrime && val > max && val > 1) {
					max = val;
				}
			}
		}
		if(max > 0) {
			System.out.println("소수들 중 최대값 : " + max);
		} else {
			System.out.println("값이 존재하지 않음");
		}
		
	}
}

//n개의 음이 아닌 한 자리 정수를 입력받아 배열에 저장한다.
//이들 중 1개 이상의 연속된 정수들을 합(1,3 = 13)하여 얻을 수 있는 소수들 중 최대값 출력