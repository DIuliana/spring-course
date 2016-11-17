package ro.learnstuff.xmlconf.services.contract;

import ro.learnstuff.domain.Album;

/**
 * Created by Iuliana on 11/12/2016.
 */
public interface AlbumService {

    Album readAlbum();

    boolean canRead();
}
