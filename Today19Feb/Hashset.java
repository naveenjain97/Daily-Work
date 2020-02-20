import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Hashset {
	public static void main(String[] args) {
		HashSet<String>set = new HashSet();
		
		set.add("hello");
		set.add("Pulkit");
		set.add("How");
		set.add("8");
		set.add("java");
		set.add("9");
		set.add("True");
	Iterator<String>it=set.iterator();
	while(it.hasNext())
	{
		String element= it.next();
		System.out.println(element);
//		if(element.equals("java"))
//		{
//			break;
//		}
	}
	
}
}
