package codigos;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PedidoTest {

    private Pedido pedido;

    @BeforeClass
    public static void setupClass(){
        System.out.println("Antes de todos os testes");
    }

    @Before
    public void setup(){
        System.out.println("Antes de cada teste");
        pedido = new Pedido();
    }

    @Test
    public void testTaxaZero(){
        float taxa = pedido.calculaTaxaDesconto(false,"",100);
        assertEquals(0,taxa,0);
    }

    @Test
    public void testTaxaZeroLimite(){
        float taxa = pedido.calculaTaxaDesconto(false,"",200);
        assertEquals(0,taxa,0);
    }

    @Test
    public void testTaxa15PeloValorCompra(){
        float taxa = pedido.calculaTaxaDesconto(false,"",600);
        assertEquals(15,taxa,0);
    }

    @Test
    public void testTaxa15PeloValorCompraLimiteMenos(){
        float taxa = pedido.calculaTaxaDesconto(false,"",500);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa15PeloValorCompraLimiteMais(){
        float taxa = pedido.calculaTaxaDesconto(false,"",501);
        assertEquals(15,taxa,0);
    }

    @Test
    public void testTaxa15PeloValorCompraEClientePrata(){
        float taxa = pedido.calculaTaxaDesconto(false,"prata",600);
        assertEquals(15,taxa,0);
    }

    @Test
    public void testTaxa15PeloValorCompraEClienteBronze(){
        float taxa = pedido.calculaTaxaDesconto(false,"bronze",600);
        assertEquals(15,taxa,0);
    }

    @Test
    public void testTaxa10PeloValorCompra(){
        float taxa = pedido.calculaTaxaDesconto(false,"",450);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa10PeloValorCompraLimiteMenos(){
        float taxa = pedido.calculaTaxaDesconto(false,"",400);
        assertEquals(5,taxa,0);
    }

    @Test
    public void testTaxa10PeloValorCompraLimiteMais(){
        float taxa = pedido.calculaTaxaDesconto(false,"",401);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa10PeloValorCompraEClienteBronze(){
        float taxa = pedido.calculaTaxaDesconto(false,"bronze",450);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa5PeloValorCompra(){
        float taxa = pedido.calculaTaxaDesconto(false,"",250);
        assertEquals(5,taxa,0);
    }

    @Test
    public void testTaxa5PeloValorCompraLimite(){
        float taxa = pedido.calculaTaxaDesconto(false,"",201);
        assertEquals(5,taxa,0);
    }

    @Test
    public void testTaxa15PeloTipoCliente(){
        float taxa = pedido.calculaTaxaDesconto(false,"ouro",100);
        assertEquals(15,taxa,0);
    }

    @Test
    public void testTaxa15PeloTipoClienteValor15(){
        float taxa = pedido.calculaTaxaDesconto(false,"ouro",501);
        assertEquals(15,taxa,0);
    }

    @Test
    public void testTaxa15PeloTipoClienteCompra5(){
        float taxa = pedido.calculaTaxaDesconto(false,"ouro",250);
        assertEquals(15,taxa,0);
    }

    @Test
    public void testTaxa15PeloTipoClienteEValor5(){
        float taxa = pedido.calculaTaxaDesconto(false,"ouro",300);
        assertEquals(15,taxa,0);
    }

    @Test
    public void testTaxa10PeloTipoCliente(){
        float taxa = pedido.calculaTaxaDesconto(false,"prata",100);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa10PeloTipoClienteValor10(){
        float taxa = pedido.calculaTaxaDesconto(false,"prata",401);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa10PeloTipoClienteEValor5(){
        float taxa = pedido.calculaTaxaDesconto(false,"prata",300);
        assertEquals(10,taxa,0);
    }


    @Test
    public void testTaxa5PeloTipoCliente(){
        float taxa = pedido.calculaTaxaDesconto(false,"bronze",150);
        assertEquals(5,taxa,0);
    }

    @Test
    public void testTaxa5PeloTipoClienteValor5(){
        float taxa = pedido.calculaTaxaDesconto(false,"bronze",201);
        assertEquals(5,taxa,0);
    }

    @Test
    public void testTaxa10PelaPrimeiraCompraClienteBronze(){
        float taxa = pedido.calculaTaxaDesconto(true,"bronze",150);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa10PelaPrimeiraCompraValorde5(){
        float taxa = pedido.calculaTaxaDesconto(true,"bronze",250);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa10PelaPrimeiraCompra(){
        float taxa = pedido.calculaTaxaDesconto(true,"",150);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa10PelaPrimeiraCompraClenteBronzeValor5(){
        float taxa = pedido.calculaTaxaDesconto(true,"bronze",250);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa10PelaPrimeiraCompraClentePrata(){
        float taxa = pedido.calculaTaxaDesconto(true,"prata",100);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa10PelaPrimeiraCompraValor10(){
        float taxa = pedido.calculaTaxaDesconto(true,"",401);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa10PelaPrimeiraCompraValor10ClietePrata(){
        float taxa = pedido.calculaTaxaDesconto(true,"prata",401);
        assertEquals(10,taxa,0);
    }
//   o codigo nao trata valor null
//    @Test
//    public void testErroPeloIgualNoBronze(){
//        float taxa = pedido.calculaTaxaDesconto(false,null,150);
//        assertEquals(10,taxa,0);
//    }

}

