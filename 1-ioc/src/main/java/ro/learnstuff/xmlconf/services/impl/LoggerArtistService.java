package ro.learnstuff.xmlconf.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ro.learnstuff.builder.ArtefactBuilder;
import ro.learnstuff.domain.Artist;
import ro.learnstuff.xmlconf.services.Main;
import ro.learnstuff.xmlconf.services.contract.AlbumService;
import ro.learnstuff.xmlconf.services.contract.ArtistService;

/**
 * Created by Iuliana on 11/16/2016.
 */
@Service
public class LoggerArtistService implements ArtistService {

    @Autowired
    /*@Qualifier("loggerAlbumService")*/
    AlbumService albumService;

    public Artist readArtist() {
        return ArtefactBuilder.anArtist();
    }

    public void showArtist(Artist artist) {
        Main.logger.info("The artist we read " + readArtist().getName());
        Main.logger.info("The album we read from the injected service: " + albumService.readAlbum().getTitle());
    }
}
