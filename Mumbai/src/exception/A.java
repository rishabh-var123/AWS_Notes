package exception;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=0;
try {
	int c = a/b;
}
catch(Exception e)
{
	System.out.println(e);
}
System.out.println("main method ended");
	}

}
