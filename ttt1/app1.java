package ttt1;

interface Computer {
	int computer(int x, int y);
}

abstract class AA {

	int computer(int x, int y) {
		return (x - y);
	}
}

class B extends AA implements Computer {

	public int computer(int x, int y) {
		return (x + y);
	}
}

public class app1 {

	public static void main(String[] args) {
		Computer com = new B();
		AA aa = new B();
		System.out.println(com.computer(12, 10));
		System.out.println(aa.computer(15, 5));
	}

}
