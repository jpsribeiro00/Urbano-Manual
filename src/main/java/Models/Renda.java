package Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Renda extends BaseEntity{

    @Column(nullable=false)
    private String Descricao;

    @Column(nullable=false)
    private double Valor;

    @JoinColumn(name = "pessoa_id", insertable = false, updatable = false)
    @ManyToOne(targetEntity = Pessoa.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Pessoa Pessoa;

    @JoinColumn(name = "pessoa_id")
    private Long pessoa_id;

    public Long getId() {
        return super.getId();
    }

    public String getDescricao() {
        return Descricao;
    }

    public double getValor() {
        return Valor;
    }
    @JsonIgnore
    public Models.Pessoa getPessoa() {
        return Pessoa;
    }
    public Long getPessoaId(){
        return pessoa_id;
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

    public void setPessoaId(Long id){
        this.pessoa_id = id;
    }
    @JsonIgnore
    public void setPessoa(Models.Pessoa pessoa) {
        setPessoaId(pessoa.getId());
        this.Pessoa = pessoa;
    }
}
