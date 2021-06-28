package fatura;

import java.util.Date;

public class Fatura {
	
	public String nomeCliente;
	public double valorTotal;
	public Date data;
	public boolean pago;

	public Fatura(double valorTotal, String nomeCliente) {
		this.valorTotal = valorTotal;
		this.nomeCliente = nomeCliente;
	}
}