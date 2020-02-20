package tp;

import java.util.ArrayList;
import java.util.List;

public class Mascota {

    private String nombreDelDuenio;
    private String apellidoDelDuenio;
    private String nombreMascota;
    private String tipoMascota;
    private double pesoMascota;
    private List<String> motivosDeVisitas;

    public Mascota(String nombreDelDuenio, String apellidoDelDuenio, String nombreMascota, String tipoMascota, double pesoMascota) {
        this.nombreDelDuenio = nombreDelDuenio;
        this.apellidoDelDuenio = apellidoDelDuenio;
        this.nombreMascota = nombreMascota;
        this.tipoMascota = tipoMascota;
        this.pesoMascota = pesoMascota;
        this.motivosDeVisitas = new ArrayList<>();
    }

    public String getNombreDelDuenio() {
        return nombreDelDuenio;
    }

    public String getApellidoDelDuenio() {
        return apellidoDelDuenio;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public double getPesoMascota() {
        return pesoMascota;
    }

    public List<String> getMotivosDeVisitas() {
        return motivosDeVisitas;
    }

    public void setPesoMascota(double pesoMascota) {
        this.pesoMascota = pesoMascota;
    }

    public void agregarMotivosDeVisitas(String motivoDeVisita) {
        motivosDeVisitas.add(motivoDeVisita);
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombreDelDuenio='" + nombreDelDuenio + '\'' +
                ", apellidoDelDuenio='" + apellidoDelDuenio + '\'' +
                ", nombreMascota='" + nombreMascota + '\'' +
                ", tipoMascota='" + tipoMascota + '\'' +
                ", pesoMascota=" + pesoMascota +
                ", motivosDeVisitas=" + motivosDeVisitas +
                '}';
    }
}
