class Cal{
	int v1, v2;
	Cal(int v1, int v2){
		this.v1 = v1;
		this.v2 = v2;
	}
	public int sum() {
		return v1 + v2;
	}
}

class Cal2 extends Cal{

	Cal2(int v1, int v2) {
		super(v1, v2);	
	}
	public int minus() {
		return v1 - v2;
	}
	public int sum() {
		System.out.println("오버라이딩");
		return v1 + v2;
	}
}

public class InheritanceApp {
	public static void main(String[] args) {
		Cal c1 = new Cal(2, 1);
		System.out.println(c1.sum());
		
		Cal2 c2 = new Cal2(2, 1);
		System.out.println(c2.sum());
		System.out.println(c2.minus());
		}
}
