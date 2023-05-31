package interpreter;

public class Usuario {

    private double milhasComprasSiteAssociado;
    private double milhasCartaoCredito;


    public double getMilhasCartaoCredito() {
        return milhasCartaoCredito;
    }

    public void setMilhasCartaoCredito(double milhasCartaoCredito) {
        this.milhasCartaoCredito = milhasCartaoCredito;
    }

    public double getMilhasComprasSiteAssociado() {
        return milhasComprasSiteAssociado;
    }

    public void setMilhasComprasSiteAssociado(double milhasComprasSiteAssociado) {
        this.milhasComprasSiteAssociado = milhasComprasSiteAssociado;
    }

    public double calcularQuantidadeMilhas () { return EmpresaMilhagem.calcularQuantidadeMilhas(this.milhasComprasSiteAssociado, this.milhasCartaoCredito);}
}
