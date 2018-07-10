package test10;

public class FuncTest {
	
	public void add(int a,int b) {
		System.out.println("인트더하기 : " + a+b);
	}
	public void add(long a, long b) {
		System.out.println("롱더하기 : " + a+b);
	}
	public static void main(String[] args) {
		FuncTest ft;
		ft= new FuncTest();
		ft.add(1232123, 123123);     
		ft.add(1l, 2l);
		
	
	}
	 

}
