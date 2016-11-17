package ro.learnstuff.xmlconf.services.impl;

import org.springframework.stereotype.Service;
import ro.learnstuff.builder.ArtefactBuilder;
import ro.learnstuff.domain.Album;
import ro.learnstuff.xmlconf.services.contract.AlbumService;

/**
 * Created by Iuliana on 11/16/2016.
 */

@Service
public class LoggerAlbumService implements AlbumService {


    public Album readAlbum() {
        Album album = new ArtefactBuilder().anAlbum();

        System.out.println("The album we read from logger service: " + album.getTitle() + " " + album.getArtist().getName());
        return album;
    }

    public boolean canRead() {
        return false;
    }
}
