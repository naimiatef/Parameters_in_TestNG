package exemple_2;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params_optionel {

	@Test
	@Parameters("message")
	public void OP(@Optional("Paramètre facultatif sélectionné") String message) {
		System.out.println(message);
	}

}
