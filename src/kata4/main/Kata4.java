package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    
    public List<Mail> mailList;
    Histogram<String> histogram;
    

    public static void main(String[] args) throws IOException {
        Kata4 kata4=new Kata4();
        kata4.execute();
    }
    

    private void input() throws IOException {
        String filename ="C:\\Users\\Javichan\\Documents\\NetBeansProjects\\Kata4\\email.txt";
        mailList= MailListReader.read(filename);
    }
    

    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    

    private void output(){
        HistogramDisplay histoDisplay= new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    

    private void execute() throws IOException {
        input();
        process();
        output();
    }
    
    
}
