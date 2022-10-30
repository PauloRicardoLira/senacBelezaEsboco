package com.crudsenac.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CadastroAluno {
	
	@Id
	private long matricula;
	
    private String nome_aluno;
    private String sobrenome_aluno;
    private String data_nasc_aluno;
    private String email_aluno;
    private String curso;
    private String senha_aluno;
    
    public long getMatricula() {
       return matricula;
    }
    public void setMatricula(long matricula) {
       this.matricula = matricula;
    }
    public String getEmail_aluno() {
       return email_aluno;
    }
    public void setEmail_aluno(String email_aluno) {
        this.email_aluno = email_aluno;
    }
    public String getCurso() {
       return curso;
    }
    public void setCurso(String curso) {
       this.curso = curso;
    }
    public String getData_nasc_aluno() {
       return data_nasc_aluno;
    }
    public void setData_nasc(String data_nasc_aluno) {
       this.data_nasc_aluno = data_nasc_aluno;
    }
    public String getNome_aluno() {
       return nome_aluno;
    }
    public void setNome_aluno(String nome_aluno) {
       this.nome_aluno = nome_aluno;
    }
    public String getSobrenome_aluno() {
       return sobrenome_aluno;
    }
    public void setSobrenome_aluno(String sobrenome_aluno) {
       this.sobrenome_aluno = sobrenome_aluno;
    }
	public String getSenha_aluno() {
		return senha_aluno;
	}
	public void setSenha_aluno(String senha_aluno) {
		this.senha_aluno = senha_aluno;
	}
}