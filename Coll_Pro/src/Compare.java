import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Compare {
public static void main(String[] args) {
	//TreeSet ts= new TreeSet(new MyComp());
	/*ts.add("Abhishek");
	ts.add("Ab");
	ts.add("Abc");
	ts.add("Vinay");
	ts.add("Durga");
	ts.add("Bibhu");
	ts.add("Suraj");
	ts.add(10);
	//ts.add(0);
*/	
	/*Employee e1=new Employee("Naga",100);
	Employee e2=new Employee("Balaiya",50);
	Employee e3=new Employee("Chiru",200);
	Employee e4=new Employee("Venki",150);
	Employee e5=new Employee("Nag",100);
	TreeSet t= new TreeSet();
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	t.add(e5);
	System.out.println(t);
	TreeSet t1= new TreeSet(new MyComparator());
	t1.add(e1);
	t1.add(e2);
	t1.add(e3);
	t1.add(e4);
	t1.add(e5);
	System.out.println(t1);
	System.out.println("After comparing the treeset : "+ t1);
}
}
class Employee implements Comparable {
	String name;
	int eid;
	Employee(String name,int eid){
		this.name=name;
		this.eid=eid;
	}
	public String toString() {
		return name+"--"+eid;
	}
	public int compareTo(Object obj1) {
		//String s1= obj1.toString();
		//return s2.compareTo(s1);
	Set s1=	int eid1=this.eid;
		Employee e=(Employee)obj1;
		int eid2=e.eid;
		if(eid1<eid2) {
			return -1;
		}else if(eid1>eid2) {
			return 1;
		}else return 0;
	}*/
	
	HashMap m =new HashMap();
	m.put("Abhishek", 100);
	m.put("_Ralaiya",150);
	m.put("Vinay",300);
	m.put("Sanjay",250);
	m.put("Bashmi",200);
	System.out.println(m);
	/*System.out.println(m.put("Vinay", 350));
	Set s=m.keySet();
	System.out.println(s);
	Collection c=m.values();
	System.out.println(c);
	Set s1=m.entrySet();
	System.out.println(s1);
	Iterator itr=s1.iterator();
	while(itr.hasNext()){
		Map.Entry m1=(Map.Entry)itr.next();
		System.out.println(m1.getKey()+".........."+m1.getValue());
		if(m1.getKey().equals("sanjay"))
			m1.setValue(550);*/
	//}
	//System.out.println(m);
	//System.out.println(m);
}
}

/*class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Employee e1= (Employee)obj1;
		Employee e2= (Employee)obj2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
}*/