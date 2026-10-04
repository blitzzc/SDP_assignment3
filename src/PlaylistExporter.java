import java.io.IOException;

public interface PlaylistExporter {
    void export(String[] songs, String fileName) throws IOException;
}
