import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
			
		System.out.println("배열의 크기를 입력하세요");
		int size = scan.nextInt();
		int[] data = new int[size];
		
		System.out.println("배열에 들어갈 값을 순서대로 입력하세요(음수 포함)");
		for(int i=0; i<data.length; i++) {
			data[i] = scan.nextInt();
		}
		
		scan.close();

		int sum;
		int max = 0;
		for(int i=0; i<data.length; i++) {
			for(int j=i; j<data.length; j++){
				sum = 0;
				for(int k=i; k<=j; k++) {
					sum += data[k];
				}
				if(sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
}

//n개의 정수를 입력받아 배열에 저장한다.
//배열에서 0개 이상의 연속된 정수들을 더하여 얻을 수 있는 최대값을 출력