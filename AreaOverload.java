import java.util.Scanner;
public class AreaOverload{
 	 void area(int r)
	{ double  a=3.14*r*r;
	 System.out.println("Area of circle="+a);
	}
  void area(int l,int b)
	{ int a=l*b;
	 System.out.println("Area of rectangle="+a);
	}
	public static void main(String[] args) {
	
	int x,y,r;
	
	Scanner sc=new Scanner(System.in); 
	AreaOverload obj=new AreaOverload();
		System.out.println("Enter the radius of circle"); 
		
		
		 r=sc.nextInt();
		 obj.area(r);
		System.out.println("Enter the length of rectangle"); 
		x=sc.nextInt();
		System.out.println("Enter the breadth  of rectangle"); 
		 y=sc.nextInt();
		obj.area(x,y);
		
		
		
	}
} 