import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input array size");
		int size = scan.nextInt();
		int[] data = new int[size];
		
		for(int i=0; i<data.length; i++) {
			int tmp = scan.nextInt();
			int j = i-1;
			
			while(j>=0 && data[j]>tmp) {
				data[j+1] = data[j];
				j--;
			}
			
			data[j+1] = tmp;
			
			System.out.print("array : ");
			for(int k=0; k<=i; k++)
				System.out.print(data[k] + " ");
			System.out.println();
		}
		scan.close();
	}
}

//����ڷκ��� n���� ������ �Է¹޴´�.
//������ �ϳ��� �Էµ� ������ ������� �Էµ� �������� ������������ �����Ͽ� ����϶�.