//����ڷκ��� n���� ������ �Է¹��� �� �հ� �ִ밪�� ���Ͽ� ����ϴ� �ڵ�

import java.util.Scanner;

public class Code8_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�迭�� size �Է�");
		
		int size = scan.nextInt();
		int[] data = new int[size];
		
		for(int i=0; i<data.length; i++) {
			System.out.println("data[" + i + "] �� �Է� : ");
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