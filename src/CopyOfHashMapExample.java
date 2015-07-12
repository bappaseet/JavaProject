import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CopyOfHashMapExample {
	public static void main(String args[]){
		//Employee myclass = new Employee();
		Map<Student,Employee> employeeMap = new HashMap<Student,Employee>();
		Employee employee1 = new Employee(231,"tiger");
		Employee employee2 = new Employee(231,"rabbit");
		Employee employee3 = new Employee(231,"abhl");
		Employee employee4 = new Employee(231,"bbhjit");
		employeeMap.put(new Student(1,"pooja"),employee1);
		employeeMap.put(new Student(1,"sudip"),employee2);
		employeeMap.put(new Student(2,"roghu"),employee3);
		employeeMap.put(new Student(2,"bapu"),employee4);
		System.out.println(employeeMap);
		Set<Student> keys = employeeMap.keySet();
	        for(Student key: keys){
	            System.out.println("***************" +key);
	            System.out.println("Value "+ employeeMap.get(key) );
	        }
	        //getting value for the given key from hashmap
	        Set<Entry<Student, Employee>> entires = employeeMap.entrySet();
	        for(Entry<Student,Employee> ent:entires){
	            System.out.println(ent.getKey()+" ==> "+ent.getValue());
	        }
	        //getting value for the given key from hashmap
	        System.out.println("Value of second: "+employeeMap.get("rabbit"));
	        System.out.println("Is HashMap empty? "+employeeMap.isEmpty());
	Map treeMapEx = new TreeMap(employeeMap);
	System.out.println(treeMapEx);
	
	}
}