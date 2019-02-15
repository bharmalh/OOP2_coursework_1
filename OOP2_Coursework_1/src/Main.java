import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Please enter the name of the student");
		name=scan.nextLine();

		int num_of_courses = 6;
		String [] course_unit=new String[num_of_courses];
		int [] marks=new int[num_of_courses];
		double [] gpa=new double[num_of_courses];
		String[] grade=new String[num_of_courses];
		double cgpa = 0.0;
	
		for(int i=0;i<num_of_courses;i++) {
			System.out.println("Please enter the name of the course unit");
			course_unit[i]= scan.next();
			System.out.println("Please enter the marks for "+course_unit[i]);
			marks[i]=scan.nextInt();

			if (marks[i]>=80 && marks[i]<=100)
			{
				grade[i]="A";
				gpa[i]=5.0;
			}
			else if(marks[i]>=75 && marks[i]<80) 
			{
				grade[i]="B+";
				gpa[i]=4.5;
			}

			else if(marks[i]>=70 && marks[i]<75) 
			{
				grade[i]="B";
				gpa[i]=4.0;
			}

			else if(marks[i]>=65 && marks[i]<70) 
			{
				grade[i]="C+";
				gpa[i]=3.5;
			}

			else if(marks[i]>=60 && marks[i]<65) 
			{
				grade[i]="C";
				gpa[i]=3.0;
			}

			else if(marks[i]>=55 && marks[i]<60) 
			{
				grade[i]="D+";
				gpa[i]=2.5;
			}

			else if(marks[i]>=50 && marks[i]<55) 
			{
				grade[i]="D";
				gpa[i]=2.0;
			}

			else if(marks[i]>=0 && marks[i]<50) 
			{
				grade[i]="F";
				gpa[i]=0.0;
			}
		
			else {
			System.out.println("ERROR! Enter the information for "+course_unit[i]+" again");
			i--;
			}
			
	
		}

		for(int k=0;k<num_of_courses;k++) {
			cgpa=cgpa+gpa[k];
		}
	
		cgpa=cgpa/num_of_courses;

		System.out.println("\n \n \n Dear "+name+" your result is as follows:");
		for(int k=0;k<num_of_courses;k++) 
		{
			System.out.println("\n \n \n ========== \t"+course_unit[k]+"\t ========== \n Marks: "+marks[k]+"\n Grade: "+grade[k]+"\n GPA: "+gpa[k]+"\n = = = = = = = = = = = = = = = = = = \n");
		}
		System.out.print("Your CGPA is: "+cgpa);
	}
}
