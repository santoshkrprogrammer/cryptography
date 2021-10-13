/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoencanddec;
import gui.Main;
import java.io.*;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Dell
 */
public class Compress 
{
public Compress(String s, String d) throws IOException
{
    
    File source=new File(s);
    File destination=new File(d);
   
    try
    {
    byte[] buffer=new byte[1024];
    FileInputStream fis=new FileInputStream(source);
    FileOutputStream fos=new FileOutputStream(destination);
    GZIPOutputStream gzos=new GZIPOutputStream(fos);
    
    int read;
    while((read=fis.read(buffer))!=-1)
    {
        gzos.write(buffer,0,read);
    }
    gzos.finish();
    gzos.close();
    fos.close();
    fis.close();
    source.delete();
}
    catch(IOException e)
    {
        System.out.println(e);
    }
}
    
}
