package entities;

import java.sql.Date;

public class Projeto {
	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	public String getNome() {
		return nome;
	}
	
	public Projeto(String nome, Date dt_Inicio, Date dt_Termino) {
		this.nome = nome;
		this.dt_Inicio = dt_Inicio;
		this.dt_Termino = dt_Termino;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDt_Inicio() {
		return dt_Inicio;
	}
	public void setDt_Inicio(Date dt_Inicio) {
		this.dt_Inicio = dt_Inicio;
	}
	public Date getDt_Termino() {
		return dt_Termino;
	}
	public void setDt_Termino(Date dt_Termino) {
		this.dt_Termino = dt_Termino;
	}
	
}
