import java.util.Scanner;

public class RunBloodData{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BloodData bd = new BloodData();
		String data;
		
		System.out.print("Enter blood type of patient: ");
		String btp = sc.nextLine();
		bd.setBloodType("O");
		
		System.out.print("Enter the Rhesus factor(- or +): ");
		String rf = sc.nextLine();
		bd.setRhFactor("+");
		
		data = btp + rf;
		
		if(data.equals("A+") || data.equals("A-") || data.equals("AB+") || data.equals("AB-") || data.equals("B+") || data.equals("B-")|| 
			data.equals("O+") || data.equals("O-")){
			 bd.setBloodType(btp);
			 bd.setRhFactor(rf);
			 System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
			}
			else if(data.isEmpty()){
				System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
			}
			else{
				System.out.println("Invalid!");
			}
		sc.close();
	}
}