package onlinevideo;

class calc
{
	int a;
	int b;
	int c;
	
	public void peform() {
		c = a+b;
	}
	public void Multiply() {
		c = a*b;
	}
	
}
public class test {
	
	public static void main (String args[])
	{
       calc obj = new calc();
       obj.a=2;
       obj.b=3;
       obj.peform();
       obj.Multiply();
       System.out.print("Start of the program");
       System.out.print("The value is : "+obj.c);
       System.out.print("The value of multiplication is : "+obj.c);
	}

}
