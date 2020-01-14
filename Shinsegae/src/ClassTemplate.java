
public class ClassTemplate {
	public String name = "syChoi";	// 자바는 스트링에는 꼭 쌍따옴표 사용따리
	public int age = 28;
	public char gender = 'm';
	public double height = 187.00;
	
	public void printStr() {
		System.out.println(name);
		System.out.println("문자열");
	}
	
	public int intMethod() {
		return age;
	}
	
	public String checkGender(char gender) {
		return null;
	}
	
	public void sum(int x, int y) {
		
	}
	
	public char getGender() {
		return gender;
	}
	
	public double getHeight() {
		return height;
	}
}
