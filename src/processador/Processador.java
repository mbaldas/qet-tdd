package processador;

import java.util.ArrayList;
import fatura.Fatura;
import pagamento.Pagamento;
import boleto.Boleto;

public class Processador {

	public static void ProcessaBoletos(ArrayList<Boleto> boletos, Fatura fatura) {
		double valorTotalPago = 0;

		for(Boleto boleto : boletos) {
			valorTotalPago += boleto.valorPago;
			Pagamento pagamento = new Pagamento("BOLETO", boleto.valorPago, boleto.data);
			fatura.listaPagamentos.add(pagamento);
		}

		if (valorTotalPago < fatura.valorTotal) {
			fatura.pago = false;
		}
		else {
			fatura.pago = true;
		}
	}
}