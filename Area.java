import java.util.Scanner;
public class Area{
 	
 int returnArea(int l,int b)
	{ int a=l*b;
	 return a;
	}
	Area(int len,int brdth)
	{
	System.out.println("Area of the rectangle is "+returnArea(len,brdth));
	}
	public static void main(String[] args) {
	
	int x,y;
	
	Scanner sc=new Scanner(System.in); 
		
		System.out.println("Enter the length of rectangle"); 
		x=sc.nextInt();
		System.out.println("Enter the breadth  of rectangle"); 
		 y=sc.nextInt();
		Area rect=new Area(x,y);
		}
}