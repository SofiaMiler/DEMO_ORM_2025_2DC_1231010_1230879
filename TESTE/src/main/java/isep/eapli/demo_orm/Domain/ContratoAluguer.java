package isep.eapli.demo_orm.Domain;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class ContratoAluguer{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String contratoAluguerId;
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false) // Chave estrangeira para Cliente
    private Cliente cliente;
    @OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL) // Um contrato pode ter vários condutores
    @JoinColumn(name = "contrato_autorizado_id")
    private List<CondutorAutorizado> condutoresAutorizado;

    public ContratoAluguer() {}
    public ContratoAluguer( String contratoAluguerId, Cliente cliente) {
        this.contratoAluguerId = contratoAluguerId;
        this.cliente = cliente;

    }
    public void adicionarCondutor(CondutorAutorizado condutorAutorizado) {
        condutorAutorizado.setContrato(this);
        this.condutoresAutorizado.add(condutorAutorizado);
    }
}
