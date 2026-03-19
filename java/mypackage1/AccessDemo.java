package mypackage1;

import externalpkg.ExternalClass;

public class AccessDemo
{
    public static void main(String[] args)
    {
        InternalClass internalobj = new InternalClass();
        System.out.println(internalobj.internalMessage);
        ExternalClass externalobj = new ExternalClass();
        System.out.println(externalobj.externalMessage);
    }
}
