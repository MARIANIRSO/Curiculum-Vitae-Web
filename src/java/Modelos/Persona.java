 
package Modelos;


public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String mensaje;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String correo, String mensaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

   
    

    
    
}
