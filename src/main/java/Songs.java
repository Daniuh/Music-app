import java.lang.invoke.StringConcatException;
import java.util.Date;

public class Songs {
    private String title; //Titulo
    private int id;
    private String gender; //Género
    private String cover; //Título
    private Integer date; //Fecha de creación de la canción
    private String description; //Descripción

    public Songs(String title, int id, String gender, String cover, Integer date, String description){
        this.title = title;
        this.id = 1;
        this.gender = gender; //Género
        this.cover = cover; //Título
        this.date = date; //Fecha de creación de la canción
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "\n Título: " + this.title +
                "\n id: " + this.id +
                "\n Género: " + this.gender +
                "\n Portada: " + this.cover +
                "\n Fecha de creación de la canción: " + this.date +
                "\n Descripción: " + this.description;
    }
}

