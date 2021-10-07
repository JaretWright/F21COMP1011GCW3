package Utilities;

import javafx.scene.chart.XYChart;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtility {
    private static String user = "student";
    private static String pw = "student";
    private static String connectURL = "jdbc:mysql://localhost:3306/javaProjects";

    public static XYChart.Series<String, Integer> getSalesDataByCamera()
    {
        XYChart.Series<String, Integer> salesData = new XYChart.Series<>();

        String sql = "SELECT CONCAT(make,'-',model) AS 'camera', COUNT(salesId) AS 'Units Sold' " +
                     "FROM cameras INNER JOIN cameraSales ON cameras.cameraId = cameraSales.cameraId\n" +
                     "GROUP BY cameras.cameraId;";

        //using the try with resources block ensures that anything opened in the (...) will be closed
        try(
                Connection conn = DriverManager.getConnection(connectURL,user,pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                )
        {
           while (resultSet.next())
           {
               salesData.getData().add(new XYChart.Data<>(resultSet.getString("camera"),resultSet.getInt("Units Sold")));
           }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        return salesData;
    }

}
