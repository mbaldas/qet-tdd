package processador;

import java.util.ArrayList;
import fatura.Fatura;
import boleto.Boleto;

public class Processador {

	public static void ProcessaBoletos(ArrayList<Boleto> boletos, Fatura fatura) {
		double valorTotalPago = 0;

		for(Boleto boleto : boletos) {
			valorTotalPago += boleto.valorPago;
		}

		if (valorTotalPago < fatura.valorTotal) {
			fatura.pago = false;
		}
		else {
			fatura.pago = true;
		}
	}
}