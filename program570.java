import java.io.*;
import java.util.*;


public class program570
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
            {
                FileOutputStream foobj= new FileOutputStream( fobj);

                String str="jay ganesh...";
                
                byte Arr[]=str.getBytes();
               System.out.println("length of byte array"+Arr.length);
                

                foobj.write(Arr);
            }
        else
            {
                System.out.println("there is no such file");
            }
        
        sobj.close();
    }
}
