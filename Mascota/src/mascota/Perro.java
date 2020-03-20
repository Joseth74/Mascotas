
package mascota;

public class Perro extends Mascota {
    private String raza;
    
    public Perro(String raza, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.raza = raza;
    }
    @Override
    public String MostrarDatos(){
               return "Un perro"+""
                      +"\nQue se llama "+getNombre()
                       +"\nTiene "+getEdad()+" años"
                        +"\nSexo: " +getSexo()
                         +"\nY su raza es: "+raza;
        
}
    
    }
   
       
    
    
    

