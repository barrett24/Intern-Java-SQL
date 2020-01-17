import java.util.ArrayList;
import java.util.Scanner;

import problem01.Student;

public class StudentMain {
	
	public static void main(String[] args) {
		ArrayList<Student> studentAry = new ArrayList<Student>();
		//Scanner scanner = new Scanner(System.in);
		//int count = 3;
		
		Student stu01 = new Student("Kim", 90, 80, 70);
		studentAry.add(stu01);
		Student stu02 = new Student("Ki", 90, 80, 70);
		studentAry.add(stu02);
		Student stu03 = new Student("K", 90, 80, 70);
		studentAry.add(stu03);
		
		for (Student st : studentAry) {
			System.out.print(st.getName());
			System.out.print(" 평균: " + st.getAvg());
			System.out.print(" 학점: " + st.getGrade());
			System.out.println();
		}
		
	}

}
