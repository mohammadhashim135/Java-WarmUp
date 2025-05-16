public class StaticBlock 
{
    static
    {
        System.out.println("Its me I Guess.(Before Main Block)");
    }

    public static void main(String[] args) 
    {
        System.out.println("I am from Main Block.");    
    }

    static
    {
        System.out.println("Its me again I Guess.(After Main Block)");
    }
}
