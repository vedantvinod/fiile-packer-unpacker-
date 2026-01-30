import java.io.*;
import java.util.*;


public class program563
 {
    public static void main(String Arr[])throws Exception
    {   
        String FileName=null;
        boolean bret=false;
        File fobj=null;
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("enter the name of file");
        FileName= sobj.nextLine();

        FileReader frobj= new FileReader(FileName);

        frobj.close();
        sobj.close();
    }
}
