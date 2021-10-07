package Utilities;

import java.io.File;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.Formatter;

public class SQLGenerator {
    public static void createSQL()
    {
        SecureRandom rng = new SecureRandom();
        //try...with resources will auto close anything in the ()
        try(
                Formatter formatter = new Formatter(new File("cameraSQLInserts.sql"));
                )
        {
            for (int i=1; i<=5000; i++)
            {
                LocalDate dateSold = LocalDate.now().minusDays(rng.nextInt(1095));
                formatter.format("INSERT INTO cameraSales (cameraId, dateSold) VALUES (%d, '%s');%n",rng.nextInt(10)+1,dateSold);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createSQL();
    }
}
