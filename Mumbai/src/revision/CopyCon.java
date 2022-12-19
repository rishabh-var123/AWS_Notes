package revision;
class A
{
	int a,b;
	A()
	{
		a=10;
		b=20;
		System.out.println(""+a+" "+b);
	}
	A(A ref)
	{
		a=ref.a;
		b=ref.b;
		System.out.println(""+a+" "+b);
	}
}
public class CopyCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obA=new A();
		A obB=new A(obA);

	}

}
