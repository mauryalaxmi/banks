import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LoanAccountTest {
	LoanAccount l1;
	@Before
	public void setUp() throws Exception {
		l1=new  LoanAccount(10001,"ananya",10000);
	}

	@Test
	public void testPayInstalment() {
		//fail("Not yet implemented");
		l1.payInstalment(3000);
		assertEquals(7000,l1.getBalance());
	}

}
