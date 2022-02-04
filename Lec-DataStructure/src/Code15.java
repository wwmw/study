import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력하세요");
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
			
			System.out.print("배열 : ");
			for(int k=0; k<=i; k++)
				System.out.print(data[k] + " ");
			System.out.println();
		}
		scan.close();
	}
}

//사용자로부터 n개의 정수를 입력받는다.
//정수가 하나씩 입력될 때마다 현재까지 입력된 정수들을 오름차순으로 정렬하여 출력하라.