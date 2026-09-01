package Creacionales.factory;

import politicas.DescuentoVIP;
import politicas.PoliticaRecargo;
import politicas.TipoRecargo;
import politicas.RecargoTemporadaAlta;
import politicas.RecargoCancelacionTardia;
import politicas.RecargoSinPenalizacion;

public class PoliticaRecargoFactory {
    public enum TipoRecargo {
        TEMPORADA_ALTA, CANCELACION_TARDIA, SIN_PENALIZACION
    }
    public static PoliticaRecargo crearPolitica(TipoRecargo tipo) {
        return switch (tipo) {
            case TEMPORADA_ALTA -> new RecargoTemporadaAlta();
            case CANCELACION_TARDIA -> new RecargoCancelacionTardia();
            case SIN_PENALIZACION -> new RecargoSinPenalizacion();
        };
    }
}