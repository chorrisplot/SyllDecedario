/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contalletres;

/**
 *
 * @author jesus
 */
public enum Languages {
    SPANISH("Español"),
    VALENCIAN("Valencià"),
    ENGLISH("English");

    private final String lang;

    private Languages(String lang) {
        this.lang = lang;
    }

    public String getLanguageName() {
        return lang;
    }
}
