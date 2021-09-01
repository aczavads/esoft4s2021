package aula20210831.associações;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private List<Endereço> endereços = new ArrayList<>();
	
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Endereço> getEndereços() {
		return endereços;
	}
	
	public void addEndereço(Endereço novo) {
		this.endereços.add(novo);
	}
	

}
