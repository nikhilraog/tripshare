package com.myweather.clas;

public class Weather {
	
	private int temperature;
	private int humidity;
	boolean rain;
	
	
	public Weather(int temperature, int humidity, boolean rain){
		this.temperature = temperature;
		this.humidity = humidity;
		this.rain = rain;
						
	}
	
	public int getTemperature(){
		
		return temperature;
		
	}
    public int getHumidity(){
		
		return humidity;
		
	}
    public boolean getRain(){
		
		return rain;
		
	}
	
   //public static void main(String[] args){
    	
    	//Weather dallas = new Weather(90,85,true);
    	//Weather bangalore = new Weather(60,20,false);
    	
    //}
	

}
