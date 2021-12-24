package lesson8_project;

import lesson8_project.WeatherData;
import lesson8_project.Periods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherProvider {
    void getWeather(Periods periods) throws IOException, SQLException;

    List<WeatherData> getAllFromDb() throws IOException, SQLException;
}
