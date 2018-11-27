package kata4.main;
 import java.util.List;
 import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReaderBD;
 public class Kata4 {
	
	public static void main(String[] args) {
		
		Kata4 kata = new Kata4("KATA5.db");
		
		kata.execute();
 	}
	
	private final String database;
	private List<Mail> mails;
	private Histogram<String> histogram;
	private HistogramDisplay display;
	public Kata4(final String database) {
		this.database = database;
        }        
	
	private void execute() {
		
		input();
		
		process();
		
		output();
		
	}
	
	private void input() {
		mails = MailListReaderBD.read(database);
	}
	
	private void process() {
		histogram = MailHistogramBuilder.build(mails);
	}
	
	private void output() {
		display = new HistogramDisplay(histogram);
		display.execute();
	}
 }