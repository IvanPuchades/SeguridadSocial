

public class Persona {
    private String dni="";
    private int numSeguridadSocial;
    private String nombre="";
    private String apellidos;
    private int edad;
    private double salario;

    public Persona(String dni, int numSeguridadSocial, String nombre, String apellidos, int edad, double salario) {
        this.dni = dni;
        this.numSeguridadSocial = numSeguridadSocial;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public void setNumSeguridadSocial(int numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (numSeguridadSocial != persona.numSeguridadSocial) return false;
        if (edad != persona.edad) return false;
        if (Double.compare(persona.salario, salario) != 0) return false;
        if (dni != null ? !dni.equals(persona.dni) : persona.dni != null) return false;
        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        return apellidos != null ? apellidos.equals(persona.apellidos) : persona.apellidos == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = dni != null ? dni.hashCode() : 0;
        result = 31 * result + numSeguridadSocial;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + edad;
        temp = Double.doubleToLongBits(salario);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", numSeguridadSocial=" + numSeguridadSocial +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
//todo bien