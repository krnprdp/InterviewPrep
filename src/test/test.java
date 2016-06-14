package test;

public class test{
	static void main(String[] args) {
		B o = new B();
		System.out.println(o instanceof B);
		System.out.println(o instanceof A);
		System.out.println(o instanceof C);
	}	
}

class A {

}

class B extends A {

}

class C extends B {

}
