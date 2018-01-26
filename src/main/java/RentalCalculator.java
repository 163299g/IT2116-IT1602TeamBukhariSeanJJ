public class RentalCalculator {

	public static double carRental(String carModel, int duration, boolean firstTimer,boolean member){
		
		double rentalFees = 0.0;
				// for first timer (5 % discount)
		if (firstTimer){ //first rental
			if (carModel.equals("Honda Fit"))
				rentalFees = 65.0*duration*0.95;
			else
				rentalFees = 80.0*duration*0.95;
		}
		
		else { //subsequent rental 
			if (member) {
			if (carModel.equals("Honda Fit") && (duration > 3)) //more than 3 h for member 20% //should return 260
				rentalFees = 65.0*duration*0.80;
			else if (carModel.equals("Honda Fit") && (duration <= 3) ) //less or 3h for member 10% (76)
				rentalFees = 65.0*duration*0.90;
			else if (carModel.equals("Toyota Wish") && (duration > 3) ) //more than 3h 20% for toyota wish (320)
				rentalFees = 80.0*duration*0.80;
			else if (carModel.equals("Toyota Wish") && (duration <= 3)) //less than or equal 3h 10% for toyota wish (72)
				rentalFees = 80.0*duration*0.90; 
		}
			else { //for non first timer and non member, no discount, normal price
				if (carModel.equals("Honda Fit"))
					rentalFees = 65.0*duration;
				else
					rentalFees = 80.0*duration;
		}
	}
		return rentalFees;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Honda, firsttime, 1D : " + RentalCalculator.carRental("Honda Fit", 1, true,false));
		System.out.println("Toyota, firsttime, 1D : " + RentalCalculator.carRental("Toyota Wish", 1, true,false));		
		System.out.println("Honda, subsequent, 1D : " + RentalCalculator.carRental("Honda Fit", 1, false,true));
		System.out.println("Toyota, subsequent, 1D : " + RentalCalculator.carRental("Toyota Wish", 1, false,true));
		System.out.println("Honda, subsequent, 5D : " + RentalCalculator.carRental("Honda Fit", 5, false,false));
		System.out.println("Toyota, subsequent, 5D : " + RentalCalculator.carRental("Toyota Wish", 5, false,false));
		System.out.println("Honda, subsequent, 5D : " + RentalCalculator.carRental("Honda Fit", 5, false,true));
		System.out.println("Toyota, subsequent, 5D : " + RentalCalculator.carRental("Toyota Wish", 5, false,true));
	}
}

