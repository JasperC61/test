
public class RecursionTest {
/*
 * 1+..+100用遞歸作法
 * 
 * 
 */
	public static void main(String[] args) {
		
		RecursionTest rec=new  RecursionTest();
		int sum=rec.getSum(100);
		System.out.println("sum  is " +sum);
	}
	
	public int getSum(int n) {
		if (n==1) {
			return 1;
		}else {
			return n+getSum(n-1);
		}

}}
