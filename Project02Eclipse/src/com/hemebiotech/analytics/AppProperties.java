package com.hemebiotech.analytics;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppProperties {
    private Properties appProps;

    public AppProperties() throws IOException {
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
    public String getPathInput(){
        return this.appProps.getProperty("path.input");
    }
    public String getPathOutput(){
        return this.appProps.getProperty("path.output");
    }
}

