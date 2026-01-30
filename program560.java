import java.io.*;
import java.util.*;


public class program560
 {
    public static void main(String Arr[])throws Exception
    {   
        String FileName=null;
        boolean bret=false;
        File fobj=null;
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("enter the name of file");

        FileName=sobj.nextLine();
        
         fobj=new File(FileName);
        bret=fobj.exists();
        if (bret==true)
            {
               fobj.delete();
               System.out.println("file gets deleted");
            }
        else{
                System.out.println("there is no such file");
            }
       sobj.close();
    }
}
