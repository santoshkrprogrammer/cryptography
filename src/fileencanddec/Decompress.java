/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileencanddec;
import java.io.*;
import java.util.zip.*;
/**
 *
 * @author Dell
 */
public class Decompress 
{
public Decompress(String s,String d) throws IOException
{
    File source=new File(s);
    File destination=new File(d);
    try
    {
        byte[] buffer=new byte[1024];
        FileInputStream fis=new FileInputStream(source);
        GZIPInputStream gzis=new GZIPInputStream(fis);
        FileOutputStream fos=new FileOutputStream(destination);
        int read;
        while((read=gzis.read(buffer))!=-1)
        {
            fos.write(buffer,0,read);
        }
        gzis.close();
        fis.close();
        fos.close();
        source.delete();
    }
    catch(IOException e)
    {
        System.out.print(e);
    }
}
}
