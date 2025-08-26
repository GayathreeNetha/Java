package Variables;

public class StaticVariables {
	static int a=1000;//static variable
	//main method------> starting point of exceution
	public static void main(String[] args) {
		StaticVariables obj1= new StaticVariables();
		StaticVariables obj2= new StaticVariables();
		StaticVariables obj3= new StaticVariables();
		System.out.println("direct access: "+a);//It is a printing Statement
		System.out.println("using className:"+StaticVariables.a);
		System.out.println("using orv:"+obj1.a);
		System.out.println(obj2.a);
		obj3.a=5000;
		System.out.println(obj2.a);
		System.out.println(obj3.a);

	}

}
