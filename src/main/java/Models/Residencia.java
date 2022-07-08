package Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Residencia extends BaseEntity{


    @Column(nullable=false)
    private String Endereco;

    @OneToOne
    @JoinColumn(name="fk_estoque", nullable=true)
    private Estoque Estoque;

    @OneToMany(cascade = { CascadeType.ALL }, mappedBy="Residencia")
    private List<Comodo> Comodos;

    @OneToMany(cascade = { CascadeType.ALL }, mappedBy="Residencia")
    private List<Conta> Contas;

    @JoinColumn(name = "pessoa_id", insertable = false, updatable = false)
    @ManyToOne(targetEntity = Pessoa.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Pessoa Pessoa;

    @JoinColumn(name = "pessoa_id")
    private Long pessoa_id;

    public Long getId() {
        return super.getId();
    }

    public String getEndereco() {
        return Endereco;
    }

    public Models.Estoque getEstoque() {
        return Estoque;
    }

    public List<Comodo> getComodos() {
        return Comodos;
    }

    public List<Conta> getContas() {
        return Contas;
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

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public void setEstoque(Models.Estoque estoque) {
        Estoque = estoque;
    }

    public void setComodos(List<Comodo> comodos) {
        Comodos = comodos;
    }

    public void setContas(List<Conta> contas) {
        Contas = contas;
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
