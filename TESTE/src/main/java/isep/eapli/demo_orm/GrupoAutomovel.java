package isep.eapli.demo_orm;

public class GrupoAutomovel {
    private String nome;
    private Integer portas;
    private String classe;
    public GrupoAutomovel(String nome, Integer portas, String classe){
        this.nome=nome;
        this.portas=portas;
        this.classe=classe;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }
    public void setClasse(String classe){
        this.classe = classe;
    }
}
