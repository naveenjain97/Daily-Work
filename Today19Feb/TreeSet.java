import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSet {
	public static void main(String[] args) {
		TreeSet<String>set = new TreeSet();
		
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


