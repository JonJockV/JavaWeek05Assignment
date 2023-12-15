package Week05Assignment;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String input) {
		
		System.out.println("***" + input + "***");
		
	}

	@Override
	public void error(String input) {
		
		String word = "***Error: " + input + "***";
		for (int i = 0; i < 2; i++) {
			for (int x = 0; x < word.length(); x++) {
			System.out.print("*");
			}
			if (i < 1) {
				System.out.println("\n" + word);
			} else if (i == 1) {
				System.out.println();
			}
		
		}
		
	}

}
