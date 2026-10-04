import java.io.FileWriter;
import java.io.IOException;

public class TxtPlaylistExporter implements PlaylistExporter{
    public void export(String[] songs, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String song: songs) {
                writer.write(song + "\n");
            }
        }
    }
}
