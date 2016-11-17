package ro.learnstuff.xmlconf.services.impl;

import org.springframework.stereotype.Service;
import ro.learnstuff.domain.Album;
import ro.learnstuff.builder.ArtefactBuilder;
import ro.learnstuff.xmlconf.services.contract.AlbumService;

/**
 * Created by Iuliana on 11/12/2016.
 */
@Service
public class ConsoleAlbumService implements AlbumService {

    public Album readAlbum() {

        Album album = new ArtefactBuilder().anAlbum();
        System.out.println("The album we read from console service: " + album.getTitle());
        return album;
    }

    public boolean canRead() {
        return false;
    }
}
