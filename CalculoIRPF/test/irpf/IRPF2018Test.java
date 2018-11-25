/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irpf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author k
 */
public class IRPF2018Test {
    
    
    
    public IRPF2018Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

       @Test
    public void testeUm() throws Exception {
        double numero = 40.000;
        double dep =2;
        IRPF2018 instance = new IRPF2018();
        String expResult = "0" ;
        assertEquals(0, instance.testeUm(numero, dep), 0.1);
    }

    @Test
    public void testeDois() throws Exception {
        double numero = 20.000 ;
        double dep =1;
        IRPF2018 instance = new IRPF2018();
        String expResult = "0";
       assertEquals(0, instance.testeDois(numero, dep), 0.1);
    }

    @Test
    public void testeTres() throws Exception {
        double numero = 25.000 ;
        double dep =3;
        IRPF2018 instance = new IRPF2018();
        String expResult = "0";
       assertEquals(0, instance.testeTres(numero, dep), 0.1);
    }

    @Test
    public void testeQuatro() throws Exception {
        double numero = 80.000 ;
        double dep =2;
        IRPF2018 instance = new IRPF2018();
        String expResult = "7017.52";
        assertEquals(7017.52, instance.testeQuatro(numero, dep), 0.1);
    }

    @Test
    public void testeCinco() throws Exception {
        double numero = 55.000 ;
        double dep =0;
        IRPF2018 instance = new IRPF2018();
        String expResult = "4741.49";
        assertEquals(4741.49, instance.testeCinco(numero, dep), 0.1);
    }

    @Test
    public void testeSeis() throws Exception {
        double numero = 30.000 ;
        double dep =1;
        IRPF2018 instance = new IRPF2018();
        String expResult = "0";
        assertEquals(0, instance.testeSeis(numero, dep), 0.1);
    }

    @Test
    public void testeSete() throws Exception {
        double numero = 10.000 ;
        double dep =3;
        IRPF2018 instance = new IRPF2018();
        String expResult = "0";
       assertEquals(0, instance.testeSete(numero, dep), 0.1);
    }

    @Test
    public void testeOito() throws Exception {
        double numero = 36.000 ;
        double dep =2;
        IRPF2018 instance = new IRPF2018();
        String expResult = "849.84";
        assertEquals(849.84, instance.testeOito(numero, dep), 0.1);
    }

    @Test
    public void testeNove() throws Exception {
        double numero = 45.000 ;
        double dep =1;
        IRPF2018 instance = new IRPF2018();
        String expResult = "217.35";
        assertEquals(217.35, instance.testeNove(numero, dep), 0.1);
    }

    @Test(expected = Exception.class)
    public void testeinvalido() {
        IRPF2018 instance = new IRPF2018();
        instance.calculoIRPF(0, 0);

    }
    
}
