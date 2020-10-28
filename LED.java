public class LED
{
    private boolean leuchtet; 
    private Kreis lampe; 
    
    /**
     * Constructor for objects of class LED
     */
    public LED(int xpos)
    {
      leuchtet = false; 
      lampe = new Kreis("schwarz",xpos,50);
      lampe.sichtbarMachen();
    }
    
    public void anschalten()
    {
       leuchtet = true;
       lampe.farbeAendern("gelb");
    }
    
    public void ausschalten()
    {
       leuchtet = false; 
       lampe.farbeAendern("schwarz");
    }
}
