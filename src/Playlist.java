import java.io.IOException;

public abstract class Playlist {
    private String[] songs;
    private PlaylistExporter exporter;

    public Playlist(String[] songs, PlaylistExporter exporter) {
        this.songs = songs;
        this.exporter = exporter;
    }

    public void setExporter(PlaylistExporter exporter) {
        this.exporter = exporter;
    }

    public void export(String fileName) throws IOException {
        exporter.export(songs, fileName);
    }
}
