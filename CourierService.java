import java.util.*;

public class CourierService {

    static Scanner sc = new Scanner(System.in);
    static List<Parcel> parcels = new ArrayList<>();
    static int idCounter = 1001;

    public static void bookParcel(){

        sc.nextLine();

        System.out.print("Sender Name: ");
        String sender=sc.nextLine();

        System.out.print("Receiver Name: ");
        String receiver=sc.nextLine();

        System.out.println("Branches: Delhi, Mumbai, Jaipur, Chandigarh");

        System.out.print("Source: ");
        String source=sc.next();

        System.out.print("Destination: ");
        String dest=sc.next();

        double distance=DistanceService.getDistance(source,dest);

        System.out.print("Weight (kg): ");
        double weight=sc.nextDouble();

        System.out.println("1.Standard  2.Express");
        int c=sc.nextInt();

        String category=(c==1)?"Standard":"Express";

        double price=PriceCalculator.calculate(distance,weight,category);

        Parcel p=new Parcel(idCounter++,sender,receiver,source,dest,weight,category,distance,price);

        parcels.add(p);

        System.out.println("Parcel booked. Tracking ID: "+p.trackingId);
    }

    public static void trackParcel(){

        System.out.print("Enter Tracking ID: ");
        int id=sc.nextInt();

        for(Parcel p:parcels){

            if(p.trackingId==id){
                p.display();
                return;
            }
        }

        System.out.println("Parcel not found");
    }

    public static void generateInvoice(){

        System.out.print("Tracking ID: ");
        int id=sc.nextInt();

        for(Parcel p:parcels){

            if(p.trackingId==id){
                p.printInvoice();
                return;
            }
        }

        System.out.println("Parcel not found");
    }

    public static void updateStatus(){

        System.out.print("Tracking ID: ");
        int id=sc.nextInt();

        for(Parcel p:parcels){

            if(p.trackingId==id){

                System.out.println("1.In Transit");
                System.out.println("2.Out for Delivery");
                System.out.println("3.Delivered");

                int s=sc.nextInt();

                if(s==1)p.status="In Transit";
                if(s==2)p.status="Out for Delivery";
                if(s==3)p.status="Delivered";

                System.out.println("Status updated");
                return;
            }
        }

        System.out.println("Parcel not found");
    }

    public static void viewAll(){

        for(Parcel p:parcels)
            p.display();
    }
}