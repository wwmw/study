import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
		int size = scan.nextInt();
		
		int[] data = new int[size];
		
		System.out.println("�迭�� �� ���� ������� �Է��ϼ���");
		
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
		
		System.out.println("�հ� : " + sum);
		System.out.println("�ִ밪 : " + max);
	}

}
