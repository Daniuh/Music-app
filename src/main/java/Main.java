import java.util.Scanner;

public class Main {

    static Scanner read = new Scanner(System.in);

    public static Songs createSong(){
        System.out.println("Ingrese el título de la canción: " );
        String title = read.nextLine();

        System.out.println("Ingrese el género de la canción: " );
        String gender = read.nextLine();

        System.out.println("Ingrese la portada de la canción: " );
        String cover = read.nextLine();

        System.out.println("Ingrese la descripción de la canción: " );
        String description = read.nextLine();

        System.out.println("Ingrese la fecha de creación de la canción: (int)" );
        Integer date = read.nextInt();

        Songs safeAndSound = new Songs(title, 1, gender, cover, date,  description);

        return safeAndSound;
    }

    public static void getSong(Songs safeAndSound){
        System.out.println(safeAndSound.toString());
    }

    public static void main(String[] args) {

        Songs safeAndSound = createSong();
        getSong(safeAndSound);

    }
}


