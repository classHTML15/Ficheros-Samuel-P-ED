package es.fplumara.dam1.textapp.config;

import es.fplumara.dam1.textapp.exceptions.ConfigException;
import es.fplumara.dam1.textapp.files.StoreType;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import java.io.*;

public class AppConfig {

    private StoreType storeType;
    private String messageFile;
    private int maxLength;


    //CONSTRUCTOR AppConfig
    public AppConfig() throws ConfigException {

        Path path = Path.of("data/config.properties");
        Properties prop = new Properties();

        try(FileInputStream file = new FileInputStream("data/config.properties")) {
            prop.load(file);
        } catch (Exception excep) {
            throw new ConfigException("No se puede encontrar el archivo data/config.properties");
        }

        String key = prop.getProperty("key");
        if (key == null) {
            throw new ConfigException("Falta la clave obligatoria");
        }

        if ()





    }


    public int getMaxLength() {
        return maxLength;
    }

    public String getMessageFile() {
        return messageFile;
    }

    public StoreType getStoreType() {
        return storeType;
    }

}
