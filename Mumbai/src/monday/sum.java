package monday;

import java.util.Scanner;

public class sum {
	static boolean CheckOnlyOneZero(int num){
		int i=0;
		while(num>=10){
		    i=num%10;
		    num=num/10;
		if(i==1 || i==0)
			continue;
		else 
			return false;
		}
		if(num==1 || num==0)
			return true;
		else 
			return false;
	}
	static int smallestOneZeroMultiple(int divisible)
	{
	int mul=2;
	int re=mul*divisible;
	while(re<1111111111){
	    if(CheckOnlyOneZero(re))
	        return re;
	    mul++;
	    re=mul*divisible;
	    }
	    return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(smallestOneZeroMultiple(n));
	}

}
