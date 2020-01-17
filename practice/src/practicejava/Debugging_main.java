package practicejava;
import java.util.Map;
import java.util.Hashtable;
public class Debugging_main 
{
	
public static void main(String args[]) throws Exception
{
	
	Debugging_main d_m = new Debugging_main();
	d_m.method();
	System.out.println("Print");
	
}

public void method()throws Exception
{ 
	try
	{
		throw new Exception(); 
	}
	catch(Exception e)
	{
		
	}
	}
//	try{ 
//		throw new Exception(); 
//		}
//	finally
//	{ 
//		System.out.println("No Error");
//		}
	
	
	
	
//	Debugging d = new Debugging(100,10,'H',0.07f);
//	d.calculate();
//	
//	
//	Map m = new Hashtable();
//	m.put(10,0.8f);
//	System.out.println(m.size());

	//System.out.println(method());
}
//	public static int method()
//	{ 
//		return;
//		//try
////		{
////			throw new Exception(); 
////			//return 1;
////			} 
////		catch(Exception e)
////		{ 
////			throw new Exception(); 
////			//return 2;
////			} 
////		finally
////		{ 
////			return 3; 
////			}
//	}
//	

//}
