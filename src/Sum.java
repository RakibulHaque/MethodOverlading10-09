
public class Sum {
	
	public int sum(int x,int y)
	{
		return (x+y);
		
	}
	public int sum(int x,int y,int z)
	{
		return (x+y+z);
		
	}
	
	public double sum(double x,double y)
	{
		return (x+y);
		
	}
	public static void main(String[] args)
	{
		Sum s = new Sum();
		
		System.out.println("SUM= "+s.sum(10, 20));
		System.out.println("SUM= "+s.sum(29, 49, 59));
		System.out.println("SUM= "+s.sum(2.7, 39.6));
		
		
	}
	

}
