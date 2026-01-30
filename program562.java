import java.io.*;
import java.util.*;


public class program562
 {
    public static void main(String Arr[])throws Exception
    {   
        String FileName=null;
        boolean bret=false;
        File fobj=null;
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("enter the name of file");
        FileName= sobj.nextLine();

        FileWriter fwobj= new FileWriter(FileName);
        fwobj.write("jay ganesah");

        fwobj.close();
        sobj.close();
    }
}
