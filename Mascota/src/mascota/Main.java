
package mascota;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
    public static void main(String [] args){
     
        Perro perro = new Perro("Husky siberiano","Bobi",8,'F');
        Gato gato = new Gato("tom",10,'M',"Concentrado para gatos");
        
        mascotas.add(perro);
        mascotas.add(gato);
        System.out.println("Tenemos dos mascotas");
        for (Mascota mascota: mascotas){
            
            System.out.println("");
            System.out.println(mascota.MostrarDatos());
            
        }
    }
    
}
