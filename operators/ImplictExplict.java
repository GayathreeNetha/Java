package operators;

public class ImplictExplict {

	public static void main(String[] args) {
		byte b1=10;
		byte b2=30;
		byte b3=(byte)(b1+b2);
//		(or) int b3=b1+b2;
		System.out.println(b3);
//		char c=' ';
//		System.out.println(c);//prints Empty space
//		ASCII values A=65 a=97 0-9=48   Z=A+24=>65+25==>90       A-Z-->65-90   a-z-->97-122
		char ch1='a';
		char ch2='b';
		char ch3=(char)(ch1+ch2);
		System.out.println(ch3);
		System.out.println(ch1+ch2);
		int x=10100101;
		System.out.println(x);
		int y=0b10100101;
		System.out.println(y);
		int z=0xa;
		System.out.println(z);
		


	}

}
