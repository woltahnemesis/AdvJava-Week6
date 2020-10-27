import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class SuperAwesomeChartController implements Initializable {

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis minutesAsleep;

    @FXML
    private ImageView imageView;

    private XYChart.Series sleepSeries, mondaySleepSeries, wednesdaySleepSeries;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sleepSeries = new XYChart.Series();
        mondaySleepSeries = new XYChart.Series();
        // Instantiation for hash map
        wednesdaySleepSeries = new XYChart.Series<>();

        sleepSeries.setName("Tuesday night");
        mondaySleepSeries.setName("Monday night");
        wednesdaySleepSeries.setName("Wednesday night");

        xAxis.setLabel("Time of Night");
        minutesAsleep.setLabel("Minutes Asleep");

        // Chart using hash map
        HashMap<String, Integer> wednesdaySleep = new HashMap<>();
        wednesdaySleep.put("10 pm", 60);
        wednesdaySleep.put("11 pm", 60);
        wednesdaySleep.put("12 pm", 60);
        wednesdaySleep.put("1 am", 60);
        wednesdaySleep.put("2 am", 60);
        wednesdaySleep.put("3 am", 60);
        wednesdaySleep.put("4 am", 60);
        wednesdaySleep.put("5 am", 60);
        wednesdaySleep.put("6 am", 30);

        // Using for each loop to add data
        for (String timeOfNight: wednesdaySleep.keySet())
        {
            wednesdaySleepSeries.getData().add(new XYChart.Data(timeOfNight,wednesdaySleep.get(timeOfNight)));
        }

        sleepSeries.getData().add(new XYChart.Data("10 pm", 45));
        sleepSeries.getData().add(new XYChart.Data("11 pm", 60));
        sleepSeries.getData().add(new XYChart.Data("12 pm", 60));
        sleepSeries.getData().add(new XYChart.Data("1 am", 30));
        sleepSeries.getData().add(new XYChart.Data("2 am", 0));
        sleepSeries.getData().add(new XYChart.Data("3 am", 0));
        sleepSeries.getData().add(new XYChart.Data("4 am", 15));
        sleepSeries.getData().add(new XYChart.Data("5 am", 60));
        sleepSeries.getData().add(new XYChart.Data("6 am", 30));

        mondaySleepSeries.getData().add(new XYChart.Data("10 pm", 45));
        mondaySleepSeries.getData().add(new XYChart.Data("11 pm", 60));
        mondaySleepSeries.getData().add(new XYChart.Data("12 pm", 60));
        mondaySleepSeries.getData().add(new XYChart.Data("1 am", 60));
        mondaySleepSeries.getData().add(new XYChart.Data("2 am", 60));
        mondaySleepSeries.getData().add(new XYChart.Data("3 am", 30));
        mondaySleepSeries.getData().add(new XYChart.Data("4 am", 60));
        mondaySleepSeries.getData().add(new XYChart.Data("5 am", 60));
        mondaySleepSeries.getData().add(new XYChart.Data("6 am", 30));

        barChart.getData().addAll(mondaySleepSeries);
        barChart.getData().addAll(sleepSeries);
        barChart.getData().addAll(wednesdaySleepSeries);

    }
}
