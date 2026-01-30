import java.io.*;
import java.util.*;


public class program569
 {
    public static void main(String Arr[])throws Exception
    {   
        String FileName=null;
        boolean bret=false;
       
        File fobj=null;
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("enter the name of file");
        FileName= sobj.nextLine();
        fobj=new File(FileName);
        if (fobj.exists())
            {
                FileOutputStream foobj= new FileOutputStream( fobj);

                String str="jay ganesh...";

                foobj.write(str);// error 
            }
        else
            {
                System.out.println("there is no such file");
            }
        
        sobj.close();
    }
}
