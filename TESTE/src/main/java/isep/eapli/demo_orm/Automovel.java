package isep.eapli.demo_orm;

public class Automovel {
    private double km;
    private String matricula;

    public Automovel(Double km, String matricula){
        this.km = km;
        this.matricula = matricula;
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
