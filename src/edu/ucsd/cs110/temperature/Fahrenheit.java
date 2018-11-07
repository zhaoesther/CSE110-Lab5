package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((this.getValue() - 32) * (float)5/(float)9);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        String s = Float.toString(this.getValue()) + " F";
        return s;
    }
}