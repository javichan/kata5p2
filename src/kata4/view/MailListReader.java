package kata4.view;
 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
 import kata4.model.Mail;
 public final class MailListReader {
	
	private static final Logger LOGGER = Logger.getLogger(MailListReader.class.getName());
	
	private MailListReader() {}
	
	public static List<Mail> read(final String filename) {
		
		List<Mail> mails = null;
		
		try(final BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			
			mails = reader.lines()
			.filter(line -> line.trim().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"))
			.map(line -> new Mail(line))
			.collect(Collectors.toList());
			
			
		} catch(IOException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
		
		return mails;
		
	}
 }