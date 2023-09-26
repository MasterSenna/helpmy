package br.connectementor.entidades;

public class Usuario {
    private int Id; // Mantido como "Id" com "I" maiúsculo
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private int programacao;
    private int redes;
    private int ciberseguranca;
    private int businessIntelligence;
    private int gestaoTI;
    private int cloudComputing;
    private int devops;

   

    // Construtor com parâmetros
    public Usuario(int Id, String nome, String email, String senha, String telefone, int programacao, int redes,
            int ciberseguranca, int businessIntelligence, int gestaoTI, int cloudComputing, int devops) {
        this.Id = Id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.programacao = programacao;
        this.redes = redes;
        this.ciberseguranca = ciberseguranca;
        this.businessIntelligence = businessIntelligence;
        this.gestaoTI = gestaoTI;
        this.cloudComputing = cloudComputing;
        this.devops = devops;
    }

    // Getters e setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    // Outros getters e setters


public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getSenha() {
    return senha;
}

public void setSenha(String senha) {
    this.senha = senha;
}

public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public int getProgramacao() {
    return programacao;
}

public void setProgramacao(int programacao) {
    this.programacao = programacao;
}

public int getRedes() {
    return redes;
}

public void setRedes(int redes) {
    this.redes = redes;
}

public int getCiberseguranca() {
    return ciberseguranca;
}

public void setCiberseguranca(int ciberseguranca) {
    this.ciberseguranca = ciberseguranca;
}

public int getBusinessIntelligence() {
    return businessIntelligence;
}

public void setBusinessIntelligence(int businessIntelligence) {
    this.businessIntelligence = businessIntelligence;
}

public int getGestaoTI() {
    return gestaoTI;
}

public void setGestaoTI(int gestaoTI) {
    this.gestaoTI = gestaoTI;
}

public int getCloudComputing() {
    return cloudComputing;
}

public void setCloudComputing(int cloudComputing) {
    this.cloudComputing = cloudComputing;
}

public int getDevops() {
    return devops;
}

public void setDevops(int devops) {
    this.devops = devops;
}
}