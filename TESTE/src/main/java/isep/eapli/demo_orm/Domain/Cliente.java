package isep.eapli.demo_orm.Domain;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String clientId;
    @ManyToOne
    private ClientType clientType;
    @ManyToOne
    private ContratoAluguer contrato;
}
