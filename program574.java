import java.io.*;
import java.util.*;


public class program574
 {
    public static void main(String A[])throws Exception
    {   

        byte buffer[]= new byte [100];

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
                
                while((iret=fiobj.read(buffer))!=-1)
                    {
                        System.out.print(new String(buffer));
                    }
                    System.out.println("");
            }
        else
            {
                System.out.println("there is no such file");
            }
        
        sobj.close();
    }
}
