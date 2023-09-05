
public class Identifica_Dispositivo_Movel {

	public static void main (String[] args) {
		Dispositivo_Móvel a = new Dispositivo_Móvel ();
		a.identifica_número("2604");
		a.identifica_usuário("Juliana");
		
		Dispositivo_Móvel b = new Dispositivo_Móvel();
		b.identifica_número("0807");
		b.identifica_usuário("Matheus");
		
		System.out.println("Número do telefone:" + a.número);
		System.out.println("Nome do usuário: " + a.usuário);
		
		System.out.println("Número do telefone:" + b.número);
		System.out.println("Nome do usuário: " + b.usuário);
		
		
		a.DDD = 17;
		b.DDD = 22;
		
		System.out.println("DDD:" + a.DDD);
		System.out.println("DDD: " + b.DDD);
	}
		                                        
}
