import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력하세요");
		int size = scan.nextInt();
		
		int[] data = new int[size];
		
		System.out.println("배열에 들어갈 값을 순서대로 입력하세요");
		
		for(int i=0; i<data.length; i++) {
			data[i] = scan.nextInt();
		}
		
		scan.close();
		
		int sum = 0;
		int max = data[0];
		for(int i=0; i<data.length; i++) {
			sum += data[i];
			if(max < data[i]) {
				max = data[i];
			}
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("최대값 : " + max);
	}

}
