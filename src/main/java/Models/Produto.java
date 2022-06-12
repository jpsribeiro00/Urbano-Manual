package Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Produto extends BaseEntity {

    @Column(nullable=false)
    private String Nome;

    @Column(nullable=false)
    private double ValorUnitario;

    @ManyToOne
    private Produto Produto;

    public Long getId() {
        return super.getId();
    }

    public String getNome() {
        return Nome;
    }

    public double getValorUnitario() {
        return ValorUnitario;
    }

    public Models.Produto getProduto() {
        return Produto;
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

    public void setProduto(Models.Produto produto) {
        Produto = produto;
    }
}