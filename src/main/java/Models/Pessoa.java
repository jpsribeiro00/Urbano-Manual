package Models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Pessoa extends BaseEntity{

    private String CPF;

    @Column(nullable=false)

    private String Nome;

    private String Idade;

    @OneToMany(mappedBy="Pessoa")
    private List<Renda> Rendas;

    @OneToMany(mappedBy="Pessoa")
    private List<Residencia> Residencias;

    public Long getId() {
        return super.getId();
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return Nome;
    }

    public String getIdade() {
        return Idade;
    }

    public List<Renda> getRendas() {
        return Rendas;
    }

    public List<Residencia> getResidencias() {
        return Residencias;
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setIdade(String idade) {
        Idade = idade;
    }

    public void setRendas(List<Renda> rendas) {
        Rendas = rendas;
    }

    public void setResidencias(List<Residencia> residencias) {
        Residencias = residencias;
    }
}