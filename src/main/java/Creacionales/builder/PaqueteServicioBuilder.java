package Creacionales.builder;

import com.mycompany.sistema.reservas.dominio.modelo.PaqueteServicio;

public class PaqueteServicioBuilder {

    private static final int CAPACIDAD_MAXIMA_VEHICULO = 4;

    private boolean incluyeDesayuno = false;
    private boolean incluyeSpa = false;
    private boolean incluyeTransporteAeropuerto = false;
    private Integer numeroPersonas; // Integer para detectar "no seteado"

    public PaqueteServicioBuilder conDesayuno(boolean valor) {
        this.incluyeDesayuno = valor;
        return this;
    }

    public PaqueteServicioBuilder conSpa(boolean valor) {
        this.incluyeSpa = valor;
        return this;
    }

    public PaqueteServicioBuilder conTransporteAeropuerto(boolean valor) {
        this.incluyeTransporteAeropuerto = valor;
        return this;
    }

    public PaqueteServicioBuilder conNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
        return this;
    }

    public PaqueteServicio build() {
        if (numeroPersonas == null || numeroPersonas < 1) {
            throw new IllegalStateException(
                "numeroPersonas es obligatorio y debe ser >= 1");
        }
        if (incluyeTransporteAeropuerto && numeroPersonas > CAPACIDAD_MAXIMA_VEHICULO) {
            throw new IllegalStateException(
                "El transporte al aeropuerto no admite más de "
                + CAPACIDAD_MAXIMA_VEHICULO + " personas por paquete");
        }
        return new PaqueteServicio(incluyeDesayuno, incluyeSpa,
                                    incluyeTransporteAeropuerto, numeroPersonas);
    }
}