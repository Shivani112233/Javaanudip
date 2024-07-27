package july23;

class A {
public synchronized void funA(B b1){
System.out.println("funA of A starts");
b1.fun2();
System.out.println("funA of A ends");
}
public synchronized void fun1(){
System.out.println("inside fun1 of A");
}
}
class B {
public synchronized void funB(A a1){
System.out.println("funB of B starts");
a1.fun1();
System.out.println("funB of B ends");
}

public synchronized void fun2(){
System.out.println("inside fun2 of B");
}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		B b1 = new B();
		ThreadA1 t1 = new ThreadA1(a1, b1);
		ThreadB11 t2 = new ThreadB11(a1, b1);
		t1.start();
		t2.start();
		}
		}

	


