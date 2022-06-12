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
public class Renda extends BaseEntity{

    @Column(nullable=false)
    private String Descricao;

    @Column(nullable=false)
    private double Valor;

    @ManyToOne
    private Pessoa Pessoa;

    public Long getId() {
        return super.getId();
    }

    public String getDescricao() {
        return Descricao;
    }

    public double getValor() {
        return Valor;
    }

    public Models.Pessoa getPessoa() {
        return Pessoa;
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public void setPessoa(Models.Pessoa pessoa) {
        Pessoa = pessoa;
    }
}
