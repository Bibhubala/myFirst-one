import java.util.Comparator;
import java.util.TreeSet;



public class Add {
	public static void main(String[] args) {
	/*	LinkedList l=new LinkedList();
		l.add("Durga");
		l.add(50);
		l.add("bibhu");
		l.add(null);
		l.add("bk");
		l.set(0,"Abhishek");
		l.add(0,"Vinay");
		l.remove("bibhu");
		l.addFirst(12);
		System.out.println(l);
		
		
		Vector v=new Vector(10);
		System.out.println(v.capacity());
		for(int i=0;i<=10;i++){
			v.addElement(i);
		}
		System.out.println(v);
		v.addElement("Baba");
		System.out.println(v.capacity());
		System.out.println(v);
		
		
		System.out.println("Stack..............................");
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push(20);
		s.push("D");
		System.out.println(s);
		System.out.println(s.search("B"));
		System.out.println(s.search(20));
		System.out.println(s);
		//s.pop("B");
		System.out.println(s.pop());
		
		
		System.out.println("Enumeration..........................");
		Vector v1 = new Vector();
		for(int i=0;i<10;i++) {
			v1.addElement(i);
		}
		System.out.println(v1);
		Enumeration e = v1.elements();
		while(e.hasMoreElements()) {
			int ele =(Integer)e.nextElement();
			if(ele%2==0) {
				System.out.println(ele);
			}
		}
		System.out.println(v1);*/
		
		
	/*	System.out.println("Iterator...................");
		ArrayList l1=new ArrayList();
		for(int i=0;i<=10;i++) {
			l1.add(i);
		}
		Iterator itr= l1.iterator();
		while(itr.hasNext()) {
			int num=(Integer)itr.next();
			if(num % 2==0) {
				System.out.println(num);
			}
			else {
				itr.remove();
			}
			//System.out.println(itr);
			System.out.println(l1);
			System.out.println(itr);
			System.out.println(".........");
		}*/
		/*LinkedList l1=new LinkedList();
		l1.add("Durag");
		l1.add("HK");
		l1.add("BK");
		l1.add("venky");
		l1.add("mahesh");
		System.out.println(l1);
		ListIterator li=l1.listIterator();
		while(li.hasNext()) {
			
			String s=(String)li.next();
			if(s.equals("HK"))
				li.add("nata");
			else if(s.equals("venky"))
				li.set("RAM");
			else if(s.equals("BK"))
				li.remove();
		}
		System.out.println(l1);
				
			System.out.println(".................");
			
			Vector v=new Vector();
			
			ArrayList a= new ArrayList();
			
			LinkedList l= new LinkedList();
			
			Enumeration e =v.elements();
			
			Iterator i=v.iterator();
			ListIterator loi= v.listIterator();
			
			System.out.println(e.getClass().getName());
			System.out.println(i.getClass().getName());
			System.out.println(loi.getClass().getName());
			System.out.println("///////////////////");
			//Enumeration e =a.elements();
			
			Iterator i1=a.iterator();
			ListIterator looi= a.listIterator();
			
			System.out.println(i1.getClass().getName());
			System.out.println(looi.getClass().getName());
			System.out.println("///////////////////");
			
			Iterator i2=l.iterator();
			ListIterator loooi= l.listIterator();
			
			System.out.println(i2.getClass().getName());
			System.out.println(loooi.getClass().getName());*/
		
		
		/*	System.out.println("HashSet.......................");
			HashSet s= new HashSet();
			s.add("B");
			s.add("c");
			s.add("D");
			s.add("Z");
			s.add(null);
			System.out.println(s.add("Z"));
			System.out.println(s);
			*/
		
			/*System.out.println("Treeset////////////////////////");
			TreeSet t= new TreeSet(new MyComp());
			//t.add("Bibhu");
			//t.add(null);
			System.out.println(t.add("a"));
			System.out.println(t.add("b"));
			System.out.println(t.add("X"));
			System.out.println(t.add("b"));
			System.out.println(t);
			t.add(20);
			t.add(5);
			t.add(9);
			t.add(2);
			t.add(13);
			System.out.println(t);*/
		
		
		TreeSet t= new TreeSet();
		t.add("bRaja ");
		t.add("aRajib");
		t.add("cdurga");
		t.add("dSameer");
		t.add(3);
		System.out.println(t);
		
		}
}

//wrong code
/*class Comp implements Comparable {
	public int compareTo(Object obj1) {
		String s1=obj1.toString();
		return 0;
		//return -s1.compareTo(s2);
		//System.out.println();
		
	}
	
}*/

/*class MyComp implements Comparator{
	public int compare(Object obj1,Object obj2) {
		
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		//return -i1.compareTo(i2);
		return i2.compareTo(i1);
		//return i1.compareTo(i2);
//		if(i1 > i2)
//			return -1;
//		else if(i1<i2)
//			return +1;
//		else
//			return 0;
//		
		
	}
}
*/

