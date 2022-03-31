import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Library {

    private String wantedGender;
    static Scanner read = new Scanner(System.in);

    public void menuSongs(List <Songs> listSongs){
        System.out.print("Ingrese el género que quiere buscar: " );
        this.wantedGender = read.nextLine();

    }

    private void getPersonaById(List<Songs> listSongs, String genero) {
    }


}
