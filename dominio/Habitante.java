package padron.dominio;


/**
 * Write a description of class Habitante here.
 * 
 * @author (Pilar) 
 * @version (1)
 */
public class Habitante
{
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    public void setNombre(String nombre)
    {this.nombre = nombre;}
    public void setApellido1(String apellido1)
    {this.apellido1 = apellido1;}
    public void setApellido2(String apellido2)
    {this.apellido2 = apellido2;}
    
    public String getNombre()
    {return nombre;}
    public String getApellido1()
    {return apellido1;}
    public String getApellido2()
    {return apellido2;}
    public Habitante (String nombre, String apellido1, String apellido2)
    {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    public static void main (String []args)
    {
        Habitante h = new Habitante ("ano","no es","tu");
        //h.setNombre("la ingenieria");
        System.out.println(h.getNombre());
        
        //h.setApellido1("no es ");
        System.out.println(h.getApellido1());
        
        //h.setApellido2("para mi");
        System.out.println(h.getApellido2());
    }
    
}



