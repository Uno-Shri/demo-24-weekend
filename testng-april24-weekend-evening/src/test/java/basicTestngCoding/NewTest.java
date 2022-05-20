package basicTestngCoding;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {

	@BeforeMethod  

	public void pre()
	{
		System.out.println("Pre Act - ");
	}

	@AfterMethod

	public void post()
	{
		System.out.println("Post Act - ");
	}

	@Test

	public void updatePwd()
	{
		System.out.println("updatepwd");
	}

	@Test

	public void updateName()
	{
		System.out.println("update Name");
	}


	public static void main(String[] args) {

		NewTest obj =new NewTest();
		obj.updatePwd();
		obj.updateName();

	}
}