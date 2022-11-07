package oneDigitalInovation.gof.SubSistema2.cep;

public class CepApi {
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstacia() {			
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Eunápolis";
	}

	public String recuperarEstado(String cep) {
		return "BA";
	}
	
}
