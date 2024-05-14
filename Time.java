class Time {
    public static void main(String[] args) 
	{    int sec = 100000;
	     int hr = sec%60*60;
		 int min = sec/60;
		 int s = sec%60;		
		System.out.println("Hour"+hr+"Minutes"+min+"Seconds"+sec);
	}
}
