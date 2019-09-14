package Gitpractice;

public class constructordemo {
	int x;
	int y;
	
	constructordemo()//defualt constructor
	{
		x=10;
		y=20;
	}
	
	constructordemo(int a,int b)
		{
		x=a;
		y=b;
		
		
	}
	
	void display()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args)
	{
		//constructordemo cm= new constructordemo();
		
		constructordemo cm= new constructordemo(100,200);
		cm.display();
	}
	

}
