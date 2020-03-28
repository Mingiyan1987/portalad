package ru.basanov.portalad;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.basanov.portalad.controller.UserController;
import ru.basanov.portalad.dto.FeedMessage;
import ru.basanov.portalad.model.Feed;
import ru.basanov.portalad.parser.RSSFeedParser;

import java.net.URL;


@EnableConfigServer
@SpringBootApplication
public class PortaladApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortaladApplication.class, args);
        RSSFeedParser parser = new RSSFeedParser(
                "http://www.oracle.com/ocom/groups/public/@ocom/documents/webcontent/195094.xml");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);

        }
    }
}
