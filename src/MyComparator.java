import java.util.Comparator;

/**
 * 
 */

/**
 * @author Bappa
 *
 */
public class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		// TODO Auto-generated method stub
		 int sal1=obj1.salary;
		 int sal2=obj2.salary;	
		if(sal1<sal2)
			return 1;
		if(sal1>sal2)
			return -1;
		else
		 return 0;
	}

}
