package Demo;

import org.testng.annotations.Test;

public class DemoPractice3Test {
	@Test
	public void demo3()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		String URL = System.getProperty("url");
		System.out.println(URL);
		String USERNAME = System.getProperty("username");
		System.out.println(USERNAME);
		System.out.println("its me");
	
	}
	@Test
	public void demo4()
	{
		System.out.println("HELLO");
	}
	@Test
	public void Demo5()
	{
		System.out.println("Welcome");
		System.out.println("tys");
	}
}
