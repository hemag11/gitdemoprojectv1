package testpack;
import java.util.ArrayList;


public class Arraylistdemo {

	public static void main(String[] args) {
		
		//ArrayList <String> list= new ArrayList <String>();
		ArrayList list= new ArrayList();
		
		
		list.add("john");
		list.add("smith");
		list.add("scott");
		list.add(100);
		list.add('a');
		
		
		System.out.println(list.size());
		System.out.println("before removing elements"+list);
			
		
		list.remove(2);
		System.out.println(list.size());
		System.out.println("after removing elements"+list);
		
		//inseritng new element
		list.add(1,"david");
		
		System.out.println(list.size());
		System.out.println("after inserting elements"+list);
		
		for(Object s:list)
		{
			System.out.println(s);
			//System.out.println("after removing elements"+list);
			
		}
	}

}
