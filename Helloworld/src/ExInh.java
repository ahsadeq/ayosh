
abstract class Calculator{
	//100methods
	abstract int sum(int a,int b);
	abstract int sub(int a,int b);
	int mul(int a,int b) {
		return a*b;
		//mul is a concrete method
	}
}
class CalImp extends Calculator{

	@Override
	int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}

public class ExInh{
	public static void main(String[] args) {
		CalImp ci=new CalImp();
		System.out.println(ci.sum(2,3));
		
	}
}