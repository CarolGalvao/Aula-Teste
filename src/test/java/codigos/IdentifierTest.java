package codigos;

import org.junit.Assert;
import org.junit.Test;

public class IdentifierTest {

    @Test
    public void testIDValido(){
        Assert.assertTrue(Identifier.validaIdentificador("abc"));
    }

    @Test
    public void testIDNull(){
        Assert.assertFalse(Identifier.validaIdentificador(null));
    }

    @Test
    public void testIDVazio(){
        Assert.assertFalse(Identifier.validaIdentificador(""));
    }

    @Test
    public void testIDMaior6(){
        Assert.assertFalse(Identifier.validaIdentificador("12345678"));
    }

    @Test
    public void testIDExatamente7(){
        Assert.assertFalse(Identifier.validaIdentificador("a234567"));
    }

    @Test
    public void testIDPrimeiroDigito(){
        Assert.assertFalse(Identifier.validaIdentificador("1abc"));
    }

    @Test
    public void testIDPrimeiroEspecialCaracter(){
        Assert.assertFalse(Identifier.validaIdentificador("!abc"));
    }

    @Test
    public void testIDEspecialCaracter(){
        Assert.assertFalse(Identifier.validaIdentificador("ab1!c"));
    }

    @Test
    public void testIdApenasLetra(){
        Assert.assertTrue(Identifier.validaIdentificador("abcde"));
    }

    @Test
    public void testIdPrimeiraLetraDepoisDigitos(){
        Assert.assertTrue(Identifier.validaIdentificador("a2345"));
    }

    @Test
    public void testId1Letra(){
        Assert.assertTrue(Identifier.validaIdentificador("a"));
    }

    @Test
    public void testId6Letras(){
        Assert.assertTrue(Identifier.validaIdentificador("a1b2c4"));
    }

    @Test
    public void testIdEspecialCaracterPorUltimo(){
        Assert.assertFalse(Identifier.validaIdentificador("abcd*"));
    }

    @Test
    public void testIdEspecialCaracterPorUltimoComUmaLetra(){
        Assert.assertFalse(Identifier.validaIdentificador("a@"));
    }

}
