import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapExample {
	public static void main(String args[]){
		//Employee myclass = new Employee();
		Map<String,Employee> employeeMap = new HashMap<String,Employee>();
		Employee employee1 = new Employee(231,"tiger");
		Employee employee2 = new Employee(231,"rabbit");
		Employee employee3 = new Employee(231,"abhl");
		Employee employee4 = new Employee(231,"bbhjit");
		Employee employee5 = new Employee(231,"bbhjit");
		System.out.println(employee4.equals(employee5));

		employeeMap.put(employee1.getFathername(),employee1);
		employeeMap.put(employee2.getFathername(),employee2);
		employeeMap.put(employee3.getFathername(),employee3);
		employeeMap.put(employee4.getFathername(),employee4);
		employee4.setFathername("test");
		System.out.println(employeeMap.size());


		System.out.println(employeeMap);
		Set<String> keys = employeeMap.keySet();
	        for(String key: keys){
	            System.out.println("***************" +key);
	            System.out.println("Value "+ employeeMap.get(key) );
	        }
	        //getting value for the given key from hashmap
	        Set<Entry<String, Employee>> entires = employeeMap.entrySet();
	        for(Entry<String,Employee> ent:entires){
	            System.out.println(ent.getKey()+" ==> "+ent.getValue());
	        }
	        //getting value for the given key from hashmap
	        System.out.println("Value of second: "+employeeMap.get("rabbit"));
	        System.out.println("Is HashMap empty? "+employeeMap.isEmpty());
	Map treeMapEx = new TreeMap(employeeMap);
	System.out.println(treeMapEx);
	
	}
}