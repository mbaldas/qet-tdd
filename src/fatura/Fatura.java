package fatura;

import java.util.Date;

import pagamento.Pagamento;

import java.util.ArrayList;

public class Fatura {
	
	public String nomeCliente;
	public double valorTotal;
	public Date data;
	public boolean pago;
	public ArrayList<Pagamento> listaPagamentos = new ArrayList<Pagamento>();

	public Fatura(double valorTotal, String nomeCliente) {
		this.valorTotal = valorTotal;
		this.nomeCliente = nomeCliente;
	}
}