package politicas;

public class RecargoSinPenalizacion implements PoliticaRecargo {
    @Override
    public double calcularRecargo(double montoBase) {
        return 0.0;
    }
}