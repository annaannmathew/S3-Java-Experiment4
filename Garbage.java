import java.util.*;
import java.lang.*;
public class Garbage
{  
    public static void main(String args[])
    {  
        Garbage s1=new Garbage();  
        Garbage s2=new Garbage();
        Garbage s3=new Garbage();
        s1=s2;  
        s2=null;  
        s3.finalize();
    }  
    public void finalize()
    {
        System.out.println("object is garbage collected");
    }  
} 
