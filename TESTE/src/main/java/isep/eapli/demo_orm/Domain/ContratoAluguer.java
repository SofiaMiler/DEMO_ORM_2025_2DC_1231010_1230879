package isep.eapli.demo_orm.Domain;

import jakarta.persistence.*;

@Entity

public class ContratoAluguer{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String contratoAluguerId;
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false) // Chave estrangeira para Cliente
    private Cliente cliente;
    public ContratoAluguer() {}
    public ContratoAluguer( String contratoAluguerId, Cliente cliente) {
        this.contratoAluguerId = contratoAluguerId;
        this.cliente = cliente;
    }
}
