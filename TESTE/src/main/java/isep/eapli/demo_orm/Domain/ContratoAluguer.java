package isep.eapli.demo_orm.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContratoAluguer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String contratoAluguerId;
}
