public class Parcel {

    int trackingId;
    String sender;
    String receiver;
    String source;
    String destination;
    double weight;
    String category;
    double distance;
    double price;
    String status;

    public Parcel(int trackingId, String sender, String receiver,
                  String source, String destination,
                  double weight, String category,
                  double distance, double price) {

        this.trackingId = trackingId;
        this.sender = sender;
        this.receiver = receiver;
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.category = category;
        this.distance = distance;
        this.price = price;
        this.status = "Booked";
    }

    public void display() {

        System.out.println("\nTracking ID: " + trackingId);
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Route: " + source + " -> " + destination);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Category: " + category);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Price: ₹" + price);
        System.out.println("Status: " + status);
    }

    public void printInvoice() {

        System.out.println("\n===== COURIER INVOICE =====");
        System.out.println("Tracking ID : " + trackingId);
        System.out.println("Sender      : " + sender);
        System.out.println("Receiver    : " + receiver);
        System.out.println("Route       : " + source + " -> " + destination);
        System.out.println("Weight      : " + weight + " kg");
        System.out.println("Category    : " + category);
        System.out.println("Distance    : " + distance + " km");
        System.out.println("Total Price : ₹" + price);
        System.out.println("===========================");
    }
}