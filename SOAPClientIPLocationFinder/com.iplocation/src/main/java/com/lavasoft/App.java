
package com.lavasoft;

import com.lavasoft.GeoIPService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        if (args.length != 1) {
//        	String ipAdress = args[0];
        	GeoIPService serv = new GeoIPService();
        	String loc = serv.getGeoIPServiceSoap().getIpLocation("172.217.23.206");
        	System.out.println(loc);
        }
        else {
        	String ipAdress = args[0];
        	GeoIPService serv = new GeoIPService();
        	String loc = serv.getGeoIPServiceSoap().getIpLocation("185.58.73.39");
        	System.out.println(loc);
        	System.out.println("just checkig... 03092020");
        }
        	
    }
}
