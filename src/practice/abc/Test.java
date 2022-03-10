package practice.abc;

public class Test {

	

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
	    A c=new B();
	    C c2 = new C();
	    B b2=new C();
	    A a2=new C();
	    
	    
	   a.re();
	   b.re();
	   c.re();
	   c2.re();
	   b2.re();
	   b2.be();
	  c2.be();
	    b.be(); 
	    b2.se();
	    c2.se();
	    a.se();
	    b.se();
	    c.se();
	    a.be();
	    
	    
	    
	    
	    

	}

}
