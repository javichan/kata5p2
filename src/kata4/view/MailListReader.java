package kata4.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;


public class MailListReader {
    public static List<Mail> read(String filename) throws FileNotFoundException, 
                                                                    IOException{
        List<Mail> mails= new ArrayList<>();
        try (FileReader fr = new FileReader(filename)) {
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine()) != null){
                for(int i = 0; i<linea.length();i++){
                    if(linea.charAt(i)== '@'){
                        Mail mail= new Mail(linea);
                        mails.add(mail);
                    }
                }
            } 
        }
        return mails;
    }
    
}
