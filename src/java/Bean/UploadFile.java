/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.Part;

/**
 *
 * @author ASUS
 */
@ManagedBean(name = "UploadFile")
@SessionScoped
public class UploadFile {
     private Part file;
    private  String uploads = "C:\\files";
     public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
    public String save() {
        
    try{
        
        InputStream flux = file.getInputStream();
        String fileName = file.getSubmittedFileName();
        Files.copy(flux, new File(uploads, fileName).toPath());
    }
    catch (IOException e) {
        e.printStackTrace();
    }
        return "upload";

    }
    
}
