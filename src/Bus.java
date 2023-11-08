import java.util.Scanner;

public class Bus {
    Scanner scan = new Scanner(System.in);
    private double cost;
    private double distance;
    private int age;
    private byte travelType;
    private byte seatNumber;



    public void getInformation(){
        System.out.print("Your distance (km) : ");
        distance = scan.nextDouble();
        while(distance < 0){
            System.out.println("Distance can't be lower than 0 km!");
            System.out.print("Write again : ");
            distance = scan.nextInt();
        }

        System.out.print("Your age : ");
        age = scan.nextInt();
        while(age<0){
            System.out.println("Age can't be negative");
            System.out.print("Write again : ");
            age = scan.nextInt();
        }

        System.out.print("Your travel type (Choose a number) :\n1-One Way\n2-Round Trip : ");
        travelType = scan.nextByte();
        while(travelType!=1 && travelType!=2){
            System.out.println("You can either choose 1-One Way or 2-Round Trip");
            System.out.print("Write again : ");
            travelType = scan.nextByte();
        }

        System.out.println("\\nSeat Number Locations : ");
        System.out.println("----------------------");
        int k = 0;
        for(int i = 1; i<22; i++){
            if(i%2==0){
                System.out.println("|                    |");
            }else{
                System.out.println("| ____ ____     ____ |");
                System.out.println("| |"+String.format("%02d", k+1)+"| |"+String.format("%02d", k+2)+"|     |"+String.format("%02d", k+3)+"| |");
                System.out.println("| ---- ----     ---- |");
                k+=3;
            }
        }
        System.out.println("----------------------");
        System.out.println("Choose your seat number (Single seats cost %20 more) : ");
        seatNumber = scan.nextByte();
        while(seatNumber<1 || seatNumber>33){
            System.out.println("You may have entered incorrectly! Seat numbers only from 1 to 33 are available");
            System.out.print("Write again : ");
            seatNumber = scan.nextByte();
        }
    }



    public void calculate(){

        double costPerKm;
        if(seatNumber%3==0){
            costPerKm = 1.2;
        }else{
            costPerKm = 1;
        }

        boolean roundTrip = travelType==2;
        if(roundTrip){
            distance = distance*2;
        }

        cost = distance*costPerKm;

        if(roundTrip){
            cost = cost*4/5;
        }

        if(age<12){
            cost/=2;
        }else if(age<24){
            cost = cost*9/10;
        }else if(age>65){
            cost = cost*7/10;
        }
    }



    public void showTheBill(){
        System.out.println("\nTotal distance to go = "+distance+"kms");
        System.out.println("Your age = "+age);
        if(travelType==1){
            System.out.println("Your travel type = One Way");
        }else{
            System.out.println("Your travel type = Round Trip");
        }
        System.out.println("Your seat number = "+seatNumber);
        System.out.println("Here is your cost = "+cost);
    }
}
