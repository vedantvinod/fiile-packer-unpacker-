import java.io.*;
import java.util.*;


public class program567
 {
    public static void main(String Arr[])throws Exception
    {   
        String FileName=null;
        boolean bret=false;
        FileReader frobj=null;
        File fobj=null;
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("enter the name of file");
        FileName= sobj.nextLine();
        fobj=new File(FileName);
        if (fobj.exists())
            {
                System.out.println("File name: "+fobj.getName());
                System.out.println("file path :"+fobj.getAbsolutePath());
                System.out.println("file size :"+fobj.length());

            }
        else
            {
                System.out.println("there is no such file");
            }
        
        sobj.close();
    }
}
