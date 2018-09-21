package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import aplicacao.CDB;

public class TesteCalculadora {

	@Test
	public void testCalculoRendimentoBruto() {
		float r = CDB.calculaRendimentoBruto(1000.00f, 8.5f);
		
		assertEquals(13.97f, r, 0f);
	}
	
	@Test
	public void testCalculoValorImpostoDeRenda() {
		float r = CDB.calculaImpostoDeRenda(13.97f, 22.5f);
		
		assertEquals(3.14f, r, 0f);
	}
	
	@Test
	public void testCalculoRendimentoLiquido() {
		float r = CDB.calculaRendimentoLiquido(1000.00f, 13.97f);
		
		assertEquals(1.0829f, r, 0f);
	}

}
