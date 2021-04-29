package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {
	private Date datal;
	private Cargo cargo;
	private Status status;
	private Projeto projeto;
	private Funcionario funcionario;
	
	public Contratacao(Date datal, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.datal = datal;
		this.cargo = cargo;
		this.status = Status.PENDENTE;  
		this.funcionario = funcionario;
		projeto.adicionarContratacao(this);
		
	
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getDatal() {
		return datal;
	}
	public void setDatal(Date datal) {
		this.datal = datal;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public void pendente() {
		if(this.status!=null)
		this.status = Status.PENDENTE;
		
	}
	public void contratar() {
		if(this.status == Status.PENDENTE && this.status!=null) {
			this.status = Status.CONTRATADO;
		}
		
	}
	public void demitir()  {
		if(this.status == Status.CONTRATADO && this.status!=null ) {
			this.status = Status.DEMITIDO;
			//projeto.removerContratacao(this); 
		}
	
	}
	@Override
	public String toString() {
		return "Contratacao [datal=" + datal + ", cargo=" + cargo + ", status=" + status + ", projeto=" + projeto
				+ ", funcionario=" + funcionario + "]";
	}
	
	
	

}
