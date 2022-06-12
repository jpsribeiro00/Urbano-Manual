package Models;

import Enum.Enums;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Comodo extends BaseEntity {

    private String Tamanho;

    private String Limpeza;

    @Column(nullable=false)
    private Enums.ClassificacaoMovel ClassificacaoMovel;

    @OneToMany(mappedBy="Comodo")
    private List<Movel> Moveis;

    @ManyToOne
    private Residencia Residencia;

    public Long getId() {
        return super.getId();
    }

    public String getTamanho() {
        return Tamanho;
    }

    public String getLimpeza() {
        return Limpeza;
    }

    public Enums.ClassificacaoMovel getClassificacaoMovel() {
        return ClassificacaoMovel;
    }

    public List<Movel> getMoveis() {
        return Moveis;
    }

    public Models.Residencia getResidencia() {
        return Residencia;
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public void setTamanho(String tamanho) {
        Tamanho = tamanho;
    }

    public void setLimpeza(String limpeza) {
        Limpeza = limpeza;
    }

    public void setClassificacaoMovel(Enums.ClassificacaoMovel classificacaoMovel) {
        ClassificacaoMovel = classificacaoMovel;
    }

    public void setMoveis(List<Movel> moveis) {
        Moveis = moveis;
    }

    public void setResidencia(Models.Residencia residencia) {
        Residencia = residencia;
    }
}