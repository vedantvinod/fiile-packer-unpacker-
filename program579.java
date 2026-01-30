import java.io.*;
import java.util.*;


public class program579
 {
    public static void main(String A[])throws Exception
    {    
        Scanner sobj= new Scanner(System.in);
        File fobj = new File("ppa.txt");

        if (fobj.exists())
            {
                System.out.println("folder is present");
            }

        else
                {   
                    System.out.println("there is no such folder");
            }
        
        
    }
}
