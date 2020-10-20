public class DadosObserver extends Observer{

	
	public DadosObserver(CanalAtualizar Vídeo){
		this.subject = Vídeo;
		this.subject.addObserver(this);
	}
	
	@Override
	public void atualizarDados() {
		
		System.out.println("Atualizando Vídeo a partir de observer...");
		
	}
	
	

}

