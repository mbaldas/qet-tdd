package test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import boleto.Boleto;
import fatura.Fatura;
import processador.Processador;

public class BoletoTest {
	
	ArrayList <Boleto> boletos;

	@Before
	public void inicializar() {
		boletos = new ArrayList<Boleto>();
	}
	
	@Test
	public void faturaPaga() {
		Boleto boleto = new Boleto(122.0);
		Fatura fatura = new Fatura(122.0, "Joaozinho");
		boletos.add(boleto);
		Processador.ProcessaBoletos(boletos, fatura);
		Assert.assertTrue(fatura.pago);
	}
	
	@Test
	public void faturaNaoPaga() {
		Boleto boleto = new Boleto(122.0);
		Fatura fatura = new Fatura(450.0, "Fulano");
		boletos.add(boleto);

		Processador.ProcessaBoletos(boletos, fatura);
		Assert.assertFalse(fatura.pago);

	}
}