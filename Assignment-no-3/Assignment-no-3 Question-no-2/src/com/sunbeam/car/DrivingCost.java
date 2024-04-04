package com.sunbeam.car;

import java.util.Scanner;

public class DrivingCost {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Total miles driven per day-");
		double TotalMilesDrivenPerDay= sc.nextDouble();
		System.out.println("Cost per gallon of gasoline-");
		double CostPerGallonOfGasoline= sc.nextDouble();
		System.out.println("Average miles per gallon-");
		double AverageMilesPerGallon= sc.nextDouble();
		System.out.println("ParkingFeesPerDays-");
		double ParkingFeesPerDays= sc.nextDouble();
		System.out.println("Tolls Per Day-");
		double TollsPerDay= sc.nextDouble();
		
		double FuelCost=(TotalMilesDrivenPerDay/AverageMilesPerGallon)*CostPerGallonOfGasoline;
		double TotalCost=FuelCost+ParkingFeesPerDays+TollsPerDay;
		
		System.out.println("Total Bill-"+TotalCost);
		

	}

}
