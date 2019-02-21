package Assignment2;

//Create a custom exception that do not have any stack trace.
public class AssignTwe {
    public static void main(String[] args) {
        Implement i = new Implement();
        try
        {
            String bar = i.getBar(0);
        }
        catch (CustomException e)
        {
            e.printStackTrace();
        }
    }
}
class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
}
class Implement
{
    public String getBar(int i) throws CustomException
    {
        if (i == 0)
            throw new CustomException("Anything but zero ...");
        else
            return "Thanks";
    }
}
