import java.io.*;
import java.util.*;


public class program580
 {
    public static void main(String A[])throws Exception
    {    
        Scanner sobj= new Scanner(System.in);
        System.out.println("enter the name of folder ");

        String foldername=sobj.nextLine();

        File fobj = new File(foldername);

        if (fobj.exists())
            {
                System.out.println("folder is present");
            }

        else
                {   
                    System.out.println("there is no such folder");
            }
        
        
    }
}
