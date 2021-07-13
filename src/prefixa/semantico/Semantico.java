package prefixa.semantico;
import java.util.LinkedList;
import prefixa.node.Start;

import prefixa.analysis.DepthFirstAdapter;
import prefixa.node.ABlocoFuncao;
import prefixa.node.AChamada;
import prefixa.node.ADeclParametro;
import prefixa.node.ADeclVar;
import prefixa.node.ATipoDeclFunc;

public class Semantico extends DepthFirstAdapter{
  private LinkedList<LinkedList<Simbolo>> tabelaSimbolos;
  private int escopoAtual;
  private static final int escopoRaiz = 0;
  private boolean isChamadaFunc;
  
  public Semantico() {
		escopoAtual = 0;
		tabelaSimbolos = new LinkedList<LinkedList<Simbolo>>();
		tabelaSimbolos.add(new LinkedList<Simbolo>());
		
		isChamadaFunc = false;
	}
  
  
  @Override
	public void inABlocoFuncao(ABlocoFuncao node) {
		escopoAtual++;
		tabelaSimbolos.add(new LinkedList<Simbolo>());
	}
  
  @Override
	public void inATipoDeclFunc(ATipoDeclFunc node) {
		String idFuncao = node.getIdentifier().getText();
		Simbolo simb = new Simbolo(node.getIdentifier().getText(),
								   escopoRaiz,
								   Categoria.FUNCAO,
								   node.getTipo().toString(),
								   null);
		

		if(tabelaSimbolos.get(escopoRaiz).contains(simb))
			System.err.println("[ linha "+ node.getIdentifier().getLine() + " ] Já existe uma função " + idFuncao + " definida.");
		else 
			tabelaSimbolos.get(escopoRaiz).push(simb);		
	}
  
	@Override
	public void inAComandoAtribComando(AComandoAtribComando node){
		
	}


	@Override
	public void inAChamada(AChamada node) {
		Simbolo simb = new Simbolo(node.getIdentifier().getText(), 
								  escopoRaiz,
								  Categoria.FUNCAO,
								  null,
								  null);
		

		if(!tabelaSimbolos.get(escopoRaiz).contains(simb) && !tabelaSimbolos.get(escopoAtual).contains(simb))
			System.err.println("[ linha "+ node.getIdentifier().getLine() + " ] A função " + simb.getId() + " não foi definida.");
		
		isChamadaFunc = true;
	}
	
	@Override
	public void outAChamada(AChamada node) {
		isChamadaFunc = false;

		if(tabelaSimbolos.get(escopoAtual-1).size() != qtParamsFunc)
			System.err.println("[ linha "+ node.getIdentifier().getLine() + " ] O numero de parâmetros passado na função " + node.getIdentifier() + " não condiz com sua declaração.");
		
		qtParamsFunc = 0;
		
	}


	int qtParamsFunc = 0;
	
	@Override
	public void inADeclVar(ADeclVar node) {
		Simbolo simb = new Simbolo(node.getIdentifier().getText(), 
								  escopoAtual, 
								  Categoria.PARAMETRO, 
								  null, 
								  null);
		
		if(!tabelaSimbolos.get(escopoAtual).contains(simb))
			System.err.println("[ linha "+ node.getIdentifier().getLine() + " ] A variável " + simb.getId() + " não foi definida no escopo atual.");
		
		if(isChamadaFunc)
			qtParamsFunc++;
	}
	
	
	
	
	@Override
	public void inADeclParametro(ADeclParametro node) {
		Simbolo simb = new Simbolo(node.getIdentifier().getText(), 
				escopoAtual, 
				Categoria.PARAMETRO, 
				node.getTipo().toString(), 
				null);
		if(tabelaSimbolos.get(escopoAtual).contains(simb))
			System.err.println("[ linha "+ node.getIdentifier().getLine() + " ] O parâmetro " + simb.getId() + " já foi definido escopo " + escopoAtual+".");
		else
			tabelaSimbolos.get(escopoAtual).add(simb);
	}

  
  @Override
	public void inStart(Start node) {
		System.out.println("-------------------------------------------------");
		System.out.println("Iniciando análise semântica...");
		System.out.println("-------------------------------------------------");
		System.out.println("");
	}
	
	@Override
	public void outStart(Start node) {
		System.out.println("");
		System.out.println("-------------------------------------------------");
      System.out.println("Fim da análise semântica");
      System.out.println("-------------------------------------------------");
	}
	
	
	
	public LinkedList<LinkedList<Simbolo>> getTabelaSimbolos() {
		return tabelaSimbolos;
	}
	
	
	public void setTabelaSimbolos(LinkedList<LinkedList<Simbolo>> tabelaSimbolos) {
		this.tabelaSimbolos = tabelaSimbolos;
	}
	
	public void imprimeTabela() {
		for(LinkedList<Simbolo> linha : tabelaSimbolos) {
			for(Simbolo simb : linha) {
				System.out.print(simb.getId()+"|");
			}
			System.out.println("");
		}
	}
}