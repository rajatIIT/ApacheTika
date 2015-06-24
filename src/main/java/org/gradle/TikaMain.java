package org.gradle;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

public class TikaMain {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, TikaException, SAXException {
        
        AutoDetector myDetector = new AutoDetector(args);
    }

}
