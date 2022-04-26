import org.junit.jupiter.api.Assertion;
import org.junit.jupiter.api.Test;


public class TestEjercicioContarLetras {


    @Test
    public void testContarLetrasSinLetras(){
        String[] input = {};
        String outputEsperado = "{}";
        String outputActual = EjercicioContarLetras.(input);
        Assertions.assertEquals(outputEsperado, outputActual);
        System.out.println("Test ejecutado");
    }

    @Test
    public void testContarLetrasIguales(){
        String[] input = {"Holaaa!"};
        String outputEsperado = "{h=1, o=1, l=1, a=3, !=1}";
        String outputActual = EjercicioContarLetras.(input);
        Assertions.assertEquals(outputEsperado, outputActual);
        System.out.println("Test ejecutado");
    }

    @Test
    public void testContarLetrasSeparadas(){
        String[] input = { "Holah!"};
        String outputEsperado = "{h=2, o=1, l=1, a=1, !=1}";
        String outputActual = EjercicioContarLetras.(input);
        Assertions.assertEquals(outputEsperado, outputActual);
        System.out.println("Test ejecutado");
    }

    @Test
    public void testContarLetraUnica(){
        String[] input = { "H"};
        String outputEsperado = "{h=1}";
        String outputActual = EjercicioContarLetras.(input);
        Assertions.assertEquals(outputEsperado, outputActual);
        System.out.println("Test ejecutado");
    }
}
