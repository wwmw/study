import java.util.Scanner;

public class Code09 {

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
		
		int tmp = data[size-1];
		for(int i=size-1; i>0; i--) {
			data[i] = data[i-1];
		}
		data[0] = tmp;
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}