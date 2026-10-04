import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Playlist personal = new PersonalPlaylist(new TxtPlaylistExporter());
        personal.export("personal.txt");

        personal.setExporter(new CsvPlaylistExporter());
        personal.export("personal.csv");

        Playlist workout = new WorkoutPlaylist(new TxtPlaylistExporter());
        workout.export("workout.txt");

        System.out.println("Playlist exported!");

    }
}