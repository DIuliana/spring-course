package ro.learnstuff.xmlconf.services.contract;

import ro.learnstuff.domain.Artist;

/**
 * Created by Iuliana on 11/12/2016.
 */
public interface ArtistService {

    Artist readArtist();

    void showArtist(Artist artist);
}
