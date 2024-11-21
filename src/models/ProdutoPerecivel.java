package models;

import java.time.LocalDateTime;

public class ProdutoPerecivel extends Producto{
    private LocalDateTime dataValidade;
    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDateTime dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
    public LocalDateTime getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(LocalDateTime dataValidade) {
        this.dataValidade = dataValidade;
    }
}
