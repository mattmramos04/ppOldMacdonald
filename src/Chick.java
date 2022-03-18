public class Chick extends Animal
{
    //Instance Variable
    private boolean sayCheep;

    //Constructor
    public Chick(String type, String sound, boolean sayCheep)
    {
        super(type, sound);
        this.sayCheep = sayCheep;
        /*if(sayCheep == true)
        {
            sound = "cheep";
        }
        else{}*/
    }

    //Getters
    public boolean getSayCheep()
    {
        return sayCheep;
    }

    //Setters
    public void setSayCheep(boolean sayCheep)
    {
        this.sayCheep = sayCheep;
    }

    //toString
    public String toString()
    {
        String output = type + "\n" + sound;
        return output;
    }
}
