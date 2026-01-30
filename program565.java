import java.io.*;
import java.util.*;


public class program565
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
                 frobj= new FileReader(FileName);
                 System.out.println((char)frobj.read());
                 System.out.println((char)frobj.read());
                 System.out.println((char)frobj.read());
            }
        else
            {
                System.out.println("there is no such file");
            }
         if(frobj!=null){   
                         frobj.close();
                        }
        sobj.close();
    }
}
