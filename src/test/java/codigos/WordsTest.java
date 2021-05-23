package codigos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordsTest {

    private Words word;

    @Before
    public void setup(){
        System.out.println("Antes de cada teste");
        word = new Words();
    }

    @Test
    public void testCountNull(){
        Assert.assertEquals(-1,word.countWords(null));
    }

    @Test
    public void testNormalWord(){
        Assert.assertEquals(0,word.countWords("Carol"));
    }

    @Test
    public void testLastR(){
        Assert.assertEquals(2,word.countWords("abdir sijasjr"));
    }

    @Test
    public void testLastS(){
        Assert.assertEquals(2,word.countWords("jdvibs uahsuahs"));
    }

    @Test
    public void testCount3(){
        Assert.assertEquals(3,word.countWords("conta todas as palavras que tenha s"));
    }

    @Test
    public void testWithNumber(){
        Assert.assertEquals(1,word.countWords("ja123bs"));
    }

    @Test
    public void testWithNumberAndSBefore(){
        Assert.assertEquals(2,word.countWords("js123bs"));
    }

    @Test
    public void testWithNumberAndRBefore(){
        Assert.assertEquals(2,word.countWords("js123bs"));
    }

    @Test
    public void testMiddleWithR(){
        Assert.assertEquals(0,word.countWords("jara"));
    }

    @Test
    public void testMiddleWithS(){
        Assert.assertEquals(0,word.countWords("jastu"));
    }

    @Test
    public void testLast(){
        Assert.assertEquals(1,word.countWords("jatu uahaus "));
    }

    @Test
    public void testLength1(){
        Assert.assertEquals(0,word.countWords("r 2"));
    }

}
