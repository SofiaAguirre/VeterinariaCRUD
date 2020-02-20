package tp;

import java.util.HashMap;
import java.util.Map;

public class Mascotas {

    private Map<String,Mascota> mapaDeMascotas;

    public Mascotas() {
        this.mapaDeMascotas = new HashMap<>();
    }

    public Map<String, Mascota> getMapaDeMascotas() {
        return mapaDeMascotas;
    }

    public void buscarMascota(String nombreMascota) {
        if (mapaDeMascotas.get(nombreMascota) == null) {
            System.out.println("Esta mascota no existe.");
        } else {
            System.out.println(mapaDeMascotas.get(nombreMascota));
        }
    }

    public void cargarMascota(Mascota mascota) {
        if (mapaDeMascotas.containsKey(mascota.getNombreMascota())) {
            System.out.println("El nombre de la mascota ya existe en el sistema.");
        } else {
            mapaDeMascotas.put(mascota.getNombreMascota(), mascota);
        }
    }

    public void borrarMascota(String nombreMascota) {
        buscarMascota(nombreMascota);
        mapaDeMascotas.remove(nombreMascota);
        System.out.println("Mascota eliminada");
    }

    public void actualizarMascota (Mascota mascota) {
        buscarMascota(mascota.getNombreMascota());
        mapaDeMascotas.replace(mascota.getNombreMascota(), mascota);
    }

    public Mascota getMascota(String nombreMascota) {
        if (mapaDeMascotas.get(nombreMascota) == null) {
            return null;
        }
        return mapaDeMascotas.get(nombreMascota);
    }

}
