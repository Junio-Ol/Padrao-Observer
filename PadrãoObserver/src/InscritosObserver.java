
public class InscritosObserver  extends Observer{

		
		public InscritosObserver(CanalAtualizar V�deo){
			this.subject = 	V�deo;
			this.subject.addObserver(this);
		}
		
		@Override
		public void atualizarDados() {
			System.out.println("Atualizando Inscritos a partir de observer...");
			
		}
		
		

	}


