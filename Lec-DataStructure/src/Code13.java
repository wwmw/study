import java.util.Scanner;

public class Code13 {

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
		
		// �Ҽ��Ǵ� �˰���

		int max = 0;
		int val = 0;
		for(int i=0; i<data.length; i++) {
			val = val * 10 + data[i];
			
			
		}
	}
}

//n���� ���� �ƴ� �� �ڸ� ������ �Է¹޾� �迭�� �����Ѵ�.
//�̵� �� 1�� �̻��� ���ӵ� �������� ��(1,3 = 13)�Ͽ� ���� �� �ִ� �Ҽ��� �� �ִ밪 ���