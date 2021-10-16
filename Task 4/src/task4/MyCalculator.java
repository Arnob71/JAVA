package task4;
import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{
	public int divisorSum(int n)
	  {
		 int s=0;
		 for(int i=n;i>=1;i--)
		 {
			 if(n%i==0)
			 {
				 s=s+i;
			 }
		 }
		 return s;
	  }
	
	public BigInteger findFactorial(int n)
	{
		BigInteger r=BigInteger.ONE;
		for(int i=n;i>=1;i--)
		{
			r=r.multiply(BigInteger.valueOf(i));
		}
		return r;
	}
}
