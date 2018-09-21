package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import aplicacao.CDB;

public class TesteCalculadora {

	@Test
	public void testCalculoRendimentoBruto() {
		float r = CDB.calculaRendimentoBruto(1000.00f, 8.5f, 60);
		float c = CDB.calculaRendimentoBruto(500.00f, 8.0f, 120);
		
		assertEquals(13.97f, r, 0.2f);
		assertEquals(13.15f, c, 0.2f);
	}
	
	@Test
	public void testCalculoValorImpostoDeRenda() {
		float r = CDB.calculaImpostoDeRenda(13.97f, 22.5f);
		float c = CDB.calculaImpostoDeRenda(13.15f, 22.5f);
		
		assertEquals(3.14f, r, 0.2f);
		assertEquals(2.96f, c, 0.2f);
	}
	
	@Test
	public void testCalculoRendimentoLiquido() {
		float r = CDB.calculaRendimentoLiquido(1000.00f, 13.97f, 3.14f);
		float c = CDB.calculaRendimentoLiquido(500.00f, 13.15f, 2.96f);
		
		assertEquals(1.0829f, r, 0.2f);
		assertEquals(2.0384f, c, 0.2f);
	}

}
