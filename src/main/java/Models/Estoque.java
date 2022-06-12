package Models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Estoque extends BaseEntity{

    @OneToOne(mappedBy = "Estoque")
    private Residencia Residencia;

    @OneToMany(mappedBy="Produto")
    private List<Produto> Produtos;

    public Long getId() {
        return super.getId();
    }

    public Models.Residencia getResidencia() {
        return Residencia;
    }

    public List<Produto> getProdutos() {
        return Produtos;
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public void setResidencia(Models.Residencia residencia) {
        Residencia = residencia;
    }

    public void setProdutos(List<Produto> produtos) {
        Produtos = produtos;
    }
}
