package day10package;
import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {

	public static void main(String[] args) {
		//HashMap hm=new HashMap();
		
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
	hm.put(101,"john");
	hm.put(102,"scott");
	hm.put(103,"davis");
	hm.put(104, "kim");
	
	System.out.println(hm);
	hm.remove(103);
	System.out.println("after removing elements"+hm);
	
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
		
	
	
		
	}

}
