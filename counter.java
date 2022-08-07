public class Student{
	
	String name;
	int roll;
	double marks;
	

	public Student(String name , int roll , double marks){
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	public static boolean  isEligible(int rollno){
		if(rollno >= 60)
			return true;
		else
			return false;
	}

	public static void main(String[] args){
		Student st = new Student("abc", 01 , 67.89);
		System.out.println(st.isEligible());
		System.out.println(isEligible(57));

	}

}