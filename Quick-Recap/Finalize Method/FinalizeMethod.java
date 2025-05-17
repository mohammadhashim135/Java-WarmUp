public class FinalizeMethod {


    @Override
    protected void finalize() throws Throwable 
    {
        System.out.println("finalize method called");
        super.finalize();
    }

    public static void main(String[] args) 
    {
        FinalizeMethod o = new FinalizeMethod();
        o = null;
        System.gc();
        System.out.println("Main ended");
    }
}
