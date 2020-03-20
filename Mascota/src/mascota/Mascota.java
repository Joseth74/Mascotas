
package mascota;

public class Mascota {

    public Mascota(){
   }
   private String nombre;
   private int edad;
   private char sexo;

    public Mascota(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }
    public String MostrarDatos(){
                    return
                           "Nombre: "+getNombre()+
                            "\nEdad: "+getEdad()+" años"+
                             "\nSexo: "+getSexo();
 }
}
