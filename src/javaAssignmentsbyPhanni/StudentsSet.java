package javaAssignmentsbyPhanni;

import java.util.HashSet;
import java.util.Set;

public class StudentsSet 
{	
	  private int subj1;
	  private int subj2;
	  private int subj3;
	  private int subj4;
	   

	public static void main(String[] args) 
	{
		StudentsSet s1 = new StudentsSet();
		s1.subj1=50;
		s1.subj1=80;
		s1.subj1=70;
		s1.subj1=60;
		
		Set<Object> a = new HashSet<Object>();
		a.add(s1);
		
		Addition(a);

	}
	
	
	public static int Addition(Set s)
	{
		
		return 0;
	}

}
