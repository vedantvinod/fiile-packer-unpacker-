import java.io.*;
import java.util.*;


public class program576
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
                String str=null; 
                FileInputStream fiobj = new FileInputStream (fobj);
                int isize =0;
                while((iret=fiobj.read(buffer))!=-1)
                    {   
                        str=new String(buffer,0,iret);
                        System.out.print(str);

                        isize=isize+iret;

                        str=null;
                    }
                    System.out.println("");
                    System.out.println("size of file is "+isize);
            }
        else
            {
                System.out.println("there is no such file");
            }
        
        sobj.close();
    }
}
