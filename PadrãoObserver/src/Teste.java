
public class Teste {
	

		
		public static void main(String[] args){
			CanalAtualizar V�deo = new CanalAtualizar();
			
			new DadosObserver(V�deo);
			new InscritosObserver(V�deo);
			
			
			
			System.out.println("Primeira notifica��o aos Inscritos...");
			V�deo.setNotificacao();
			
			System.out.println();
			System.out.println();
			
			System.out.println("Segunda notifica��o aos Inscritos...");
			V�deo.setNotificacao();
		}
	
}
