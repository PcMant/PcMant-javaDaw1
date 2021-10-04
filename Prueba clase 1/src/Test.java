
public class Test {
	public static char getLetras() {
		return (char) (Math.random()*26 + 'a');
	}
	public static void main(String[] args) {
		System.out.print(getLetras());
		System.out.print(getLetras());
		System.out.print(getLetras());
		System.out.print(getLetras());
	}

}
