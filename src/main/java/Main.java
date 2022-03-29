import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List <Songs> listSongs = new ArrayList<Songs>();
    static Scanner read = new Scanner(System.in);

    public static Songs createSong(){
        System.out.print("Ingrese el título de la canción: " );
        String title = read.nextLine();

        System.out.print("\nIngrese el género de la canción: " );
        String gender = read.nextLine();

        System.out.print("\nIngrese la portada de la canción: " );
        String cover = read.nextLine();

        System.out.print("\nIngrese la descripción de la canción: " );
        String description = read.nextLine();

        System.out.print("\nIngrese la fecha de creación de la canción: (int)" );
        String date = read.nextLine();

        Songs tempSong = new Songs(title, 1, gender, cover, date,  description);

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


    public static void main(String[] args) {
        Scanner readInt = new Scanner(System.in);
        int decisionPerson;

        do {
            System.out.println("Agrega una canción ");

            Songs tempSong = createSong();
            saveSongs(tempSong, listSongs);

            System.out.println("¿Desea agregar una canción a su biblioteca de música?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            decisionPerson = readInt.nextInt();
        }while (decisionPerson == 1);

        System.out.println("Listado de canciones: ");
        getSong(listSongs);


    }


}


