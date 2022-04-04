import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;


public class Library {
   // public Songs songByGender;
    private String wantedGender;
    static Scanner read = new Scanner(System.in);
    private static List <Songs> songsByGender = new ArrayList<Songs>();

    public void menuSongs(List <Songs> listSongs){
        System.out.print("Ingrese el género que quiere buscar: " );
        this.wantedGender = read.nextLine();


        try {
           // getSongByGender(listSongs);
            System.out.println("\n CANCIONES BUSCADAS POR GÉNERO");
            getSongByGender(listSongs, songsByGender,  wantedGender);

            // getSong(songsByGender);
          //  System.out.println(songByGender);

        } catch (NoSuchElementException e) {
            System.out.println("EL GÉNERO NO EXISTE");
        } catch (Exception e) {
            System.out.println("ERROR DESCONOCIDO");
            e.printStackTrace();
        }

    }

    public static void getSong(List<Songs> songsByGender){
        Iterator<Songs> iter = songsByGender.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

    private void getSongByGender(List<Songs> listSongs, List<Songs> songsByGender, String wantedGender) {

       /* listSongs.forEach(
                song -> System.out.println(song.getGender())
        );*/


        listSongs.stream().
                filter(song -> song.getGender() == wantedGender).forEach(song -> songsByGender.add(song));

        songsByGender.forEach(song -> System.out.println(song.toString()));

        System.out.println("Holi");
    }

    /**
     * list.stream()
     * 		 .filter (usuario ->! "Zhang San" .equals (user.getName ()))
     * 		.collect(Collectors.toList());
     */
}








