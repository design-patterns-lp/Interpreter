package interpreter;

public class EmpresaMilhagem {

    public static String formula = "milhasComprasSiteAssociado * 4 + milhasCartaoCredito";

    public static double calcularQuantidadeMilhas(double nota1, double nota2) {
        String expressao;
        expressao = formula.replace("milhasComprasSiteAssociado", Double.toString(nota1));
        expressao = expressao.replace("milhasCartaoCredito", Double.toString(nota2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
