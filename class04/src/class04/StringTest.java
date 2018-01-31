package class04;

public class StringTest {

	public static String stress(String word) {
		String result = "";
		
		int str_index = word.indexOf("'");
	
		result += word.substring(0, str_index - 1);
		result += word.substring(str_index - 1, str_index).toUpperCase();
		result += word.substring(str_index+1);
		
		return result;
	}
	
	public static void main(java.lang.String[] args) {
		System.out.println(stress("succe'ss"));
	}

}
