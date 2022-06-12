package Models;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Movel extends BaseEntity{

    @Column(nullable=false)
    private String Descricao;

    @Column(nullable=false)
    private String Quantidade;

    @ManyToOne
    private Comodo Comodo;

    public Long getId() {
        return super.getId();
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public Models.Comodo getComodo() {
        return Comodo;
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void setQuantidade(String quantidade) {
        Quantidade = quantidade;
    }

    public void setComodo(Models.Comodo comodo) {
        Comodo = comodo;
    }
}
