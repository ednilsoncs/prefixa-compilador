package prefixa.semantico;


public class Simbolo {
	//cadeia
	private String id;
	private int escopo;
	private int categoria;
	private String tipo;
	private String valor;
	
	public Simbolo() {}
	
	
	
	public Simbolo(String id, int escopo, int categoria, String tipo, String valor) {
		super();
		this.id = id;
		this.escopo = escopo;
		this.categoria = categoria;
		this.tipo = tipo;
		this.valor = valor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getEscopo() {
		return escopo;
	}
	public void setEscopo(int escopo) {
		this.escopo = escopo;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoria;
		result = prime * result + escopo;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Simbolo other = (Simbolo) obj;
		if (categoria != other.categoria)
			return false;
		if (escopo != other.escopo)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}	