package OOPs.Keywords;

public class PrivateAM {
    private static PrivateAM instance;

    private PrivateAM()
    {

    }
    public static PrivateAM getInstance()
    {
        if(instance==null)
        {
            return instance=new PrivateAM();
        }else {
            return instance;
        }
    }


}
