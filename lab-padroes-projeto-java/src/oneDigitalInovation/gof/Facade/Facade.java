package oneDigitalInovation.gof.Facade;

import oneDigitalInovation.gof.SubSistema1.crm.CrmService;
import oneDigitalInovation.gof.SubSistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstacia().recuperarCidade(cep);
		String estado = CepApi.getInstacia().recuperarEstado(cep);
		
		CrmService.GravarCliente(nome, cep, cidade, estado);
		
	}

}
