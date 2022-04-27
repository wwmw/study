//사용자로부터 n개의 정수를 입력받은 후 합과 최대값을 구하여 출력하는 코드

import java.util.Scanner;

public class Code8_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 size 입력");
		
		int size = scan.nextInt();
		int[] data = new int[size];
		
		for(int i=0; i<data.length; i++) {
			System.out.println("data[" + i + "] 값 입력 : ");
			data[i] = scan.nextInt();
		}
		
		scan.close();
		
		int sum = 0;
		for(int i=0; i<data.length; i++) {
			sum = sum + data[i];
		}
		
		int max = 0;
		for(int i=0; i<data.length; i++) {
			if(max < data[i]) {
				max = data[i];
			}
		}
		
		System.out.println("sum : " + sum);
		System.out.println("max : " + max);
	}

}