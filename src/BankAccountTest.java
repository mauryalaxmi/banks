import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	BankAccount b1;
	@Before
	public void setUp() throws Exception {
		b1 = new BankAccount(1000,"pooja",2000);
	}

	@Test
	public void testDeposit() {
		//fail("Not yet implemented");
		b1.deposit(500);
		assertEquals(2500,b1.getBalance());
	}

	@Test
	public void testWithdraw() {
		//fail("Not yet implemented");
		b1.withdraw(500);
		assertEquals(1500,b1.getBalance());
	}

}
