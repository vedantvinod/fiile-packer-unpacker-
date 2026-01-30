import java.io.*;
import java.util.*;


public class program582
 {
    public static void main(String A[])throws Exception
    {    
        Scanner sobj= new Scanner(System.in);
        System.out.println("enter the name of folder ");

        String foldername=sobj.nextLine();

        File fobj = new File(foldername);

        if (fobj.exists()&&fobj.isDirectory())
            {
                System.out.println("folder is present");
                File farr[]=fobj.listFiles();
                System.out.println("number of files in the file"+farr.length);

                
            }

        else
            {   
                    System.out.println("there is no such folder");
            }
        
        
    }
}
