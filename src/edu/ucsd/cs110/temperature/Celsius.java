package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(this.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(
                (this.getValue()*((float)9/(float)5))+32);
    }

    public String toString()
    {
        // TODO: Complete this method
        String s = Float.toString(this.getValue()) + " C";
        return s;
    }
}