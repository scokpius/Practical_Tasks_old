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


}
