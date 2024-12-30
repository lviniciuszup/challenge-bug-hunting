package strategy;

import model.Video;

import java.util.List;
import java.util.stream.Collectors;

public class DescriptionSearchStrategy implements SearchStrategy {
    @Override
    public List<Video> search(List<Video> videos, String query) {
        return videos.stream()
                .filter(video -> video.getDescricao().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
