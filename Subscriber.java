public class Subscriber implements ImplementsSubscriber {
    private String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void specialReport(String news) {
        System.out.println("Welcome, " + subscriberName + "! \nSpecial Report: " + news);
    }
}
