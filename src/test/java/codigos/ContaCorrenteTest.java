package codigos;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class ContaCorrenteTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void saqueZero() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Valor invalido");
        ContaCorrente conta = new ContaCorrente(100,100);
        conta.saque(0);
    }

    @Test
    public void saqueMaiorSaldoMaisLimite() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Saldo Insuficiente");
        ContaCorrente conta = new ContaCorrente(100,100);
        conta.saque(250);
    }

    @Test
    public void saqueIugalSaldoMaisLimite() throws Exception{
        ContaCorrente conta = new ContaCorrente(100,100);
        conta.saque(200);
        float saldo = conta.getSaldo();
        assertEquals(-100F, saldo);
    }

    @Test
    public void saqueInvalido() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Valor invalido");
        ContaCorrente conta = new ContaCorrente(100,100);
        conta.saque(-10);
    }

    @Test
    public void saqueValorValido() throws Exception{
        ContaCorrente conta = new ContaCorrente(10,100);
        float saldo = conta.saque(0.5F);
        assertEquals(9.5F, saldo);
    }

    @Test
    public void saqueReturnSaldo() throws Exception{
        ContaCorrente conta = new ContaCorrente(100,100);
        float saldo = conta.saque(50);
        assertEquals(50.0F, saldo);
    }

    @Test
    public void getSaldo(){
        ContaCorrente conta = new ContaCorrente(50,100);
        float saldo = conta.getSaldo();
        assertEquals(50.0F, saldo);
    }

    @Test
    public void setSaldo(){
        ContaCorrente conta = new ContaCorrente(50,100);
        conta.setSaldo(100F);
        assertEquals(100F,conta.getSaldo() );
    }

    @Test
    public void getLimite(){
        ContaCorrente conta = new ContaCorrente(50,50);
        float saldo = conta.getLimite();
        assertEquals(50.0F, saldo);
    }

    @Test
    public void setLimite(){
        ContaCorrente conta = new ContaCorrente(50,50);
        conta.setLimite(100F);
        assertEquals(100F, conta.getLimite());
    }
}
