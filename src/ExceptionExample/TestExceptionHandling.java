package ExceptionExample;

public class TestExceptionHandling {
	private int prasadId;
	String prasadName;
	private int salary;
	
 
	public TestExceptionHandling(int prasadId, String prasadName, int salary) throws idValidException {
		super();
		if(prasadId<10){
			throw new idValidException("Enter Valid Id");
		}
		else{
		this.prasadId = prasadId;
		}
		this.prasadName = prasadName;
		this.salary = salary;
	}


	public TestExceptionHandling() {
	}


	public int getPrasadId() {
		return prasadId;
	}


	public void setPrasadId(int prasadId)  {
		
		this.prasadId = prasadId;
	}


	public String getPrasadName() {
		return prasadName;
	}


	public void setPrasadName(String prasadName) {
		
		this.prasadName = prasadName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "TestExceptionHandling [prasadId=" + prasadId + ", prasadName="
				+ prasadName + ", salary=" + salary + "]";
	}


	public static void main(String[] args)throws idValidException {
		TestExceptionHandling t = new TestExceptionHandling(22,"prasad", 230000);
		
		System.out.println(t);
	
//		try{
//		t.setPrasadId(23);
//		System.out.println(t);
//		}
//		catch(Exception e){
//			System.out.println("exception caught:"+e);
//			
//		}
		
	}

}
class idValidException extends Exception{
	public idValidException(String s) {
		super(s);
	}
}

 