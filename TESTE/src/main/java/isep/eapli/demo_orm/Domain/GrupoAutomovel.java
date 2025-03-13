package isep.eapli.demo_orm.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GrupoAutomovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nome;
    private Integer portas;
    private String classe;
    public GrupoAutomovel(String nome, Integer portas, String classe){
        this.nome=nome;
        this.portas=portas;
        this.classe=classe;
    }

    public GrupoAutomovel() {

    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }
    public void setClasse(String classe){
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "GrupoAutomovel{" +
                "nome='" + nome + '\'' +
                ", portas=" + portas +
                ", classe='" + classe + '\'' +
                '}';
    }
}
