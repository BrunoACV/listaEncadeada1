package Q1;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula ponteiro;
	
	public void add(Professor professor) {
		Celula celula = new Celula();
		celula.setValor(professor);
		
		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		}else {
			ultimo.setProximo(celula);
			ultimo = celula;			
		}
	}
	
	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		}else if(ponteiro == null) {
			ponteiro = primeiro;
			return true;
		}else {
			boolean temProximo = ponteiro.getProximo() != null ? true : false;
			ponteiro = ponteiro.getProximo();
			return temProximo;
		}
		
	}

	public Celula getPonteiro() {
		return ponteiro;
	}

	public void setPonteiro(Celula ponteiro) {
		this.ponteiro = ponteiro;
	}	
	
}

