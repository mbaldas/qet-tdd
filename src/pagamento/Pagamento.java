package pagamento;

import java.util.Date;


public class Pagamento {
	public String tipoDePagamento;
	public double valorPago;
	public Date data;

	public Pagamento(String tipoDePagamento, double valorPago, Date data) {
		this.tipoDePagamento = tipoDePagamento;
		this.valorPago = valorPago;
		this.data = data;
	}
}
