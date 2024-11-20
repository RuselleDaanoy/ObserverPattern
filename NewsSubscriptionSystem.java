public class NewsSubscriptionSystem {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        Subscriber firstSub = new Subscriber("Rus");

        newsAgency.attach(firstSub);

        System.out.println("Today's News Update:");
        newsAgency.publishNews("Class suspension due to Pepito.");

        newsAgency.detach(firstSub);

        Subscriber newSub = new Subscriber("Sel");
        newsAgency.attach(newSub);

        System.out.println("\nLatest Update!");
        newsAgency.publishNews("Super Typhoon Pepito: Damage, recovery, relief efforts in the Philippines");
    }
}
