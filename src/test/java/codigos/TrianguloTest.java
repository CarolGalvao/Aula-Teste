package codigos;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class TrianguloTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testEquilatero() throws  LadoInvalidoException{
        String resultado = Triangulo.classificaTriangulo(5,5,5);
        assertEquals("EQUILATERO",resultado);
    }

    @Test
    public void testIsoscelesAB() throws  LadoInvalidoException{
        String resultado = Triangulo.classificaTriangulo(5,5,4);
        assertEquals("ISOSCELES",resultado);
    }

    @Test
    public void testIsoscelesAC() throws  LadoInvalidoException{
        String resultado = Triangulo.classificaTriangulo(5,4,5);
        assertEquals("ISOSCELES",resultado);
    }

    @Test
    public void testIsoscelesBC() throws  LadoInvalidoException{
        String resultado = Triangulo.classificaTriangulo(5,4,4);
        assertEquals("ISOSCELES",resultado);
    }

    @Test
    public void testEscaleno() throws  LadoInvalidoException{
        String resultado = Triangulo.classificaTriangulo(5,6,7);
        assertEquals("ESCALENO",resultado);
    }

    @Test
    public void testLadoAInvalido() throws LadoInvalidoException{
        thrown.expect(LadoInvalidoException.class);
        thrown.expectMessage("lado invalido");
        Triangulo.classificaTriangulo(-5,5,5);
    }

    @Test
    public void testLadoCInvalido() throws LadoInvalidoException{
        thrown.expect(LadoInvalidoException.class);
        thrown.expectMessage("lado invalido");
        Triangulo.classificaTriangulo(5,5,-1);
    }

    @Test
    public void testLadoBInvalido() throws LadoInvalidoException{
        thrown.expect(LadoInvalidoException.class);
        thrown.expectMessage("lado invalido");
        Triangulo.classificaTriangulo(5,-1,6);
    }

    @Test
    public void testLadoAZero() throws LadoInvalidoException{
        thrown.expect(LadoInvalidoException.class);
        thrown.expectMessage("lado invalido");
        Triangulo.classificaTriangulo(0,5,5);
    }

    @Test
    public void testLadoCZero() throws LadoInvalidoException{
        thrown.expect(LadoInvalidoException.class);
        thrown.expectMessage("lado invalido");
        Triangulo.classificaTriangulo(5,5,0);
    }

    @Test
    public void testLadoBZero() throws LadoInvalidoException{
        thrown.expect(LadoInvalidoException.class);
        thrown.expectMessage("lado invalido");
        Triangulo.classificaTriangulo(5,0,6);
    }

    @Test
    public void testNaoFormaTrianguloA() throws LadoInvalidoException{
        String resultado =Triangulo.classificaTriangulo(5,1,2);
        assertEquals("NAO FORMA TRIANGULO",resultado);
    }

    @Test
    public void testNaoFormaTrianguloB() throws LadoInvalidoException{
        String resultado =Triangulo.classificaTriangulo(1,10,2);
        assertEquals("NAO FORMA TRIANGULO",resultado);
    }

    @Test
    public void testNaoFormaTrianguloC() throws LadoInvalidoException{
        String resultado =Triangulo.classificaTriangulo(1,1,6);
        assertEquals("NAO FORMA TRIANGULO",resultado);
    }

    @Test
    public void testNaoFormaTrianguloAIgual() throws LadoInvalidoException{
        String resultado =Triangulo.classificaTriangulo(5,3,2);
        assertEquals("NAO FORMA TRIANGULO",resultado);
    }

    @Test
    public void testNaoFormaTrianguloBIgual() throws LadoInvalidoException{
        String resultado =Triangulo.classificaTriangulo(5,10,5);
        assertEquals("NAO FORMA TRIANGULO",resultado);
    }

    @Test
    public void testNaoFormaTrianguloCIugal() throws LadoInvalidoException{
        String resultado =Triangulo.classificaTriangulo(3,3,6);
        assertEquals("NAO FORMA TRIANGULO",resultado);
    }

}
