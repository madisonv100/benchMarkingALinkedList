import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListApp {
private LinkedList<Integer> list = new LinkedList<Integer>();
public  void ordered(int insert) {
	boolean added = false;

	if (list.isEmpty()) {
		
		ListIterator<Integer> it = list.listIterator();
		it.add(insert);
		added = true;
		
	
	} else {
		ListIterator<Integer> it = list.listIterator();
		while (it.hasNext()) {
			Integer current = it.next();
		
			if (current > insert) {
				it.previous();
				it.add(insert);
				added = true;
				break;
			}
			
		}

	
	if (!added) {
		
		it.add(insert);
	
	}
	}

}
public int getSize()
{
	return list.size();
}
public int getMin()
{
	return list.get(0);
	
}

	
	  public int getMed() 
	  { 
		  int size = list.size(); 
		  if(size%2 != 0) {
	      int  med = list.get((list.size()-1)/2);
			  return med;
			  
	  } 
	    
		  else { 
			  int num1 = list.get(size/2);
			  int num2 = list.get(size/2 -1);
	  
			  return (num1 + num2)/2 ; 
	  } 
		  }
	 
public int getMax()
{
	return list.get(list.size()-1);
}
public void printList() {
	

	for (int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i) + " ");
	}
}


}
