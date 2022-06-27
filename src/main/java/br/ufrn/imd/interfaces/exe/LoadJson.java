package br.ufrn.imd.interfaces.exe;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LoadJson {

    public List<String> loadFileFromResource(String filename) throws URISyntaxException, IOException {
        URL url = getClass().getClassLoader().getResource(filename);
        Path path = Paths.get(url.toURI());
        return Files.readAllLines(path);
    }

}
