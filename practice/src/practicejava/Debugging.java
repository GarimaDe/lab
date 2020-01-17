package practicejava;

public class Debugging {

	int i;
	char ch ;
	float f;
	int x;
	
	Debugging()
	{
		
		i =0;
		ch='A';
		f = 0.05f;
	}
	 Debugging(int x, int i , char ch, float f)
	 {
		 this.x = x;
		 this.i = i;
		 this.ch = ch;
		 this.f = f;
	 }
	 
	 public void calculate()
	 {
		 try
		 {
			 int p  = x/i;
			 System.out.println(p);
			 System.out.println("Exception handled");
		 }
		 catch(Exception exception)
		 {
			 System.out.println("Catch block executed");
		 }
	 }
	 
	 
	
	}

