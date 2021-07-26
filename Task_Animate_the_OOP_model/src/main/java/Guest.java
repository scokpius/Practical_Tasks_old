import javax.xml.crypto.Data;
import java.util.Date;

public class Guest {
    private Date dateOFBirth;

    public Guest(Date dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    public Date getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(Date dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    public int getAge(Date date){
        Date dateNow = new Date();
        String[] datesNow = dateNow.toString().split(" ");
        String[] dates = date.toString().split(" ");
        int age = Integer.parseInt(datesNow[datesNow.length-1]) - Integer.parseInt(datesNow[dates.length-1]);
        return age;
    }

    public boolean isAdultGuest(int age){
        if (age > 17 ) {return true;};
        return false;
    }

}
