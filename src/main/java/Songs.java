import java.lang.invoke.StringConcatException;
import java.util.Date;

public class Songs {
    private String title; //Titulo
    private int id;
    private String gender; //Género
    private String cover; //Título
    private Date date; //Fecha de creación de la canción
    private String description; //Descripción

    public Songs(String title, int id, String gender, String cover, Date date, String description){
        this.title = title;
        this.id = id;
        this.gender = gender; //Género
        this.cover = cover; //Título
        this.date = date; //Fecha de creación de la canción
        this.description = description;
    }
}

