package test09;

public class StaticTest {
	static int numST = 10;
	int num = 20;
	
	StaticTest(){
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		test t = new test();
		t.chNum();
		System.out.println(StaticTest.numST);
		StaticTest.numST = 30;
		t.chNum();
		System.out.println(StaticTest.numST);
		
	}
}

