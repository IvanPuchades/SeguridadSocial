import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeguridadSocial {
    private List<Persona> personasList;

    /*
    /metodo con HashMap

    private Map <String, Persona> personaMapDni = new HashMap<>();

    private Map <String, Persona> personaMapNumeroSS = new HashMap<>();
    */


    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
        /*
        /metodo con HashMap

        if (!personaMapDni. containsKey(persona.getDni()) && !personaMapNumeroSS.containsKey(persona.getNumSeguridadSocial())) {
            personaMapDni.put(persona.getDni(), persona);
            personaMapNumeroSS.put(persona.getNumSeguridadSocial(), persona);
        }
        */

        Boolean repe = false;

        for (int i = 0; i< personasList.size();i++){
            Persona p = personasList.get(i);
            if(p.getDni().equalsIgnoreCase(persona.getDni())){
                repe = true;
            }


        }
        if(!repe){
            personasList.add(persona);
        }

        boolean repetida = personasList.stream().anyMatch(p -> p.getDni().equals(persona.getDni())) ;



    }

    public void bajaPersona(String dni) {
        /*
        /metodo con HashMap

        personaMapNumeroSS.remove(personaMapDni.get(dni).getNumSeguridadSocial());
          */
        personasList.removeIf(persona -> persona.getDni().equals(dni));


    }

    public Persona obtenerPersonaPorDNI(String dni) {

        /*
        /metodo con HashMap

        return personaMapDni.get(dni);
        */
        //o de otra manera: (java 8)
        return personasList.stream().filter(persona -> persona.getDni().equals(dni)).findFirst().get();

    }

    public Persona obtenerPersonaPorNumSS(int numSeguridadSocial) {

        /*/metodo con HashMap

        return personaMapNumeroSS.values().stream().filter(persona -> persona.getSalario()>= min).collect(Collectors.toList());

        */
        return personasList.stream().filter(persona -> persona.getNumSeguridadSocial() == numSeguridadSocial).findFirst().get();

    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

        List <Persona> aux = new arrayList<>();

        for(persona persona:personaMapDni.values()){
            if(persona.getSalario()<=min && persona.getSalario()<= max) {
                aux.add(persona);
            }
        }




        //java 8 normal
        return personasList.stream().peek(content -> System.out.println("obtenerPersonasRangoSalarial antes de filtrar")).
                filter(persona ->  persona.getSalario() >= min  &&   persona.getSalario() <= max).peek(content -> System.out.println("obtenerPersonasRangoSalarial despues de filtrar")).collect(Collectors.toList());

    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){

        /*ArrayList<Persona> temporal = new ArrayList<>();

        for(Persona y : personasList){
           if (y.getEdad() > edad){

               temporal.add(y);


           }
       }





       return  temporal;*/

        return personasList.stream().filter(persona -> persona.getEdad() > edad).collect(Collectors.toList());


    }

    public List<Persona> obtenerTodas(){
        return personasList;

    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}
