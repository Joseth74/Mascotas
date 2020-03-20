
package mascota;

public class Gato extends Mascota {
 public String alimentacion;
 
    public Gato(String nombre, int edad, char sexo,String alimentacion) {
        super(nombre, edad, sexo);
        this.alimentacion = alimentacion;
    }
 @Override
    public String MostrarDatos(){
        return           "Y un gato"+
                           "\nQue se llam "+getNombre()+
                            "\nTiene "+getEdad()+" años"+
                             "\nSexo: "+getSexo()+
                              "\nSu alimentacion principal es "+alimentacion;
    }
}
