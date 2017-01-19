package com.msc.dao.moocinned;



import com.msc.dao.daoproject.generic.DAO;
import com.msc.dao.moocinned.controller.DepartementController;
import com.msc.dao.moocinned.controller.UserController;
import com.msc.dao.moocinned.helper.CORSResponseFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.linking.DeclarativeLinkingFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Micky
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(new File("config.properties"));
        Properties prop = new Properties();
        prop.load(fr);
        fr.close();
        DAO.setDebugMode(Boolean.valueOf(prop.getProperty("debug.mode")));
        DAO.initConnection(prop);
        String domain = prop.getProperty("ws.domain");
        if (!domain.endsWith("/")) {
            domain = domain + "/";
        }
        int port = Integer.parseInt(prop.getProperty("ws.port"));
        URI baseUri = UriBuilder.fromUri(domain).port(port).build(new Object[0]);
        Set<Class<?>> clazzs = new HashSet();
       // clazzs.add(MultiPartFeature.class); //a garder !!! permet de faire de l'upload
        clazzs.add(UserController.class);
        clazzs.add(DepartementController.class);
        
        ResourceConfig userResources = new ResourceConfig(clazzs);
        userResources.register(DeclarativeLinkingFeature.class);
        userResources.register(CORSResponseFilter.class);

        JdkHttpServerFactory.createHttpServer(baseUri, userResources, true);
    }

}
