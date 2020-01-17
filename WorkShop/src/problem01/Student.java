package problem01;

// Student
public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
		
	}
	
	public Student(String name, int korean, int english, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.science = science;
	}
	
	public String getName() {
		return name;
	}
	
	public double getAvg() {
		return (this.korean + this.english + this.math + this.science) / 4;
	}
	
	public String getGrade() {
		int score = (int)(getAvg());
		switch ((int)(score / 10)) {
			case 9 : {
				return "A학점";
			}
			case 7: case 8 : {
				return "B학점";
			}
			case 5: case 6 : {
				return "C학점";
			}
			case 3: case 4 : {
				return "D학점";
			}
			default : {
				return "F학점";
			}
		}
	}
	
}
