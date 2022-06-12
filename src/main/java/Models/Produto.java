package Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Produto extends BaseEntity {

    @Column(nullable=false)
    private String Nome;

    @Column(nullable=false)
    private double ValorUnitario;

    @JoinColumn(name = "produto_id", insertable = false, updatable = false)
    @ManyToOne(targetEntity = Produto.class, fetch = FetchType.LAZY)
    private Produto Produto;

    @JoinColumn(name = "produto_id")
    private Long produto_id;

    public Long getId() {
        return super.getId();
    }

    public String getNome() {
        return Nome;
    }

    public double getValorUnitario() {
        return ValorUnitario;
    }

    @JsonIgnore
    public Models.Produto getProduto() {
        return Produto;
    }
    public Long getProdutoId(){
        return produto_id;
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setValorUnitario(double valorUnitario) {
        ValorUnitario = valorUnitario;
    }

    public void setProdutoId(Long id){
        this.produto_id = id;
    }
    @JsonIgnore
    public void setProduto(Models.Produto produto) {
        setProdutoId(Produto.getId());
        this.Produto = produto;
    }
}