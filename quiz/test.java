import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class test {
	public static void main (String[] args){
		String path = "/home/soravitp/test0";
		String[] listpath = path.split("/");
        	String lastpath = listpath[listpath.length-1];
        	System.out.println(lastpath);
		findPath(path,1);	
	}
	public static void findPath(String path, int count){
		String[] listpath = path.split("/");
		String lastpath = listpath[listpath.length-1];
		File f = new File(path);
		File[] files =  f.listFiles();
		
		for ( int i = 0 ; i < files.length ; i++ ){
			if ( count > 0 ) {
			      for ( int j = 1 ; j < count ; j++){
				System.out.print("      ");                       
			      }
			    }
			    System.out.print("L");
			    System.out.print("_____");
		    File file = files[i];
		    String filename = file.getName();
		    if ( file.isDirectory() ){
		    System.out.println(filename);
		        String nextpath = files[i].toString();
		        findPath(nextpath, count+1);
		    }
		    else {
		        System.out.println(filename);
			}
		}
	}
}
