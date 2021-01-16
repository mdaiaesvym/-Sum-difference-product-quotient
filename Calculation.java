package mdaiaesvym;

public class Calculation {

	public int a,b,c;

	//コンストラクター
	public Calculation(int a,int b) {
		System.out.println("a = " + a + " , b = " + b);
	}

	//セッター
	public void setNum(int a,int b) {
		this.a = a;
		this.b = b;
	}

	public void printSum() {
		c = a + b;
		System.out.println("a + b = " + c);
	}

	public void printDifference() {
		c = a - b;
		System.out.println("a - b = " + c);
	}

	public void printProduct() {
		c = a * b;
		System.out.println("a * b = " + c);
	}

	public void printQuotient() {
		c = a / b;
		System.out.println("a / b = " + c);
	}
}
