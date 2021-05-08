package lamda;

public class Person {
	private String fn;
	private String ln;
	private int age;
	 Person(String fn,String ln,int age)
	 {
		 this.fn=fn;
		 this.ln=ln;
		 this.age=age;
		 
	 }
	public int getAge() {
		return age;
	}
	public String getFn() {
		return fn;
	}
	public String getLn() {
		return ln;
	}
}
