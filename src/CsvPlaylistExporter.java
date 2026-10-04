import java.io.FileWriter;
import java.io.IOException;

public class CsvPlaylistExporter implements PlaylistExporter {
    public void  export(String[] songs, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Songs\n");

            for (String song : songs) {
                writer.write("\"" + song.replace("\"", "\"\"") + "\"\n");
            }
        }
    }
}
