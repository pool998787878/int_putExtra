package pe.edu.upeu.encapsulamiento;

public class persona {

      private String nombre;
      protected   String apellido;
      private int edad;



      void saludo (){
          System.out.println("hola, mi nombre es "+getNombre()+"  y mi es "+edad);
      }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
