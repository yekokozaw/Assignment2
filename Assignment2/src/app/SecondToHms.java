package app;

public class SecondToHms {
	public void Converter(int TotalSecond) {
		int hr=TotalSecond/3600;
		int min=(TotalSecond%3600)/60;
		int sec=TotalSecond%60;
		System.out.println("Time is="+hr+":"+min+":"+sec+"");
		
	}
}
