package com.MavenTask.LoggerTaskInterest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interest
{
	private static final Logger LOGGER = LogManager.getLogger(Interest.class);
	// All static variables are used in this program
	static int timePeriod,principal,rateOfInterest,numberOfTimeInterest;
	float simple(int principal,int timePeriod,int rateOfInterest)
	{
		float simpleInterest=(principal*timePeriod*rateOfInterest)/100;
		return simpleInterest;
	}
	double compond(int principal,int timePeriod,int rateOfInterest,int numberOfTimeInterest) 
	{
		float Answer = 1+(rateOfInterest/numberOfTimeInterest);
		float storeValue = numberOfTimeInterest*timePeriod;
		double powerCalculate = Math.pow(Answer,storeValue);
		double compoundInterest = principal*powerCalculate;
		return compoundInterest;
	}

	public static void main(String args[])
	{
			Interest objectForClass=new Interest();
			int principal=2020;
			int timePeriod=3;
			int rateOfInterest=2;
			int numberOfTimeInterest=6;
			LOGGER.info("Simple Interest & Compound Interest");
			LOGGER.info(objectForClass.simple(principal,timePeriod,rateOfInterest));
			LOGGER.info(objectForClass.compond(principal,timePeriod,rateOfInterest,numberOfTimeInterest));
			int principal1=3400;
			int timePeriod1=3;
			int rateOfInterest1=4;
			int numberOfTimeInterest1=2;
			LOGGER.info("Simple Interest & Compound Interest");
			LOGGER.info(objectForClass.simple(principal,timePeriod,rateOfInterest));
			LOGGER.info(objectForClass.compond(principal,timePeriod,rateOfInterest,numberOfTimeInterest));
			int principal2=2500;
			int timePeriod2=3;
			int rateOfInterest2=3;
			int numberOfTimeInterest2=4;
			LOGGER.info("Simple Interest & Compound Interest");
			LOGGER.info(objectForClass.simple(principal,timePeriod,rateOfInterest));
			LOGGER.info(objectForClass.compond(principal,timePeriod,rateOfInterest,numberOfTimeInterest));
			int principal3=3050;
			int timePeriod3=11;
			int rateOfInterest3=5;
			int numberOfTimeInterest3=6;
			LOGGER.info("Simple Interest & Compound Interest");
			LOGGER.info(objectForClass.simple(principal,timePeriod,rateOfInterest));
			LOGGER.info(objectForClass.compond(principal,timePeriod,rateOfInterest,numberOfTimeInterest));
	}
}

