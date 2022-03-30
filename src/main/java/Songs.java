import java.lang.invoke.StringConcatException;
import java.util.Date;

public class Songs {
    private String title;
    private String artist;//Titulo
    private int id;
    private String gender; //Género
    private String cover; //Portada
    private String date; //Fecha de creación de la canción
    private String description; //Descripción
    private boolean comparisonGender;

    public Songs(String title, String artist, int id, String gender, String cover, String date, String description){
        this.title = title;
        this.artist = artist;
        this.id = id;
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
                "\n Artísta: " + this.artist +
                "\n Género: " + this.gender +
                "\n Portada: " + this.cover +
                "\n Fecha de creación de la canción: " + this.date +
                "\n Descripción: " + this.description;
    }

    public boolean isGender() {
        return comparisonGender = true;
    }
}

