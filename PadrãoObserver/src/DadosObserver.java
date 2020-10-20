public class DadosObserver extends Observer{

	
	public DadosObserver(CanalAtualizar V�deo){
		this.subject = V�deo;
		this.subject.addObserver(this);
	}
	
	@Override
	public void atualizarDados() {
		
		System.out.println("Atualizando V�deo a partir de observer...");
		
	}
	
	

}

