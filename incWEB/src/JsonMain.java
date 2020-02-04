import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sinc.intern.insa.model.vo.UserVO;

public class JsonMain {

	public static void main(String[] args) {
		//obj();
		//list();
		map();
	}
	
	public static void map() {
		Map<String, Collection> map = new HashMap<>();
		UserVO user = new UserVO("jslim", "jslim", "임정섭", 2000, "SB");
		List<Object> list = new ArrayList<>();
		list.add(user);list.add(user);list.add(user);
		
		List<Object> list2 = new ArrayList<>();
		list2.add(user);list2.add(user);list2.add(user);
		
		map.put("list", list); map.put("list2", list2);
		JSONObject jobj = new JSONObject(map);
		System.out.println(jobj.toString());
	}
	
	public static void list() {
		UserVO user = new UserVO("jslim", "jslim", "임정섭", 2000, "SB");
		List<Object> list = new ArrayList<>();
		list.add(user);list.add(user);list.add(user);
		JSONArray ary = new JSONArray(list);
		System.out.println(ary.toString());
	}
	
	public static void obj() {
		UserVO user = new UserVO("jslim", "jslim", "임정섭", 2000, "SB");
		JSONObject jobj = new JSONObject(user);
		System.out.println(jobj.toString() );
	}

}
