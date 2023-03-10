package src;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Controller {
    private WeatherModel weatherModel = new AccuweatherModel();
    private Map<Integer, Period> variants = new HashMap<>();

    public Controller() {
        variants.put(1, Period.ONE_DAY);
        variants.put(5, Period.FIVE_DAYS);
    }

    public void getWeather(String userInput, String selectedCity) throws IOException {
        Integer userIntegerInput = Integer.parseInt(userInput);
        switch (variants.get(userIntegerInput)) {
            case ONE_DAY:
                weatherModel.getWeather(selectedCity, Period.ONE_DAY);
                break;
            case FIVE_DAYS:
                throw new IOException("Метод не реализован!");
//                weatherModel.getWeather(selectedCity, Period.FIVE_DAYS);
//                break;

        }
    }
}
