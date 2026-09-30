
/**
 * Beschreiben Sie hier die Klasse Getrank.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Getrank
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private int ml;
    private boolean alkohol;

    /**
     * Konstruktor für Objekte der Klasse Getrank
     */
    public Getrank(String neuName, int neuMl, boolean neuAlkohol)
    {
        // Instanzvariable initialisieren
        setName(neuName);
        setMl(neuMl);
        setAlkohol(neuAlkohol);
    }
    
    public void setName(String neuName)
    {
        name = neuName;
    }

    public void setMl(int neuMl)
    {
        ml = neuMl;
    }
    
    public void setAlkohol(boolean neuAlkohol)
    {
        alkohol = neuAlkohol;
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     *
     *      */
}