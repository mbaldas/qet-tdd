package test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import boleto.Boleto;
import fatura.Fatura;
import processador.Processador;

public class BoletoTest {
	
	Fatura fatura;
	ArrayList <Boleto> boletos;

	@Before
	public void inicializar() {
		fatura = new Fatura(122.0, "Joaozinho");
		boletos = new ArrayList<Boleto>();
	}
	
	@Test
	public void faturaPagaUmBoleto() {
		Boleto boleto = new Boleto(122.0);
		boletos.add(boleto);
		Processador.ProcessaBoletos(boletos, fatura);
		Assert.assertTrue(fatura.pago);
	}
	
	@Test
	public void faturaNaoPagaUmBoleto() {
		Boleto boleto = new Boleto(105.0);
		boletos.add(boleto);

		Processador.ProcessaBoletos(boletos, fatura);
		Assert.assertFalse(fatura.pago);
	}
	
	@Test
	public void faturaPagaDoisBoletos() {
		Boleto boleto1 = new Boleto(120.0);
		Boleto boleto2 = new Boleto(2.0);

		boletos.add(boleto1);
		boletos.add(boleto2);

		Processador.ProcessaBoletos(boletos, fatura);
		Assert.assertTrue(fatura.pago);
	}
	
	@Test
	public void faturaNaoPagaDoisBoletos() {
		Boleto boleto1 = new Boleto(60.0);
		Boleto boleto2 = new Boleto(60.0);

		boletos.add(boleto1);
		boletos.add(boleto2);

		Processador.ProcessaBoletos(boletos, fatura);
		Assert.assertFalse(fatura.pago);
	}
	
	@Test
	public void CriarPagamento() {
		Boleto boleto = new Boleto(122.0);
		boletos.add(boleto);
		
		Processador.ProcessaBoletos(boletos, fatura);
		Assert.assertEquals(fatura.listaPagamentos.get(0).tipoDePagamento, "BOLETO");
	}
}