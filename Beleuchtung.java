

public class Beleuchtung
{
    private List<LED> lichterkette; 

    /**
     * Konstruktur Beleuchtung erstellt eine neue Lichterkette mit fuenf LEDs
     */
    public Beleuchtung()
    {
       lichterkette = new List<LED>(); 
       lichterkette.append(new LED(20));
       lichterkette.append(new LED(55));
       lichterkette.append(new LED(90));
       lichterkette.append(new LED(125));
       lichterkette.append(new LED(160));
    }
    
    /**
     * Diese Methode soll alle LEDs der Lichterkette ausschalten
     */
    public void alleAusschalten()
    { 
        lichterkette.toFirst();
        while(!(lichterkette.getContent().equals(null)))
        {
            lichterkette.getContent().ausschalten();
            lichterkette.next();
        }
    }
    
    /**
     * Diese Methode soll alle LEDs der Lichterkette anschalten
     */
    public void alleAnschalten()
    {   
        lichterkette.toFirst();
        while(!(lichterkette.getContent().equals(null)))
        {
            lichterkette.getContent().anschalten();
            lichterkette.next();
        }
    }
    
    /**
     * Diese Methode soll jede zweite LED der Lichterkette anschalten
     */
    public void jedeZweiteAnschalten()
    {
        lichterkette.toFirst();
        lichterkette.next();
        while(!(lichterkette.getContent().equals(null)))
        {
            lichterkette.getContent().anschalten();
            lichterkette.next();
            lichterkette.next();
        }
    }
    
    
    
}
