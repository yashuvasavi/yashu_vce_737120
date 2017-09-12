import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	List<Student> al=new ArrayList<Student>();
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		Student student1=new Student();
for(int i=0;i<ArrayList.size()-1;i++)		
student1=al.get(i);	
		return student1;
	}

	@Override
	public void setStudents(Student[] students) {
		al.set(students);
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
	Student student1=new Student();				
student=al.get(i);	

		return student1;
	}

	@Override
	public void setStudent(Student student, int index) {
		
	
		al.add(index,student);

	@Override
	public void addFirst(Student student) {
		
	al.add(0,student);
	}

	@Override
	public void addLast(Student student) {
		
		al.add(ArrayList.size()-1,student);		
	}

	@Override
	public void add(Student student, int index) {
		al.add(index,student);
	}

	@Override
	public void remove(int index) {
		al.remove(index);
	}

	@Override
	public void remove(Student student) {
	for(int i=0;i<ArrayList.size()-1;i++)		
	al.remove(i);

	}

	@Override
	public void removeFromIndex(int index) {
	
	al.remove(index);
	}

	@Override
	public void removeFromElement(Student student) {
		
	}

	@Override
	public void removeToIndex(int index) {
	Student student1=new Student();	
	}

	@Override
	public void removeToElement(Student student) {
		Student student1=new Student();	
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		Student student1=new Student();	
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
	Student student1=new Student();	
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
	Student student1=new Student();	
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		Student student1=new Student();	
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		Student student1=new Student();	

		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		al.get(
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		student=al.get(index++);
		return null;
	}
}
