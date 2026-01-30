import java.io.*;
import java.util.*;


public class program571
 {
    public static void main(String A[])throws Exception
    {   
        String FileName=null;
        boolean bret=false;
        File fobj=null;
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("enter the name of file");
        FileName= sobj.nextLine();
        fobj=new File(FileName);
        if (fobj.exists())
            {   byte Arr[]= new byte [50];
                FileInputStream fiobj = new FileInputStream (fobj);
                fiobj.read(Arr);
                System.out.println(Arr);
            }
        else
            {
                System.out.println("there is no such file");
            }
        
        sobj.close();
    }
}
