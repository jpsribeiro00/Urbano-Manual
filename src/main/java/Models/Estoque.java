package Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "estoque")
public class Estoque extends BaseEntity{

    @JsonIgnore
    @JoinColumn(name = "residencia_id", insertable = false, updatable = false)
    @OneToOne(targetEntity = Residencia.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Residencia Residencia;

    @JoinColumn(name = "residencia_id")
    private Long residencia_id;

    @OneToMany(cascade = CascadeType.ALL , mappedBy="Estoque")
    private List<Produto> Produtos;

    public Long getId() {
        return super.getId();
    }

    @JsonIgnore
    public Models.Residencia getResidencia() {
        return Residencia;
    }
    public Long getResidenciaId(){
        return residencia_id;
    }

    public List<Produto> getProdutos() {
        return Produtos;
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public void setResidenciaId(Long id){
        this.residencia_id = id;
    }

    @JsonIgnore
    public void setResidencia(Models.Residencia residencia) {
        setResidenciaId(Residencia.getId());
        this.Residencia = residencia;
    }

    public void setProdutos(List<Produto> produtos) {
        Produtos = produtos;
    }
}
