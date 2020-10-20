
public class InscritosObserver  extends Observer{

		
		public InscritosObserver(CanalAtualizar Vídeo){
			this.subject = 	Vídeo;
			this.subject.addObserver(this);
		}
		
		@Override
		public void atualizarDados() {
			System.out.println("Atualizando Inscritos a partir de observer...");
			
		}
		
		

	}


