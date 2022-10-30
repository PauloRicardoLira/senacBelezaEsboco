package com.crudsenac.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro_professor")
public class CadastroProfessor {
	
	@Id
	private long chapa;
	
      	private String nome_professor;
        private String sobrenome_professor;
        private String data_nasc_professor;
        private String email_professor;
        private String especializacao;
        private String senha_prof;
        
        @OneToOne(mappedBy = "cadastro_professor")
    	private PostagemProfessor postagem_professor ;
        
        public long getChapa() {
            return chapa;
        }

        public void setChapa(long chapa) {
            this.chapa = chapa;
        }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public String getSobrenome_professor() {
        return sobrenome_professor;
    }

    public void setSobrenome_professor(String sobrenome_professor) {
        this.sobrenome_professor = sobrenome_professor;
    }

    public String getData_nasc_professor() {
        return data_nasc_professor;
    }

    public void setData_nasc_professor(String data_nasc_professor) {
        this.data_nasc_professor = data_nasc_professor;
    }

    public String getEmail_professor() {
        return email_professor;
    }

    public void setEmail_professor(String email_professor) {
        this.email_professor = email_professor;
    }

	public String getSenha_prof() {
		return senha_prof;
	}

	public void setSenha_prof(String senha_prof) {
		this.senha_prof = senha_prof;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

}
