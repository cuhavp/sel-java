package modules;

import org.testng.annotations.Test;
public class PriorityTest {
	@Test(priority=1)
	public void registerAccount()
	{
		System.out.println("First register your account");
	}
	@Test(priority=2)
	public void sendEmail()
	{
		System.out.println("Send email after login");
	}
	@Test
	public void login()
	{
		System.out.println("Login to the account after registration");
	}
}
