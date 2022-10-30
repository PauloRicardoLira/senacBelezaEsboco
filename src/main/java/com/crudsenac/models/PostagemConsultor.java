package com.crudsenac.models;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "postagem_consultor")
public class PostagemConsultor implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cod_post_cons;
	
	private String assunto;
	private String setor;
	private String data_post_cons;
	private Blob midia_post_cons;
	
	
	@OneToOne(mappedBy = "postagem_consultor")
	private CadastroConsultor cadastro_consultor;
	
	
	public long getId_post_prof() {
		return cod_post_cons;
	}
	
	public void setCod_post_cons(long cod_post_cons) {
		this.cod_post_cons = cod_post_cons;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getData_post_cons() {
		return data_post_cons;
	}

	public void setData_post_cons(String data_post_cons) {
		this.data_post_cons = data_post_cons;
	}

	public Blob getMidia_post_cons() {
		return midia_post_cons;
	}

	public void setMidia_post_cons(Blob midia_post_cons) {
		this.midia_post_cons = midia_post_cons;
	}

}
