package onlinevideo;

class calc
{
	int a;
	int b;
	int c;
	
	public void peform() {
		c = a+b;
	}
	
}
public class test {
	
	public static void main (String args[])
	{
       calc obj = new calc();
       obj.a=2;
       obj.b=3;
       obj.peform();
       System.out.print("The value is : "+obj.c);
	}

}
