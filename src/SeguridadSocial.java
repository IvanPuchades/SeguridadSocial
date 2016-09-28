import java.util.ArrayList;
import java.util.List;

public class SeguridadSocial {
    private List<Persona> personasList;
    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {

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



    }

    public void bajaPersona(String dni) {
        personasList.removeIf(persona -> persona.getDni().equals(dni));


    }

    public Persona obtenerPersonaPorDNI(String dni) {
        return (Persona) personasList.stream().filter(persona -> persona.getDni().equals(dni));

    }

    public Persona obtenerPersonaPorNumSS(int numSeguridadSocial) {
        return (Persona) personasList.stream().filter(persona -> persona.getNumSeguridadSocial() == numSeguridadSocial);

    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

        return (List<Persona>) personasList.stream().filter(persona -> min >= persona.getSalario() &&  max <= persona.getSalario() );



    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){

        ArrayList<Persona> temporal = new ArrayList<>();

        for(Persona y : personasList){
           if (y.getEdad() > edad){

               temporal.add(y);


           }
       }

       return  temporal;

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
