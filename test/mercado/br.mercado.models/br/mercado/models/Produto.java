package br.mercado.models;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    // Construtor padrão
    public Produto() {
    }

    // Getter e Setter para o campo "id"
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter e Setter para o campo "nome"
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para o campo "descricao"
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter e Setter para o campo "preco"
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter e Setter para o campo "quantidade"
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
