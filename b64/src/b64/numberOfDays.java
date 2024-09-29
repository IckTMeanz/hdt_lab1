package b64;

import java.util.Scanner;

public class numberOfDays {
	public static void main(String[] args) {
		String month;
		System.out.println("Enter month: ");
		Scanner sc =new Scanner(System.in);
		month=sc.nextLine();
		if(month.equals("Jan.")||month.equals("Jan")||month.equals("January")||month.equals("1")) {
			month="1";
		}else if(month.equals("Feb.")||month.equals("Feb")||month.equals("February")||month.equals("2")) {
			month="2";
		}else if(month.equals("Mar.")||month.equals("Mar")||month.equals("March")||month.equals("3")) {
			month="3";
		}
		else if(month.equals("Apr.")||month.equals("Apr")||month.equals("April")||month.equals("4")) {
			month="4";
		}
		else if(month.equals("May")||month.equals("5")) {
			month="5";
		}
		else if(month.equals("June")||month.equals("Jun")||month.equals("6")) {
			month="6";
		}
		else if(month.equals("July")||month.equals("Jul")||month.equals("7")) {
			month="7";
		}
		else if(month.equals("Aug.")||month.equals("Aug")||month.equals("August")||month.equals("8")) {
			month="8";
		}
		else if(month.equals("Sep.")||month.equals("Sep")||month.equals("September")||month.equals("9")) {
			month="9";
		}
		else if(month.equals("Oct.")||month.equals("Oct")||month.equals("October")||month.equals("10")) {
			month="10";
		}else if(month.equals("Nov.")||month.equals("Nov")||month.equals("November")||month.equals("11")) {
			month="11";
		}else if(month.equals("Dec.")||month.equals("Dec")||month.equals("December")||month.equals("12")) {
			month="12";
		}
		
		int days=0;
		System.out.println("Enter year: ");
		int year=sc.nextInt();
		if(month.equals("1")||month.equals("3")||month.equals("5")||month.equals("7")||month.equals("8")||month.equals("10")||month.equals("12")) {
			days=31;
		}else if(month.equals("4")||month.equals("6")||month.equals("9")||month.equals("11")) {
			days=30;
		}
		
		if(month.equals("2")) {
			if(year%4==0) {
				days=29;
			}else {
				days=28;
			}
		}
		System.out.println(days);
	}
}
