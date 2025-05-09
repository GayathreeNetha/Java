package datatypes;

public class NonStatic {
	 byte b;
	 short s;
	 int i;
	 long l;
	 float f;
	 double d;
	 char c;
     String str;

	public static void main(String[] args) {
		NonStatic obj=new NonStatic();
		System.out.println(obj.b);
		System.out.println(obj.s);
		System.out.println(obj.i);
		System.out.println(obj.l);
		System.out.println(obj.f);
		System.out.println(obj.d);
		System.out.println(obj.c);
		System.out.println(obj.str);

	}

}

//output
//0
//0
//0
//0
//0.0
//0.0
//
//null
