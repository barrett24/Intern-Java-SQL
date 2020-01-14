import com.sinc.intern.oop.model.vo.PersonVO;
import com.sinc.intern.oop.sub.model.vo.EmployeeVO;
import com.sinc.intern.oop.sub.model.vo.StudentVO;
import com.sinc.intern.oop.sub.model.vo.TeacherVO;

public class ObjectAryMain {
	private static int IDX = 0;
	
	public static void main(String[] args) {
		PersonVO [] perAry = new PersonVO[10];
		
		StudentVO stu = new StudentVO("최시영", 28, 'm', "14-71013200");
		TeacherVO tea = new TeacherVO("임정섭", 48, 'm', "java");
		EmployeeVO emp = new EmployeeVO("인턴십", 37, 'f', "Intern");
		
		// 타입미스가 발생하지 않는데
		// 자식은 내부적으로 부모타입으로 형변환 될 수 있다.
		//perAry[0] = stu;
		//perAry[1] = tea;
		//perAry[2] = emp;
		
		setAry(stu, perAry); 
		setAry(tea, perAry); 
		setAry(emp, perAry);
		
		printAry(perAry);
	}
	
	public static void printAry(PersonVO [] ary) {
		for (PersonVO obj : ary) {
			if (obj == null) {
				break;
			}
			// 오버라이딩된 객체의 매서드
			System.out.println(obj.perInfo());
		}
	}
	
	public static void setAry(PersonVO per, PersonVO [] perAry) {
		perAry[IDX++] = per;
	}
}
