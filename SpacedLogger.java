package Week05Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String input) {
		
		String word = "";
		for (int i = 0; i < input.length(); i++) {
			word += input.charAt(i) + " ";
		}
		System.out.println(word);
		
	}

	@Override
	public void error(String input) {
		
		String word = "";
		for (int i = 0; i < input.length(); i++) {
			word += input.charAt(i) + " ";
		}
		System.out.println("ERROR: " + word);
		
	}

}
