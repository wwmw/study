import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력하세요");
		int size = scan.nextInt();
		int[] data = new int[size];
		
		System.out.println("배열에 들어갈 값을 순서대로 입력하세요");
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