class Typecasting 
{
	public static void main(String[] args) 
	{
		byte b=10;
		short s=20;
		char c='M';
		int a=30;
		float f=40.5f;
		long l=50;
		double d=60.1;
		//----------------------------
		//AUTO WIDEING & EXPLICITY NARROWING TYPECASTING
		double d1=b;
		double d2=s;
		double d3=c;
		double d4=a;
		double d5=f;
		double d6=l;
		double d7=d;

		long l1=b;
		long l2=s;
		long l3=c;
		long l4=a;
		long l5=(long)f;
		long l6=l;
		long l7=(long)d;

		float f1=b;
		float f2=s;
		float f3=c;
		float f4=a;
		float f5=f;
		float f6=l;
		float f7=(float)d;

		int i1=b;
		int i2=s;
		int i3=c;
		int i4=a;
		int i5=(int)f;
		int i6=(int)l;
		int i7=(int)d;

		char c1=(char)b;
		char c2=(char)s;
		char c3=c;
		char c4=(char)a;
		char c5=(char)f;
		char c6=(char)l;
		char c7=(char)d;

		short s1=b;
		short s2=s;
		short s3=(short)c;
		short s4=(short)a;
		short s5=(short)f;
		short s6=(short)l;
		short s7=(short)d;

		byte b1=b;
		byte b2=(byte)s;
		byte b3=(byte)c;
		byte b4=(byte)a;
		byte b5=(byte)f;
		byte b6=(byte)l;
		byte b7=(byte)d;
		
		System.out.println("From byte to Double...");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6+"\n\n");

		System.out.println("From byte to Long...");
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);
		System.out.println(l6+"\n\n");

		System.out.println("From byte to Float...");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6+"\n\n");

		System.out.println("From byte to Integer...");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6+"\n\n");

		System.out.println("From byte to Char...");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6+"\n\n");

		System.out.println("From byte to Short...");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6+"\n\n");

		System.out.println("From byte to byte...");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6+"\n\n");

		System.out.println("Min value of byte: "+Byte.MIN_VALUE);
		System.out.println("Max value of byte: "+Byte.MAX_VALUE+"\n\n");

		System.out.println("Min value of Short: "+Short.MIN_VALUE);
		System.out.println("Max value of Short: "+Short.MAX_VALUE+"\n\n");

		System.out.println("Min value of Integer: "+Integer.MIN_VALUE);
		System.out.println("Max value of Integer: "+Integer.MAX_VALUE+"\n\n");

		System.out.println("Min value of Float: "+Float.MIN_VALUE);
		System.out.println("Max value of Float: "+Float.MAX_VALUE+"\n\n");

		System.out.println("Min value of Long: "+Long.MIN_VALUE);
		System.out.println("Max value of Long: "+Long.MAX_VALUE+"\n\n");

		System.out.println("Min value of Double: "+Double.MIN_VALUE);
		System.out.println("Max value of Double: "+Double.MAX_VALUE+"\n\n");
	}
}
