package com.crudsenac.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "postagem_professor")
public class PostagemProfessor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cod_post_prof;
	

	private String area_post1;
	private String data_post_prof;
	private String descricao_post1;
	@Lob
	private byte[] midia_post1;
	private String publicador;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_prof", referencedColumnName = "chapa")
    private CadastroProfessor cadastro_professor;
	
	
	public long getId_post_prof() {
		return cod_post_prof;
	}
	
	public void setCod_post_prof(long cod_post_prof) {
		this.cod_post_prof = cod_post_prof;
	}	
	
	public String getPublicador() {
		return publicador;
	}
	
	public void setPublicador(String publicador) {
		this.publicador = publicador;
	}
	
	public String getData_post_prof() {
		return data_post_prof;
	}
	
	public void setData_post_prof(String data_post_prof) {
		this.data_post_prof = data_post_prof;
	}

	public String getArea_post1() {
		return area_post1;
	}

	public void setArea_post1(String area_post1) {
		this.area_post1 = area_post1;
	}

	public String getDescricao_post1() {
		return descricao_post1;
	}

	public void setDescricao_post1(String descricao_post1) {
		this.descricao_post1 = descricao_post1;
	}

	public byte[] getMidia_post1() {
		return midia_post1;
	}

	public void setMidia_post1(byte[] midia_post1) {
		this.midia_post1 = midia_post1;
	}
	
}
