
public class Code10 {

	public static void main(String[] args) {
		
		for(int i=2; i<=1000; i++) {
			boolean check = true;
			for(int j=2; check && j<=i/2; j++) {
				if(i % j == 0) {
					check = false;
					break;
				}
			}
			if(check) {
				System.out.println(i);
			}
		}
	}
}
