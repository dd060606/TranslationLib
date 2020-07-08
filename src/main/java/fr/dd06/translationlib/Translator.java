package fr.dd06.translationlib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Translator {
    //The languages folder
    private File langFolder;

    //The default language
    private String defaultLanguage = "english";

    //The selected language
    private String selectedLanguage = "english";

    //Create a new Translator object
    public Translator(File langFolder) {

        this.langFolder = langFolder;

        //Create a directory for languages files
        langFolder.mkdirs();
    }


    //Get default language
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    //Set the default language
    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    //Select a language
    public void selectLanguage(String language) {
        this.selectedLanguage = language;
    }

    //Select the default language
    public void selectDefaultLanguage() {
        this.selectedLanguage = defaultLanguage;
    }

    //Get selected language
    public String getSelectedLanguage() {
        return selectedLanguage;
    }

    //Get languages folder
    public File getLangFolder() {
        return langFolder;
    }

    //Set languages folder
    public void setLangFolder(File langFolder) {
        this.langFolder = langFolder;
    }

    //Get a language file with his name
    public File getLangFileWithName(String nameOfLang) {
        return new File(langFolder.getAbsolutePath() + "/" + nameOfLang + ".lang");
    }

    //Create a language File
    public void createLangFile(String fileName) {
        File file = new File(langFolder + "/" + fileName + ".lang");
        if (!file.exists()) {
            langFolder.mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //Translate a String with an id
    public String translate(String id) {
        try {
            if (!getLangFileWithName(selectedLanguage).exists()) {
                getLangFileWithName(selectedLanguage).createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(getLangFileWithName(selectedLanguage)));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] lineSplit = line.split("=");
                if (lineSplit[0].equalsIgnoreCase(id)) {
                    return lineSplit[1];
                }
            }
            reader.close();
        } catch (IOException e) {

        }
        return null;
    }


}
