import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import com.sinc.intern.oop.model.vo.PersonVO;
import com.sinc.intern.oop.sub.model.vo.EmployeeVO;
import com.sinc.intern.oop.sub.model.vo.StudentVO;
import com.sinc.intern.oop.sub.model.vo.TeacherVO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionMain {

	public static void printList(List<PersonVO> list) {
		for (PersonVO temp : list) {
			System.out.println(temp.perInfo());
		}
	}
	
	public static void main(String[] args) {
		// 자료구조화된 배열
		// 부모타입이기 떄문에 자식도 담기 가능, 매개변수의 다형성
		List<PersonVO> list = new Vector<PersonVO>();
		list.add(new StudentVO());
		list.add(new TeacherVO());
		list.add(new EmployeeVO());
		printList(list);
		// Object 내부에 toString함수가 있다, 따라서 문자열화가 가능하다
		
		Map<String, List<PersonVO>> map = new HashMap<String, List<PersonVO>>();
		
		StudentVO stu = new StudentVO("최시영", 28, 'm', "14-71013200");
		TeacherVO tea = new TeacherVO("임정섭", 48, 'm', "java");
		EmployeeVO emp = new EmployeeVO("인턴십", 37, 'f', "Intern");
		
		List<PersonVO> insa = new ArrayList<PersonVO>();
		insa.add(stu); insa.add(tea); insa.add(emp);
		
		List<PersonVO> sales = new ArrayList<PersonVO>();
		sales.add(stu); sales.add(tea); sales.add(emp);
		
		map.put("insa", insa);
		map.put("sales", insa);
		printMap(map);
		
		Map<String, String> setMap = new HashMap<String, String>();
		setMap.put("id", "shinsegae");
		setMap.put("pwd", "siyoung");
		setMap.put("name", "siyoung");
		
		Set<String> keys = setMap.keySet();
		for (String temp : keys) {
			System.out.println(temp + "\t" + setMap.get(temp));
		}
		
		Iterator<String> setIte = keys.iterator();
		while (setIte.hasNext()) {
			String key = setIte.next();
			System.out.println("key = " + key + ", value = " + setMap.get(key));
		}
		
	}
	
	public static void printMap(Map<String, List<PersonVO>> map) {
		List<PersonVO> insaList = map.get("insa");
		Iterator<PersonVO> ite = insaList.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next().perInfo());
		}
		
		List<PersonVO> salesList = map.get("sales");
		Iterator<PersonVO> ite2 = salesList.iterator();
		while(ite2.hasNext()) {
			System.out.println(ite2.next().perInfo());
		}
	}
}
