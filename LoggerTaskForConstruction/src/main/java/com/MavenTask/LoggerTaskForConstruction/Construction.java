package com.MavenTask.LoggerTaskForConstruction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Construction 
{
	private static final Logger LOGGER = LogManager.getLogger(Construction.class);
	static int areaHouse,returnValue;
	static String stringObject;
	int Construct(String str,int a)
	{
		if(str.equalsIgnoreCase("Standard material"))
			returnValue=1200*areaHouse;
		if(str.equalsIgnoreCase("Above Standard Material"))
			returnValue=1500*areaHouse;
		if(str.equalsIgnoreCase("High Standard Material"))
			returnValue=1800*areaHouse;
		 if(str.equalsIgnoreCase("High Standard Material and Fully automated home"))
			returnValue=2500*areaHouse;
		 return returnValue;
	}
	
	public static void main(String[] args) {
		
		Construction objectForClass=new Construction();
		stringObject = "Standard Material";
		areaHouse = 5;
		LOGGER.info(objectForClass.Construct(stringObject,areaHouse));
		stringObject = "Above Standard Material";
		areaHouse = 6;
		LOGGER.info(objectForClass.Construct(stringObject,areaHouse));
		stringObject = "Standard Material";
		areaHouse = 3;
		LOGGER.info(objectForClass.Construct(stringObject,areaHouse));
		stringObject = "High Standard Material";
		areaHouse = 9;
		LOGGER.info(objectForClass.Construct(stringObject,areaHouse));
		stringObject = "High Standard Material and Fully automated home";
		areaHouse = 10;
		LOGGER.info(objectForClass.Construct(stringObject,areaHouse));
		stringObject = "Above Standard Material";
		areaHouse = 22;
		LOGGER.info(objectForClass.Construct(stringObject,areaHouse));
		stringObject = "high Standard Material";
		areaHouse = 11;
		LOGGER.info(objectForClass.Construct(stringObject,areaHouse));
		stringObject = "Above Standard Material";
		areaHouse = 23;
		LOGGER.info(objectForClass.Construct(stringObject,areaHouse));
		stringObject = "High Standard Material and Fully automated home";
		areaHouse = 15;
		LOGGER.info(objectForClass.Construct(stringObject,areaHouse));

	}

}
