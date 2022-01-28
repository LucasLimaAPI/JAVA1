package dio.stategy.subsistemacep;

public class CepApi {

    private static CepApi instancia = new CepApi(); 

    private CepApi() {
        super();
    }

    
    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Taboão da Serra";
    }
    public String recuperarEstado(String cep){
        return "SP";
    }




}
