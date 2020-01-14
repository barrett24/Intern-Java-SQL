import com.sinc.intern.oop.sub.model.vo.EmployeeVO;
import com.sinc.intern.oop.sub.model.vo.StudentVO;
import com.sinc.intern.oop.sub.model.vo.TeacherVO;

public class InheritanceMain {

	public static void main(String[] args) {
		// 명시적인 초기화
		StudentVO stu = new StudentVO("최시영", 28, 'm', "14-71013200");
		System.out.println(stu.stuInfo());
		
		TeacherVO tea = new TeacherVO("임정섭", 48, 'm', "java");
		System.out.println(tea.teaInfo());
		
		EmployeeVO emp = new EmployeeVO("인턴십", 37, 'f', "Intern");
		System.out.println(emp.empInfo());
		
		byte x = 10, y =20, z = 0;
		z = (byte)(x + y); // 컴파일러의 정수형의 기본 연산 자료형은 int이기 때문에 오류따리
		System.out.println(z);
		
		float floatValue = 12.235f; // 컴파일러의 실수형 기본 연산 자료형은 double float은 뒤에 f
		
		int intVal = 65;
		char charVal = (char)intVal;
		System.out.println(charVal);
	}

}
