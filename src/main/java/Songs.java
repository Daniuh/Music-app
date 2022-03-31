public class Songs {
    private String title; //Titulo
    private Integer id;
    private String gender; //Género
    private String cover; //Portada
    private String date; //Fecha de creación de la canción
    private String description;//Descripción
    private double duration; //Duración
    private String artist; //Artista
    private boolean comparisonGender;

    public Songs(String title, String gender, String cover, String date, String description, double duration, String artist, int id){
        this.title = title;
        this.id = id; //Genera un id aleatoriamente
        this.gender = gender; //Género
        this.cover = cover; //Título
        this.date = date; //Fecha de creación de la canción
        this.description = description; //Descripción de la canción
        this.duration = duration; //Duración de la canción
        this.artist = artist;//Artista que compuso la canción

    }

    @Override
    public String toString()
    {
        return "\n Título: " + this.title +
                "\n Artista: " + this.artist +
                "\n id: " + this.id +
                "\n Género: " + this.gender +
                "\n Portada: " + this.cover +
                "\n Duración: " + this.duration +
                "\n Fecha de creación de la canción: " + this.date +
                "\n Descripción: " + this.description;
    }

    public String isGender() {
        return this.gender;
    }
}


