import java.io.*;
import java.util.*;


public class program573
 {
    public static void main(String A[])throws Exception
    {   

        byte Arr[]= new byte [100];

        int iret=0;

        String FileName=null;

        boolean bret=false;

        File fobj=null;
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("enter the name of file");
        FileName= sobj.nextLine();
        fobj=new File(FileName);
        if (fobj.exists())
            {   
                FileInputStream fiobj = new FileInputStream (fobj);
              
                iret= fiobj.read(Arr);

                String str= new String(Arr);
                System.out.println("iret="+iret);
                System.out.println(str);
            }
        else
            {
                System.out.println("there is no such file");
            }
        
        sobj.close();
    }
}
