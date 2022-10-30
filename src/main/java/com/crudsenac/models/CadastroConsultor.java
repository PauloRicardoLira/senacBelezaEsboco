package com.crudsenac.models;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro_consultor")
public class CadastroConsultor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_consultor;
	
    private String nome_consultor;
    private String sobrenome_consultor;
    private String data_nasc_consultor;
    private String email_consultor;
    private String especialidades;
    private String senha_consultor;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_post_cons", referencedColumnName = "cod_post_cons")
    private PostagemConsultor postagem_consultor;

    
    public long id_consultor() {
        return id_consultor;
    }
    public void id_consultor(long id_consultor) {
        this.id_consultor = id_consultor;
    }
    public String getNome_consultor() {
        return nome_consultor;
    }
    public void setNome_consultor(String nome_consultor) {
        this.nome_consultor = nome_consultor;
    }
    public String getSobrenome_consultor() {
        return sobrenome_consultor;
    }
    public void setSobrenome_consultor(String sobrenome_consultor) {
        this.sobrenome_consultor = sobrenome_consultor;
    }
    public String getData_nasc_consultor() {
        return data_nasc_consultor;
    }
    public void setData_nasc_consultor(String data_nasc_consultor) {
        this.data_nasc_consultor = data_nasc_consultor;
    }
    public String getEmail_consultor() {
        return email_consultor;
    }
    public void setEmail_consultor(String email_consultor) {
        this.email_consultor = email_consultor;
    }
    public String getEspecialidades() {
        return especialidades;
    }
    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
	public String getSenha_consultor() {
		return senha_consultor;
	}
	public void setSenha_consultor(String senha_consultor) {
		this.senha_consultor = senha_consultor;
	}
}