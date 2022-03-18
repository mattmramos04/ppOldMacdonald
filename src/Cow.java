public class Cow extends Animal
{
    //Instance Variable
    private String name;

    //Constructor
    public Cow(String type, String sound, String name)
    {
        super(type, sound);
        this.name = name;
    }

    //Getters
    public String getIdentifier()
    {
        return name;
    }

    //toString
    public String toString()
    {
        String output = type + "\n" + sound + "\n" + name;
        return output;
    }
}
