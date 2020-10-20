package roh.aggregation;

import java.util.List;

public class Institute {
	   
    String instituteName; 
    private List<Department> departments;
	
	
	public Institute(String instituteName, List<Department> departments) {
		super();
		this.instituteName = instituteName;
		this.departments = departments;
	}

	public List<Department> getDepartments() {
		return departments;
	}
	 public int getTotalStudentsInInstitute() 
	    { 
	    int noOfStudents = 0; 
	    List<Student> students;
	    for(Department dept :departments) {
	    	if(dept.name.equals("ee"))
	    	{
	    	students=dept.getStudents();
	    	for(Student stu:students) {
	    		noOfStudents++;
	    	}
	    }
	    }
	    return noOfStudents;
	    }
    
}
