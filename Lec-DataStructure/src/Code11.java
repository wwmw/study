import java.util.Scanner;

public class Code11 {

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
		
		int count = 0;
		for(int i=0; i<data.length; i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[i] == data[j]) {
					count++;
				}
			}
		}
		System.out.println("�ߺ��� ���� ���� ���� : " + count);
	}
}

//����ڷκ��� n���� ������ �Է¹޴´�.
//�Է¹��� ������� �迭�� �����Ѵ�.
//�ߺ��� ���� ���� ������ ī��Ʈ�Ͽ� ����Ѵ�.