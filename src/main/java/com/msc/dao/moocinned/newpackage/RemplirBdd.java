package com.msc.dao.moocinned.newpackage;

import com.msc.dao.daoproject.generic.DAO;
import com.msc.dao.moocinned.entity.FormeJuridique;
import com.msc.dao.moocinned.entity.User;
import com.msc.dao.moocinned.entity.dao.UserDAO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author micky
 */
public class RemplirBdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {

        FileReader fr = new FileReader(new File("config.properties"));
        Properties prop = new Properties();
        prop.load(fr);
        fr.close();
        DAO.setDebugMode(Boolean.valueOf(prop.getProperty("debug.mode")));
        DAO.initConnection(prop);
        File listePrenom = new File("prenom.txt");
        File listenom = new File("nom.txt");
        InputStream r = new FileInputStream(listePrenom);
        List<String> prenoms = IOUtils.readLines(r, Charset.forName("UTF-8"));
        IOUtils.closeQuietly(r);
        r = new FileInputStream(listenom);
        List<String> noms = IOUtils.readLines(r, Charset.forName("UTF-8"));
        IOUtils.closeQuietly(r);
        File imgsFolder = new File("F:\\herve\\ineed\\photos");
        Random randomGenerator = new Random();
        User user;
        UserDAO userDao = new UserDAO();
        for (File img : imgsFolder.listFiles()) {
            user = new User();
            user.setPrenom(prenoms.get(randomGenerator.nextInt(prenoms.size())));;
            user.setNom(noms.get(randomGenerator.nextInt(noms.size())));
            user.setAdresse("12 rue " + img.getName());
            user.setAdresseSiege(user.getAdresse());
            user.setDateCreation(new Date());
            user.setDescr("descr entrprise de la mort qui tue");
            user.setDomaine(randomGenerator.nextInt(4));
            user.setEmail(img.getName() + "@test.com");
            user.setFormeJuridique(FormeJuridique.FORME_JURIDIQUE.EURL);
            user.setNombreSalaries(Integer.MIN_VALUE);
            user.setRaisonSociale("Mon entre" + img.getName());
            user.setSiren("123451234");
            user.setUrlPhoto(img.getAbsolutePath().replace("\\", "/"));
            user.setUrlVideo("http://youtube/" + img.getName());
            user.setIdDepartement(randomGenerator.nextInt(14));
            user.setTelephone("023212" + img.getName());
            System.out.println(user);
            userDao.insert(user);
        }
    }

}
