import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import junit.runner.Version;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

class PruebasUnitariasCalculadora {
	
	private Calculadora c1;
	private Calculadora c2 = new Calculadora(10,2);
	
	@BeforeEach
	public void antesQue() { //Este método se ejecuta antes de cada método test
		c1 = new Calculadora(21,2);
		//System.out.println("JUnit version is: " + Version.id());
	}
	
	@AfterEach
	public void despuesQue() { //Este método se ejecuta después de cada método test
		c1.resetResultado();
		c2.resetResultado();
	}
	

	/*COMPARANDO LOS METODOS GETTING DE LA CLASE Calculadora*/
	@Test 
	//Esta anotación indica que es un método de test
	public void esNotNullgetNumero1(){ //Comprueba que no devuelva Null el número 1
		assertNotNull(c2.getNumero1());
	}
	
	@Test
	public void esNotNullgetNumero2(){ //Comprueba que no devuelva Null el número 1
		assertNotNull(c2.getNumero2());
	}
	
	@Test
	public void esNotNullgetResultado(){ //Comprueba que no devuelva Null el resultado
		assertNotNull(c2.getResultado());
	}
	
	/*COMPARANDO LOS METODOS DE OPERACIONES ARITMETICAS*/
	@Test
	public void sumaTest() { //Testea el método suma
		assertEquals(12,c2.suma());
	}
	
	@Test
	public void suma1Test() { //Testea el método suma
		assertEquals(23,c1.suma());
	}
	
	@Test
	public void restaTest() { //Testea el método resta
		assertEquals(8,c2.resta());
	}
	
	@Test
	public void multiplicarTest() { //Testea el método multiplicar
		assertEquals(20,c2.multiplicar());
	}
	
	@Test
	public void dividirTest() { //Testea el método dividir
		assertEquals(5,c2.dividir());
	}
	
	@Test
	public void moduloTest() { //Testea el método modulo
		assertEquals(0,c2.modulo());
	}
	
	@Disabled
	@Test
	@Timeout(value = 3000, unit = TimeUnit.MILLISECONDS)
	public void time () throws InterruptedException{
		int i = c1.time();
	}
		
	
}
