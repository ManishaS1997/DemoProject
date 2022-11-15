import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {


		HashMap hs=new HashMap();
		
		hs.put("HCL",10);
		hs.put("IBM",100);
		hs.put("Infosys", 50);
		hs.put("Capgemini", 80);
		
		Set set=hs.keySet();
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("Key : "+itr.next());
			//System.out.println("Values: "+);
		}
		

	}

}
