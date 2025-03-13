package isep.eapli.demo_orm.Domain;

import jakarta.persistence.*;

@Entity
public class CondutorAutorizado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "contrato_id") // Chave estrangeira para ContratoAluguer
    private ContratoAluguer contrato;
    public CondutorAutorizado() {}
    public CondutorAutorizado(ContratoAluguer contrato) {
        this.contrato = contrato;
    }

    public void setContrato(ContratoAluguer contrato) {
        this.contrato = contrato;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
