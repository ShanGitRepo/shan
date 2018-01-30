import java.util.Properties;

public class HelloGit {

	
	private static String s = new String("Shan");
	static String b = s.toString();
	static HelloGit sf = new HelloGit();
	static Properties p = new Properties();

	
	public static void main(String[] args) {
		//Commented now for testing.
		System.out.println("Hello Git ..!!!");
		System.out.println("Modififed now...!!!");
		System.out.println("Changes ...");//shan changed now
	}
	
	void meth()
	
	{
		sf.toString();
		p.getProperty("testing");
	}

}
