
public class Teste {
	

		
		public static void main(String[] args){
			CanalAtualizar Vídeo = new CanalAtualizar();
			
			new DadosObserver(Vídeo);
			new InscritosObserver(Vídeo);
			
			
			
			System.out.println("Primeira notificação aos Inscritos...");
			Vídeo.setNotificacao();
			
			System.out.println();
			System.out.println();
			
			System.out.println("Segunda notificação aos Inscritos...");
			Vídeo.setNotificacao();
		}
	
}
