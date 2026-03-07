import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        DistanceService.initialize();

        while(true){

            System.out.println("\n===== COURIER SYSTEM =====");
            System.out.println("1.Book Parcel");
            System.out.println("2.Track Parcel");
            System.out.println("3.Update Status");
            System.out.println("4.Generate Invoice");
            System.out.println("5.View All");
            System.out.println("6.Exit");

            int ch=sc.nextInt();

            switch(ch){

                case 1:
                    CourierService.bookParcel();
                    break;

                case 2:
                    CourierService.trackParcel();
                    break;

                case 3:
                    CourierService.updateStatus();
                    break;

                case 4:
                    CourierService.generateInvoice();
                    break;

                case 5:
                    CourierService.viewAll();
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}