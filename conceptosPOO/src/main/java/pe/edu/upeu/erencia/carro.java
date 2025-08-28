package pe.edu.upeu.erencia;

import pe.edu.upeu.encapsulamiento.trabajador;

public class carro extends veiculo {
    public static void main(String[] args) {
        carro c = new carro();
        System.out.println("Caracteristicas");
        c.marca = "hilux";
        System.out.println("marca"+c.marca);
        System.out.println("modelo"+c.modelo);
        System.out.println("color");
        c.sonido();
    }

}
