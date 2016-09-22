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

        Boolean repetida = personasList.stream().anyMatch(p -> p.getDni().equals(persona.getDni()));
        if(!repetida){
            personasList.add(persona);
        }



    }

    public void bajaPersona(String dni) {
        personasList.removeIf(persona -> persona.dni.equals(dni));


    }

    public Persona obtenerPersonaPorDNI(String dni) {
        personasList.stream().filter(persona -> persona.dni.equals(dni));

    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        personasList.stream().filter(persona -> persona.numSeguridadSocial.equals(numSeguridadSocial));

    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        personasList.stream().filter(persona -> persona.salario.avg(salario));


    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        personasList.stream().filter(persona -> persona.edad.max(edad));

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
