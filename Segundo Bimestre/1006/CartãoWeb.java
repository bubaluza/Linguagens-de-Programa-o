
public abstract class Cart�oWeb {
	private String remetente;
	private String destinario;
	private String data;
    public Cart�oWeb(String rem,String dest,String dat) {
    	remetente=rem;
    	destinario=dest;
    	data=dat;
    }

    public abstract  void mostraMensagem();

    	public String getRemetente()
    {
    	return remetente;
    }

	    public String getDestinario()
    {
    	return destinario;
    }
        public String getData()
    {
    	return data;
    }

}