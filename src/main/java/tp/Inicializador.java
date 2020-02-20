package tp;

import java.util.Scanner;

public class Inicializador {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Mascotas veterinaria = new Mascotas();
        Mascota mascota;
        String motivoDeVisita;
        String caracterIngresado;
        do {

            try {
                System.out.println("Elija la opción que desea realizar:\n[1] Buscar Mascota \n[2] Cargar Mascota \n[3] Borrar Mascota \n[4] Actualizar Mascota");
                int operacion = entrada.nextInt();
                System.out.print("Nombre de la mascota: ");
                String nombreMascota = entrada.next();

                switch (operacion) {
                    case 1:
                        veterinaria.buscarMascota(nombreMascota);
                        break;
                    case 2:
                        System.out.print("Nombre del duenio: ");
                        String nombreDelDuenio = entrada.next();
                        System.out.print("Apellido del duenio: ");
                        String apellidoDelDuenio = entrada.next();
                        System.out.println("Tipos de mascotas:");
                        System.out.println("Gato\nLoro\nPerro");
                        System.out.print("Ingrese la opcion adecuada: ");
                        String tipoMascota = entrada.next();
                        System.out.print("Peso de la mascota: ");
                        double pesoMascota = entrada.nextDouble();
                        System.out.print("Motivo de visita: ");
                        motivoDeVisita = entrada.next();
                        mascota = new Mascota(nombreDelDuenio,apellidoDelDuenio,nombreMascota,tipoMascota, pesoMascota);
                        veterinaria.cargarMascota(mascota);
                        mascota.agregarMotivosDeVisitas(motivoDeVisita);
                        break;
                    case 3:
                        veterinaria.borrarMascota(nombreMascota);
                        break;
                    case 4:
                        Mascota mascotaUpdate = veterinaria.getMascota(nombreMascota);
                        System.out.print("Peso mascota: ");
                        double peso = entrada.nextDouble();
                        System.out.print("Motivo de visita: ");
                        motivoDeVisita = entrada.next();
                        mascotaUpdate.setPesoMascota(peso);
                        mascotaUpdate.agregarMotivosDeVisitas(motivoDeVisita);
                        veterinaria.actualizarMascota(mascotaUpdate);
                        break;
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println ("Ingrese 's' si desea realizar otra operacion");
            caracterIngresado = entrada.next();
        } while (caracterIngresado.equals("s") || caracterIngresado.equals("S"));
    }
}
