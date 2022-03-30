import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Library {
<<<<<<< HEAD

    private String wantedGender;
    static Scanner read = new Scanner(System.in);

    public void menuSongs(List <Songs> listSongs){
        System.out.print("Ingrese el género que quiere buscar: " );
        wantedGender = read.nextLine();

        List <Songs> listGenderSongs = filterGender(listSongs);
        listGenderSongs.stream().forEach(x ->{
            System.out.println(x);
        });

    }
    public List <Songs> filterGender( List <Songs> listSongs){
        return listSongs.stream().filter( x -> x.isGender()).collect(Collectors.toList());
    }

=======
>>>>>>> 3ef292ac5e24c241c9b860641b36e2f032c2a401
}
