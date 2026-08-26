package entities;

public class PessoaFisica extends Contribuinte{

    private Double gastosSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto(){
        if (getRendaAnual() < 20000){
            return (getRendaAnual() * 0.15) - (gastosSaude * 0.5);
        }

        return (getRendaAnual() * 0.25) - (gastosSaude * 0.5);
    }

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", getName(), imposto());
    }
}
