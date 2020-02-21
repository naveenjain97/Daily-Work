import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class itrator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		
	list.add("hello");
	list.add("Pulkit");
		list.add("How");
		list.add("8");
		list.add("java");
		list.add("9");
	list.add("True");
		ListIterator<String> it=list.listIterator();
		System.out.println("Forward direction........");
		while(it.hasNext())
		{
			String element= it.next();
			System.out.println(element);
			if(element.equals("java"))
			{
				break;
			}
		}
		
		System.out.println("backword direction........");
		
		while(it.hasPrevious())
		{
			String element= it.previous();
			System.out.println(element);
		}
		System.out.println("the object index"+list.get(2));
}
}