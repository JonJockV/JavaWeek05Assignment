package Week05Assignment;

public class App {

	public static void main(String[] args) {
		
		Logger al = new AsteriskLogger();
		al.log("Fellow");
		System.out.println("--------------------------");
		al.error("Lower");
		System.out.println("--------------------------");
		
		Logger sl = new SpacedLogger();
		sl.log("Higher");
		System.out.println("--------------------------");
		sl.error("Including");
		
	}

}
