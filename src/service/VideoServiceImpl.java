package service;

import model.Video;
import repository.VideoRepository;

import java.util.List;

public class VideoServiceImpl implements VideoService {
    private final VideoRepository repository;

    public VideoServiceImpl(VideoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addVideo(Video video) {
        if (video == null) {
            throw new IllegalArgumentException("O video não pode ser nulo");
        }
        if (video.getTitulo() == null || video.getTitulo().isBlank()) {
            throw new IllegalArgumentException("O Título do video não pode ser nulo ou branco");
        }
        if (video.getDescricao() == null || video.getDescricao().isBlank()) {
            throw new IllegalArgumentException("A descrição do video não pode ser nulo ou branco");
        }
        if (video.getDuracao() <= 0) {
            throw new IllegalArgumentException("A duração do video não pode ser menor que zero");
        }
        repository.save(video);
    }

        @Override
        public List<Video> listVideos () {
            return repository.findAll();
        }
    }
