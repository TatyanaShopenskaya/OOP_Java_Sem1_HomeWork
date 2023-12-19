package GeekBrains.OOP.Seminar_7.Adapter;   //паттерн адаптер (костыль)

import java.time.LocalDateTime;
public abstract class AdapterSensorTemperature implements MeteoSensor{
    SensorTemperature adaptee;

    public AdapterSensorTemperature(SensorTemperature adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int getId() {
        return adaptee.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)adaptee.temperature();   //в скобках (float) -т.к. изначально этот пар-р был в double
    }

    @Override
    public Float getHumidity() {
        return null;    //т.к. влажность не можем получить(нет этого пар-ра)
    }

    @Override
    public Float getPressure() {
        return null;    //т.к. давление  не можем получить(нет этого пар-ра)
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(adaptee.year(), 1,1,0,0);  //эти действия для конвертиции //год-текущий //
        dateTime = dateTime.plusDays(adaptee.day() - 1);  //добавялем к нашей переменной dateTime столько то дней(количество дней класса-1,т.к. единичку мы добавили (строка сверху))
        dateTime = dateTime.plusSeconds(adaptee.second());
        return dateTime;
    }
}
