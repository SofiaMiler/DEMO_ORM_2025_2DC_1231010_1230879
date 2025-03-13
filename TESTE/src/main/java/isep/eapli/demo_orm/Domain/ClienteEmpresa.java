package isep.eapli.demo_orm.Domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Empresa")

public class ClienteEmpresa extends Cliente {
    private String nifEmpresa;
    public ClienteEmpresa() {}

    public ClienteEmpresa(String nifEmpresa) {
        super(nifEmpresa);
    }

}
