public class Principal{
	public static void main(String args[])
	{
		Cart�oWeb vet[]= new Cart�oWeb[5];
		vet[0]= new Cart�oDeAniversario("Gabriel","mam�e","21/06/2016");
		vet[1]= new Cart�oDeNatal("jos�","Maria","25/12/2016");
		vet[2]= new Cart�oDeDiaDosNamorados("Carlos","Gabriel","12/06/2016");
		vet[3]= new Cart�oDeAniversario("Jose","Rodolfo","29/07/2016");
		vet[4]= new Cart�oDeNatal("marnaldo","joselino","25/06/2016");

		for(Cart�oWeb i : vet)
		{
			i.mostraMensagem();
		}
	}

}