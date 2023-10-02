package padron.presentacion;


/**
 * Write a description of class InterfazUsuario here.
 * 
 * @author (Pilar) 
 * @version (1)
 */
import java.util.ArrayList;

public class InterfazUsuario
{
    public static void ejecutar(String[] instruccion)
    {OficinaPadron padron = new OficinaPadron();
        if (instruccion[0].equalsIgnoreCase("mostrar") &&instruccion.length == 1)
        {mostrarOficinaPadron(padron);}
        else 
        if (instruccion[0].equalsIgnoreCase("añadir")&& instruccion.length == 4)
        {
            padron.annadir(new Habitante(instruccion[1],instruccion[2], instruccion[3]));
            System.out.println("Habitante añadidocorrectamente");
        }
        else
        {System.out.println("Error en la instrucción");}
    }
    private static void mostrarOficinaPadron(OficinaPadronpadron)
    {ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for(Habitante habitante : habitantes)
        {
            System.out.println(habitante.getNombre() + " " +habitante.getApellido1() + " " +habitante.getApellido2());
        }
        System.out.println("El numero total de habitantes es" + padron.calcularNumeroHabitantes());
    }
}

