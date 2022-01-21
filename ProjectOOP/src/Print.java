
class Print {

	public Print(String delimiter) {
		this.delimiter = delimiter;
	}
	
	public String delimiter = "";
	
	public void A() {
		System.out.println(delimiter);
		System.out.println("AA");
		System.out.println("AAA");
	}
	
	public void B() {
		System.out.println(delimiter);
		System.out.println("BB");
		System.out.println("BBB");
	}
	
}