import java.util.regex.*;

class RegexExample1{
	public static void main(String[] args) {
		String content = "I am noob " + "from runoob.com.";

		String pattern = ".*runoob.*";

		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("Does it contain 'runoob'subString?" + isMatch);
	}
}