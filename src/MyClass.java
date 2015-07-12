import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

 class Employee //implements Comparable<Employee>
 {
   int salary;
	String Fathername;
    Employee(int s, String f){  
	   this.salary=s;
	   this.Fathername=f;
   }
    

    int getSalary() {
		return salary;
	}


	 String getFathername() {
		return Fathername;
	}

     void setSalary(int salary) {
		this.salary = salary;
	}


     void setFathername(String fathername) {
		Fathername = fathername;
	}


public int compareTo(Employee obj) {
	// TODO Auto-generated method stub
	int sal1 = this.salary;
	Employee emp=(Employee)obj;
	int sal2 = emp.salary;
	String father=emp.Fathername;
	if(sal1<sal2)
		return 1;
	if(sal1>sal2)
		return -1;
	if(sal1==sal2)
		return -this.Fathername.compareTo(father);
	else
	 return sal2;

}

   public void hello(){
	   System.out.println("hello employee");
   }
   
@Override
public String toString() {
	return "Employee [salary=" + salary + ", Fathername=" + Fathername + "]";
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (Fathername == null) {
		if (other.Fathername != null)
			return false;
	} else if (!Fathername.equals(other.Fathername))
		return false;

	return true;
}


}
class Salesman{
	int income;
	String name;
	
	 Salesman(int i, String n){
		   this.income=i;
		   this.name=n;
	   }
}
 public class MyClass{
  public static void main(String args[]){
	Employee e1 = new Employee(10,"manoj");
	Employee e2 = new Employee(20,"Kiran");
	Employee e3 = new Employee(40,"Harbhajan");
	Employee e4 = new Employee(10,"tiwari");
	Employee e5 = new Employee(10,"tiwari");

	/*Salesman s1 = new Salesman(14325,"Sachin");
	Salesman s2 = new Salesman(54623,"Sourav");
	Salesman s3 = new Salesman(65474,"Rahul");*/
//	Set<Employee> objectList = new TreeSet<Employee>(new MyComparator());
	List<Employee> objectList = new ArrayList<Employee>();

	objectList.add(e1);
	objectList.add(e2);
	objectList.add(e3);
	objectList.add(e4);
	objectList.add(e5);

	for(int i=0 ; i< objectList.size(); i++){
		for(int j=i+1;j<objectList.size() ;j++){
			if(objectList.get(i).equals(objectList.get(j)))
					{
				objectList.remove(i);
			}
		}
	
		
	}

	//Collections.sort(objectList,new MyComparator());
	
	System.out.println(objectList);
	
	/*objectList.add(s1);
	objectList.add(s2);
	objectList.add(s3);*/
	
}


}