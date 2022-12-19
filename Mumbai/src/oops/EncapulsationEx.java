package oops;
class A {
	private int value;//data hiding
	
	
	public void setvalue(int x) //data abstraction
	{
		value=x;
	}
	
	public int getvalue()
	{
		return value;
	}
}
public class EncapulsationEx {
  
	public static void main(String[] args) {
		A obj= new A();
		obj.setvalue(10);
		System.out.println(obj.getvalue());
	}
}
