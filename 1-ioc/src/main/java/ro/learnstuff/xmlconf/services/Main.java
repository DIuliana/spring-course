package ro.learnstuff.xmlconf.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ro.learnstuff.builder.ArtefactBuilder;
import ro.learnstuff.domain.Album;
import ro.learnstuff.xmlconf.services.contract.AlbumService;
import ro.learnstuff.xmlconf.services.contract.ArtistService;


/**
 * Created by Iuliana on 11/5/2016.
 */
public class Main {

    public final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Initializing Spring context........");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/application-context.xml");

        logger.info("Spring context initialized.......");

        AlbumService albumService = (AlbumService) applicationContext.getBean("albumService");
        albumService.readAlbum();

        AlbumService anotherAlbumService = (AlbumService) applicationContext.getBean("albumService2");

        anotherAlbumService.readAlbum();

        ArtistService artistService = (ArtistService) applicationContext.getBean("artistService");

        artistService.showArtist(ArtefactBuilder.anArtist());

        logger.info("Spring context end.........");
    }
}
