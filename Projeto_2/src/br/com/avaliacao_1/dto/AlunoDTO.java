package br.com.avaliacao_1.dto;

public class AlunoDTO {
    
    private String nome_aluno, dtaNascimento_aluno, rg_aluno, cpf_aluno, cep_aluno;
    private String telefone_aluno, cidade_aluno, bairro_aluno, estado_aluno, curso_aluno, email_aluno; 
    private int id_aluno, numeroCasa_aluno;

    public int getNumeroCasa_aluno() {
        return numeroCasa_aluno;
    }

    public void setNumeroCasa_aluno(int numeroCasa_aluno) {
        this.numeroCasa_aluno = numeroCasa_aluno;
    }
    
    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getDtaNascimento_aluno() {
        return dtaNascimento_aluno;
    }

    public void setDtaNascimento_aluno(String dtaNascimento_aluno) {
        this.dtaNascimento_aluno = dtaNascimento_aluno;
    }

    public String getRg_aluno() {
        return rg_aluno;
    }

    public void setRg_aluno(String rg_aluno) {
        this.rg_aluno = rg_aluno;
    }

    public String getCpf_aluno() {
        return cpf_aluno;
    }

    public String getEmail_aluno() {
        return email_aluno;
    }

    public void setEmail_aluno(String email_aluno) {
        this.email_aluno = email_aluno;
    }

    public void setCpf_aluno(String cpf_aluno) {
        this.cpf_aluno = cpf_aluno;
    }

    public String getCep_aluno() {
        return cep_aluno;
    }

    public void setCep_aluno(String cep_aluno) {
        this.cep_aluno = cep_aluno;
    }

    public String getCidade_aluno() {
        return cidade_aluno;
    }

    public void setCidade_aluno(String cidade_aluno) {
        this.cidade_aluno = cidade_aluno;
    }

    public String getBairro_aluno() {
        return bairro_aluno;
    }

    public void setBairro_aluno(String bairro_aluno) {
        this.bairro_aluno = bairro_aluno;
    }

    public String getEstado_aluno() {
        return estado_aluno;
    }

    public void setEstado_aluno(String estado_aluno) {
        this.estado_aluno = estado_aluno;
    }

    public String getCurso_aluno() {
        return curso_aluno;
    }

    public void setCurso_aluno(String curso_aluno) {
        this.curso_aluno = curso_aluno;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getTelefone_aluno() {
        return telefone_aluno;
    }

    public void setTelefone_aluno(String telefone_aluno) {
        this.telefone_aluno = telefone_aluno;
    }
}