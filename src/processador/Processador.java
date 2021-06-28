package processador;

import java.util.ArrayList;
import fatura.Fatura;
import boleto.Boleto;

public class Processador {

	public static void ProcessaBoletos(ArrayList<Boleto> boletos, Fatura fatura) {
		if (boletos.get(0).valorPago < fatura.valorTotal) {
			fatura.pago = false;
		}
		else {
			fatura.pago = true;
		}
	}
}