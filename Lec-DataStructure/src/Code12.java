import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
			
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
		int size = scan.nextInt();
		int[] data = new int[size];
		
		System.out.println("�迭�� �� ���� ������� �Է��ϼ���(���� ����)");
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

//n���� ������ �Է¹޾� �迭�� �����Ѵ�.
//�迭���� 0�� �̻��� ���ӵ� �������� ���Ͽ� ���� �� �ִ� �ִ밪�� ���