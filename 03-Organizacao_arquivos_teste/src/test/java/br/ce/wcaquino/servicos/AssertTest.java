package br.ce.wcaquino.servicos;

import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;
import junit.framework.Assert;

public class AssertTest {
	
	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals("Erro de comparacao", 1, 1);
		Assert.assertEquals(0.51234, 0.512, 0.001);
		Assert.assertEquals(Math.PI, 3.14, 0.01);
		
		int i = 5;
		Integer i2 = 5;
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());
		
		Assert.assertEquals("Bola", "Bola");
		//Assert.assertNotEquals("Bola", "casa"); //nao funcionou
		Assert.assertTrue("Bola".equalsIgnoreCase("bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		Usuario u3 = u2;
		Usuario u4 = null;
		
		Assert.assertEquals(u1, u2);
		
		Assert.assertSame(u2,  u3);
		Assert.assertNotSame(u1,  u2);
		
		Assert.assertNull(u4);
		Assert.assertNotNull(u3);
		
		

		
	}//test

}//AssertTest
