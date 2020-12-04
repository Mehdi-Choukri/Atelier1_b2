
public class Point {
	
	//propieté
	
	public int  x ;
	public int y;
	
	// constructeur 
	public Point(int X,int Y)
	{
		this.x=X;
		this.y=Y;
		
	}
	// constructeur par default
	public Point()
	{
		
	}
	public String Tostring()
	{
		return "X = "+this.x+" Y = "+this.y;
	}
	public static double calculDistance(Point P1,Point P2)
	{
		double d1 , d2 ,d;
		d1 = Math.abs( P2.x - P1.x );
		d2 = Math.abs( P2.y - P1.y );
		d = Math.sqrt((Math.pow(d1, 2))+(Math.pow(d2, 2)));
		return d;
		
	}
	 
	public static void main(String[] args) {
	 
		// instanciations de l'objet Point
		Point p1 = new Point(-7,-2);
		Point p2 = new Point(5,3);
		Point p3 = new Point(6,9);
		System.out.println(p2.Tostring());
		
		System.out.println("La distance entre p1 et p2 est :"+calculDistance(p1,p2));
		

	}

}
