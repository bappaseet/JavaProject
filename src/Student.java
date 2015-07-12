
public class Student implements Comparable{
	
	private String name;
	
	private int roll;
	
	public Student(int roll, String name){
		this.name=name;
		this.roll =roll;
	}

	synchronized String getName() {
		return name;
	}

	synchronized int getRoll() {
		return roll;
	}

	synchronized void setName(String name) {
		this.name = name;
	}

	synchronized void setRoll(int roll) {
		this.roll = roll;
	}
	
	

	
	@Override
	public int hashCode() {
		
		return roll;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
