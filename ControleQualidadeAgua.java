public class ControleQualidadeAgua {
    private double ph;
    private double temperatura;

    public ControleQualidadeAgua(double ph, double temperatura) {
        this.ph = ph;
        this.temperatura = temperatura;
    }

    public boolean verificarParametros() {
        if (ph < 6.8 || ph > 7.6) {
            System.out.println("ALERTA QA: Nível de pH fora do limite ideal!");
            return false;
        }
        if (temperatura < 22.0 || temperatura > 28.0) {
            System.out.println("ALERTA QA: Temperatura fora do limite seguro!");
            return false;
        }
        System.out.println("STATUS: Parâmetros da água em níveis ideais.");
        return true;
    }
}
