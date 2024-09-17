import java.util.Scanner;

public class railwayTicket {
    String name;
    String coach;
    long mob_no;
    int amt = 400;
    int totalAmt;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Passenger name :");
        name = sc.nextLine();
        System.out.println("Enter coach : 1A , 2A , 3A , SL");
        coach = sc.nextLine();
        System.out.println("Mobile Number :");
        mob_no = sc.nextLong();
    }

    void update() {

        if (coach.equals("1A")) {
            totalAmt = amt + 700;
        } else if (coach.equals("2A")) {
            totalAmt = amt + 500;
        } else if (coach.equals("3A")) {
            totalAmt = amt + 250;
        } else if (coach.equals("SL")) {
            totalAmt = amt;
        } else {
            coach = "invalid";
        }

    }

    void display() {
        System.out.println("PASSENGER DETAILS:");
        System.out.println("Passenger name :" + name);
        System.out.println("coach :" + coach);
        System.out.println("contact : " + mob_no);
        System.out.println("Total amount : " + totalAmt);
    }

    public static void main(String[] args) {
        railwayTicket obj = new railwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}
