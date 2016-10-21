package c;

import java.net.URL;
import java.net.URLClassLoader;

public class Main {
	
	public static void main(String[] args) {

        ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	String s = url.getFile();
        	System.out.println(s);
        }
        
        a.impl.Denied denied;
	}
}
