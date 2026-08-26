package entities;

public class PessoaJuridica extends Contribuinte{

    private Integer qntFuncionario;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer qntFuncionario) {
        super(name, rendaAnual);
        this.qntFuncionario = qntFuncionario;
    }

    public int getQntFuncionario() {
        return qntFuncionario;
    }

    public void setQntFuncionario(int qntFuncionario) {
        this.qntFuncionario = qntFuncionario;
    }

    @Override
    public double imposto(){
        if (qntFuncionario <= 10){
            return getRendaAnual() * 0.16;
        }

        return getRendaAnual() * 0.14;
    }

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", getName(), imposto());
    }
}
