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
		System.out.println("����üũ");
		for(int i=0; i<data.length; i++) {
			System.out.println("data[" + i + "] = " + data[i]);
		}

		int max = 0;
		for(int i=0; i<data.length; i++) {
			for(int j=i; j<data.length; j++) {
				int val = 0;
				for(int k=i; k<=j; k++) {
					val = val*10 + data[k];
				}
				boolean isPrime = true;
				for(int l=2; l<=val/2 && isPrime; l++) {
					if(val % l == 0) {
						isPrime = false;
					}
				}
				if(isPrime && val > max && val > 1) {
					max = val;
				}
			}
		}
		if(max > 0) {
			System.out.println("�Ҽ��� �� �ִ밪 : " + max);
		} else {
			System.out.println("���� �������� ����");
		}
		
	}
}

//n���� ���� �ƴ� �� �ڸ� ������ �Է¹޾� �迭�� �����Ѵ�.
//�̵� �� 1�� �̻��� ���ӵ� �������� ��(1,3 = 13)�Ͽ� ���� �� �ִ� �Ҽ��� �� �ִ밪 ���