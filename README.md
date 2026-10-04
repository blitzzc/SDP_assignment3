# Playlist Exporter

A simple Java project for Assignment 3 that demonstrates the Bridge design pattern.

## Features

- Personal and workout playlists.
- Export song names to TXT and CSV files.
- Switch the exporter without creating a new playlist.

## Bridge Pattern

| Role | Class |
|---|---|
| Abstraction | `Playlist` |
| Refined Abstractions | `PersonalPlaylist`, `WorkoutPlaylist` |
| Implementor | `PlaylistExporter` |
| Concrete Implementors | `TxtPlaylistExporter`, `CsvPlaylistExporter` |
| Client | `Main` |

`Playlist` holds a reference to `PlaylistExporter` and delegates exporting to it. In `Main`, the same personal playlist switches from a TXT exporter to a CSV exporter.

## How to Run

Requires Java 8 or newer. Run these commands from the project folder:

```powershell
mkdir build
javac -d build src/*.java
java -cp build Main
```

The program creates:

- `personal.txt`
- `personal.csv`
- `workout.txt`

These files contain song names. The program does not play music.

## Clean Code Principles

1. **Meaningful names:** class and method names describe their purpose.
2. **Single responsibility:** playlists hold songs, while exporters write files.
3. **Small classes and methods:** each performs a simple task.
4. **Avoid duplication:** both playlist subclasses reuse the methods in `Playlist`.
5. **Open/closed principle:** a new exporter can be added without changing the playlist classes.
