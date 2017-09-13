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
	ArrayList ar=new ArrayList(Arrays.asList(Student));
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		
			if(ar.contains(null))
				{
				throw new illegalArgumentException();
				}
			
			
			
			System.out.println(ar);
			
           
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		ar.
		
			
		
				
				
			
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		if(ar.contains(index))
		{
		System.out.println(ar.get(student));
		}
		
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		
	ar.addFirst(student);
	}
	

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		
	ar.addLast(student);
	
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		
	ar.addAt(index,student);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		
	ar.remove(index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		
	ar.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		
	for(int i=index;i<ar.size();i++)
	{
	ar.remove(index);
	}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		
	int t=ar.get(student);
	for(int i=t;i<ar.size();i++)
	{
	ar.remove(t);
	}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		
		
	for(int i=index;i<=index;i--)
	{
	ar.remove(index);
	}
	
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		
		int index=ar.get(student);
		for(int i=index;i<=index;i--)
	{
	ar.remove(index);
	}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		
	ar.sort();
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		
	
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		
	int a=ar.get(firstDate);
	int b=ar.get(lastDate);
	for(int i=a+1;i<b;i++)
	{
	ar.get(i);
	}
	
	
	
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		
	
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		
	int n=ar.get(student);
	System.out.println(ar.get(n+1));
		return null;
	}
}
