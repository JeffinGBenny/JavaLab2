import java.lang.Math;
public class Triangle{
 	int a=3,b=4,c=5;
    int p=a+b+c;
	double s=(a+b+c)/2;
	 double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	Triangle()
	{System.out.println("Perimeter of triangle="+p);
	System.out.println("area of triangle="+area);
	}
	
	public static void main(String[] args) {
	
	
		Triangle t=new Triangle();
		}
}