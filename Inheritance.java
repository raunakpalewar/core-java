package opps.prac;
class Calculator{
	public int add(int i,int j) {
		return i+j;
	}
	
}
class AdvCalculator extends Calculator{

	public int sub(int i,int j) {
		return i-j;
	}
}
class SciCalculator extends AdvCalculator{
	public int mul(int i,int j)
	{
		return i*j;
	}
}
public class Inheritance {
	public static void main(String[] args) {
		SciCalculator c1=new SciCalculator();
		int result=c1.add(4,5);
		int result2=c1.sub(5,2);
		int result3=c1.mul(5,9);
		System.out.println(result +"\n"+ result2+"\n" +result3);
	}
}
