package kata52;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author usuario
 */
public class kata52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException{
        ArrayList<String> mailList= Loader.read();
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        new HistogramDisplay(histogram).execute();
       
    }
 
    
}