import java.util.Scanner;

public class Code14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
		int size = scan.nextInt();
		int[] data = new int[size];
		
		System.out.println("�迭�� �� ��(���� �ƴ� ���ڸ� ����)");
		for(int i=0; i<data.length; i++) {
			data[i] = scan.nextInt();
		}
		
		scan.close();

		//�������� ���� > ��������
		for(int k=0; k<data.length; k++) {
			for(int i=0; i<data.length-1; i++) {
				int tmp = data[i];
				if(data[i] > data[i+1]) {
					data[i] = data[i+1];
					data[i+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}

//n���� ������ �Է¹��� �� ������������ ����(sort) �� ���