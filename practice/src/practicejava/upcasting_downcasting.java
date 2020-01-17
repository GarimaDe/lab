package practicejava;


class A
{
	public void A()
	{
		System.out.println("Hii A");
	}
	public void disp()
	{
		System.out.println("a disp");
	}
}


class B extends A

{
	
}

class C extends B
{
@Override
public void disp()
{
	System.out.println("C disp");
}
}
public class upcasting_downcasting {
	
	public static void method()
	{
		System.out.println("Cheking");
	}
	public static void main(String args[])
	{
		//Upcasting
		A a = new C();
		a.disp();
		C c = new C();
		//Downcasting
		C c2 = (C)a;
		c2.disp();
		upcasting_downcasting  u_d = null;
		//u_d.method();
		u_d.method();
	}

}
