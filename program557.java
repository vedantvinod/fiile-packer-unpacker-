import java.io.*;
import java.util.*;


public class program557
 {
    public static void main(String Arr[])throws Exception
    {
        File fobj=new File("demo.txt");
        boolean bret =fobj.createNewFile();
        if (bret== true )
            {
                System.out.println("file gets created successfully");
            }
            else{
                System.out.println("unable to create file ");

            }
            
       
    }
}
