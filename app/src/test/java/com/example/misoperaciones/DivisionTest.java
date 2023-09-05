package com.example.misoperaciones;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {


    operacion_division prueba = new operacion_division();



    @Test
    public void divisionTest1(){

        assertEquals(5,prueba.division(10,2));
    }

    @Test
    public void sumaTest1(){

        assertEquals(12,prueba.suma(10,2));
    }


    /*@Test
    public void divisionTest2(){

        assertTrue(prueba.onClick(12,2)== 2);
    }
    @Test
    public void divisionTest3(){

        assertFalse(prueba.onClick(0,0)==1);
    }
    @Test
    public void divisionTest4() {

        assertNotNull(prueba.onClick(0, 8));
    }*/
}

