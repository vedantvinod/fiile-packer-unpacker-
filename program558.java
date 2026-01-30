import java.io.*;
import java.util.*;


public class program558
 {
    public static void main(String Arr[])throws Exception
    {   
        String FileName=null;

        Scanner sobj= new Scanner(System.in);
        
        System.out.println("enter the name of file");

        FileName=sobj.nextLine();
        
        File fobj=new File(FileName);
        boolean bret =fobj.createNewFile();
        if (bret== true )
            {
                System.out.println("file gets created successfully");
            }
            else{
                System.out.println("unable to create file ");

            }
            
       sobj.close();
    }
}
