package Variables;

public class NonStaticVariable {
	int a;
	public static void main(String[] args) {
		NonStaticVariable obj1= new NonStaticVariable();
		NonStaticVariable obj2= new NonStaticVariable();
		System.out.println(obj1.a);
		obj1.a=1000;
		System.out.println(obj1.a);
		obj2.a=5000;
		System.out.println(obj2.a);

	}

}

