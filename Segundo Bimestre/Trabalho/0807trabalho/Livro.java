public abstract class Livro {
		private String nome;
		private String autor;
		private int edi�ao;
		private int avalia��o=5;
    public Livro(String nom, String aut, int edi) {
    	nome=nom;
    	autor=aut;
    	edi�ao=edi;
    }

    public String toString()
    {
    	String ret;
    	return ret="Nome do Livro: "+nome+"\nNome do Autor: "+autor+"Edi��o: "+edi�ao+"Avalia��o: "+avalia��o+"\n";
    }

    public void Avalia(int nota) throws MinhaExcecao{
    	if(nota<0 || nota>10)
    		throw new MinhaExcecao("Nota Invalida");
    	else
    		avalia��o=nota;
    }

}