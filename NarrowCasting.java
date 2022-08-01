class NarrowCasting
{
	public static void main(String[] args) 
	{
		double a= 7.89;
		double b= 10.46;
		System.out.println("Before Narrow Casting:");
		System.out.println(a);
		System.out.println(b);
		int c=(int) a;
		int d=(int) b;
		System.out.println("\nAfter Narrow Casting:");
		System.out.println(c);
		System.out.println(d);
	}	
}