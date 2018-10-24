package kata4.model;

public class Mail {
    private final String mail ="";

    public Mail() {
    }

    public String getDomain() {
        for(int i =0; i<mail.length(); i++){
            if(mail.charAt(i)== '@'){
                return mail.substring(i+1, mail.length()-1);
            }
        }
        return null;
    }
}
    