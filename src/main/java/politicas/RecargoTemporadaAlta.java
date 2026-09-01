package politicas;

public class RecargoTemporadaAlta implements PoliticaRecargo {
    @Override
    public double calcularRecargo(double montoBase) {
        return montoBase * 0.20;
    }
}