package strategy;

import model.Categoria;
import model.Video;

import java.util.List;
import java.util.stream.Collectors;

public class CategorySearchStrategy implements SearchStrategy {
    @Override
    public List<Video> search(List<Video> videos, String query) {
        Categoria categoria = Categoria.valueOf(query.toUpperCase());
        return videos.stream()
                .filter(video -> video.getCategoria() == categoria).
                collect(Collectors.toList());
    }
}
