import java.util.Scanner;

public class Code11 {

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
		
		int count = 0;
		for(int i=0; i<data.length; i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[i] == data[j]) {
					count++;
				}
			}
		}
		System.out.println("중복된 정수 쌍의 개수 : " + count);
	}
}

//사용자로부터 n개의 정수를 입력받는다.
//입력받은 순서대로 배열에 저장한다.
//중복된 정수 쌍의 개수를 카운트하여 출력한다.