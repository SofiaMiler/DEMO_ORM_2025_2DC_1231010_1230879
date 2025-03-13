package isep.eapli.demo_orm.Domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Particular")

public class ClienteParticular extends Cliente {
    private String nifEmpresa;
    public ClienteParticular() {}

    public ClienteParticular(String nifCliente) {
        super(nifCliente);
    }
}
