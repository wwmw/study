import java.util.Scanner;

public class Code14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력하세요");
		int size = scan.nextInt();
		int[] data = new int[size];
		
		System.out.println("배열에 들어갈 값(음이 아닌 한자리 정수)");
		for(int i=0; i<data.length; i++) {
			data[i] = scan.nextInt();
		}
		
		scan.close();

		//오름차순 정렬 > 버블정렬
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

//n개의 정수를 입력받은 후 오름차순으로 정렬(sort) 및 출력