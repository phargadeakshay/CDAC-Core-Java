package final_1;

public class GCDemo {

	protected void finalize() throws Throwable
	{
		System.out.println("Object garbage collector");
		
	}
	
	public static void main(String[] args)
      {
    GCDemo g1 = new GCDemo();	
    GCDemo g2 = new GCDemo();	
    GCDemo g3 = new GCDemo();	
    g1=null;
    g2=null;
    g3=null;
      }


}

