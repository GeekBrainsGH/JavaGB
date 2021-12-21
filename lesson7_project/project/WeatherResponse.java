package lesson7_project.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeCodec;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherResponse {


    public void weatherRersponse(String str) throws JsonProcessingException {

        for (int i = 0; i < 5; i++) {
            ObjectMapper objectMapper = new ObjectMapper();
            String date = objectMapper.readTree(str).at("/DailyForecasts/" + i + "/Date").asText();
            String minTemp = objectMapper.readTree(str).at("/DailyForecasts/" + i + "/Temperature/Minimum/Value").asText();
            String minTempUnit = objectMapper.readTree(str).at("/DailyForecasts/" + i + "/Temperature/Minimum/Unit").asText();
            String maxTemp = objectMapper.readTree(str).at("/DailyForecasts/" + i + "/Temperature/Maximum/Value").asText();
            String maxTempUnit = objectMapper.readTree(str).at("/DailyForecasts/" + i + "/Temperature/Maximum/Unit").asText();
            String dayIconPhrase = objectMapper.readTree(str).at("/DailyForecasts/" + i + "/Day/IconPhrase").asText();
            String nightIconPhrase = objectMapper.readTree(str).at("/DailyForecasts/" + i + "/Night/IconPhrase").asText();

            //System.out.println(date + ": ожидается " + dayIconPhrase+ " днем, " + nightIconPhrase + " ночью; Минимальная температура: " + minTemp + minTempUnit + ", максимальная температура: " + maxTemp + maxTempUnit);
            System.out.printf("%s ожидается %s днем, %s ночью; Минимальная температура: %s%s, максимальная температура: %s%s.", date, dayIconPhrase, nightIconPhrase, minTemp, minTempUnit, maxTemp, maxTempUnit);
            System.out.println();

        }

    }

}


