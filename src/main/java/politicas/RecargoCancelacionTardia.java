package politicas;

public class RecargoCancelacionTardia implements PoliticaRecargo {
    @Override
    public double calcularRecargo(double montoBase) {
        return montoBase * 0.10;
    }
}