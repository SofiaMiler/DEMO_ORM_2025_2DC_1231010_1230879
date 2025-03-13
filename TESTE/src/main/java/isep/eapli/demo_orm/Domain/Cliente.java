package isep.eapli.demo_orm.Domain;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "client_type", discriminatorType = DiscriminatorType.STRING)

public abstract class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String clientId;



    public Cliente(){

    }
    public Cliente(String nifCliente) {
        this.clientId = nifCliente;
    }
}
