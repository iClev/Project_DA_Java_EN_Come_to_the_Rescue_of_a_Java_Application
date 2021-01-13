package com.hemebiotech.analytics;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *  class AppProperties,
 *  correspond au Fichier de gestion des properties
 *
 * @author Clévyd M.
 * @version 15.0.1
 */
public class AppProperties {
    /**
     *
     */
    private Properties appProps;

    /**
     * Constructeur sans argument ou constructeur par défaut
     * ne possède aucune valeur de retour (même pas void).
     */
    public AppProperties() {
        String appConfigPath = System.getProperty("user.dir") + "\\Project02Eclipse\\app.properties";
        this.appProps = new Properties();
        try {
            InputStream in = new FileInputStream(appConfigPath);
            appProps.load(in);
            in.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return
     * {@link AppProperties#getPathInput()}
     */
    public String getPathInput(){
        return this.appProps.getProperty("path.input");
    }

    /**
     * @return
     * {@link AppProperties#getPathOutput()}
     */
    public String getPathOutput(){
        return this.appProps.getProperty("path.output");
    }
}

