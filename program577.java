import java.io.*;
import java.util.*;


public class program577
 {
    public static void main(String A[])throws Exception
    {   

        byte buffer[]= new byte [1024];
        String str=null; 
        int iret=0;

        File fobjsrc=null;
        File fobjdest= null;

        String FileNamesrc=null;
        String FileNamedest=null;

        boolean bret=false;

        
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("enter the name of source file:");
        FileNamesrc= sobj.nextLine();

        System.out.println("enter the name of destination file:");
        FileNamedest= sobj.nextLine();

        fobjsrc=new File(FileNamesrc);
        if (fobjsrc.exists())
            {  

                fobjdest= new File(FileNamedest);
                fobjdest.createNewFile();


                FileInputStream fiobj = new FileInputStream (fobjsrc);
                FileOutputStream foobj=new FileOutputStream(fobjdest);
                int isize =0;
                while((iret=fiobj.read(buffer))!=-1)
                    {   
                        
                        //System.out.print(str);
                        foobj.write(buffer,0,iret);

                        isize=isize+iret;

                        
                    }
                    System.out.println("file copied succeessfully");
                    System.out.println("size of file is "+isize);
                    fiobj.close();
                    foobj.close();
            }
        else
            {
                System.out.println("there is no source file");
            }
        
        sobj.close();
    }
}
