package GeekBrains.OOP.Seminar_7.Adapter;

import java.time.LocalDateTime;

public interface MeteoSensor {
    int getId();   //получить идентификатор датчика

    Float getTemperature();   //получить температура датчика

    Float getHumidity();   //получить влажность

    Float getPressure();   //получить давление

    LocalDateTime getDate();   //получить время чтения данных датчика

    LocalDateTime getDateTime();
}

