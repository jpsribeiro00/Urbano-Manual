package Models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Estoque extends BaseEntity{


    @OneToOne(cascade = CascadeType.ALL)
    private Residencia Residencia;

    @OneToMany(cascade = { CascadeType.REMOVE }, mappedBy="Estoque")
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
