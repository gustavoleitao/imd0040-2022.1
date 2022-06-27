package br.ufrn.imd.interfaces.exe;

import java.util.List;
import java.util.stream.Collectors;

public class ParserJson {
    
    public List<Movie> parserAll(List<String> movies){

        return movies.stream().map(e -> parseLine(e)).collect(Collectors.toList());
    }

    private Movie parseLine(String line) {
        return null;
    }

}
