package ExceptionExample;

public class ExceptionWithReturn {
	public static void main(String[] args) {
		System.out.println(exclass.m1(-1));
		
	}

}
class exclass{
	public static int m1(int a){
		try{
		if (a< 0){
		System.out.println("Hi");
		return 10;
		}
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			return 20;
		}
		finally{
			//return 30;
		}
		return 40;
	}
}