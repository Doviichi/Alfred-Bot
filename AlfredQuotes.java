import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting(String name){
        String greeting = String.format("Hello, %s. Lovley to see you.", name);
        return greeting;
    }
    public String dateAnnouncement(){
        Date date = new Date();
        return "Current date is:" + date;
    }
    public String respondBeforeAlexis(String phrase){
        if (phrase.indexOf("Alexis") > -1) {
            return "She's really of no help. What can i do for you Sr?";
        }
        if (phrase.indexOf("Alfred") > -1){
            return "At your service, naturally. How may i be of assistence?";
        }
        return "Right, and with that i shall retire.";
    }
}
