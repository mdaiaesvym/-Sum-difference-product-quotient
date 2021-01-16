package mdaiaesvym;

public class Sum_difference_product_quotient {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	int a = (int)(Math.random()*10)+1;//1~10の乱数発生
	int b = (int)(Math.random()*10)+1;

	Calculation s1 = new Calculation(a, b);
	s1.setNum(a,b);

	s1.printSum();
	s1.printDifference();
	s1.printProduct();
	s1.printQuotient();

	}

}
