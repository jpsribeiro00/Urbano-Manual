package Models;

import Enum.Enums;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Conta extends BaseEntity{

    @Column(nullable=false)
    private Enums.TipoConta Tipo;

    @Column(nullable=false)
    private String Descricao;

    private double Valor;

    @ManyToOne
    private Residencia Residencia;

    public void setId(Long id) {
        super.setId(id);
    }

    public void setTipo(Enums.TipoConta tipo) {
        Tipo = tipo;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public void setConta(Models.Residencia residencia) {
        Residencia = residencia;
    }

    public Long getId() {
        return super.getId();
    }

    public Enums.TipoConta getTipo() {
        return Tipo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public double getValor() {
        return Valor;
    }

    public Models.Residencia getConta() {
        return Residencia;
    }
}