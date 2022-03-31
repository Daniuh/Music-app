import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List <Songs> listSongs = new ArrayList<Songs>();


    public static Songs createSong(int id){
        Scanner read = new Scanner(System.in);
        Scanner readDouble = new Scanner(System.in);

        System.out.print("Ingrese el título de la canción: " );
        String title = read.nextLine();

        System.out.print("\nIngrese el artista de la canción: ");
        String artist = read.nextLine();

        System.out.print("\nIngrese el género de la canción: " );
        String gender = read.nextLine();

        System.out.print("\nIngrese la portada de la canción: ");
        String cover = read.nextLine();

        System.out.print("\nIngrese la fecha de creación de la canción: " );
        String date = read.nextLine();

        System.out.print("\nIngrese la descripción de la canción: ");
        String description = readDouble.nextLine();

        System.out.print("\nIngrese la duración de la canción: ");
        double duration = readDouble.nextDouble();

        Songs tempSong = new Songs(title, gender, cover, date, description, duration, artist, id);


        return tempSong;

    }


    public static void saveSongs(Songs tempSong, List<Songs> listSongs){
        listSongs.add(tempSong);
    }

    public static void getSong(List<Songs> listSongs){
        Iterator<Songs> iter = listSongs.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void getFilterGender(List<Songs> listSongs){
        Library library = new Library();
        library.menuSongs(listSongs);
    }


    public static void main(String[] args) {

        Scanner readInt = new Scanner(System.in);
        int decisionPerson;

        int id = 0;
        do {
            id ++;
            System.out.println("Agrega una canción ");

            Songs tempSong = createSong(id);
            saveSongs(tempSong, listSongs);

            System.out.println("¿Desea agregar una canción a su biblioteca de música?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            decisionPerson = readInt.nextInt();

        }while (decisionPerson == 1);

        System.out.println("Listado de canciones: ");
        getSong(listSongs);

        getFilterGender(listSongs);

    }
}