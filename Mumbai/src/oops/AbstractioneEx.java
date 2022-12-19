package oops;
abstract class animal
{
	animal()
	{
		System.out.println("All animal barking....");
	}
	public abstract void sound();
}
class Dog extends animal
{
	Dog()
	{
		super();
	}
	public void sound()
	{
		System.out.println("Dog is barking");
	}
}
class Lion
{
	Lion()
	{
		super();
	}
	public void sound()
	{
		System.out.println("Lion is barking");
	}
}
public class AbstractioneEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Lion l= new Lion();
		d.sound();
		l.sound();

	}

}
