package isep.eapli.demo_orm.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Automovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String matricula;
    private double km;

    public Automovel(Double km, String matricula){
        this.km = km;
        this.matricula = matricula;
    }

    public Automovel() {

    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Kms: " + this.km + " Matrícula: " + this.matricula;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
