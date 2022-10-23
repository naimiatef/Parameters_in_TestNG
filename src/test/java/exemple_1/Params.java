package exemple_1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params {

	/*
	 * Syntaxe : @Parameters ({"a", "b"}) où a et b sont les valeurs qui passent à
	 * la fonction.
	 * 
	 * https://www.toolsqa.com/testng/testng-parameters/
	 */

	/*
	 * Remarque : Les paramètres TestNG sont exécutés via le fichier XML TestNG et
	 * non directement à partir des fichiers de cas de test.
	 */

	@Test
	@Parameters({ "val1", "val2" })
	public void somme(int v1, int v2) {
		int res = v1 + v2;
		System.out.println("la somme des deux valeurs est " + res);
	}

}
