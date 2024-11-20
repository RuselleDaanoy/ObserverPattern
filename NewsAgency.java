import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements DynamicSubscription {
    private List<ImplementsSubscriber> subscriberList; 
    private String latestNews;

    public NewsAgency() {
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void attach(ImplementsSubscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(ImplementsSubscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (ImplementsSubscriber subscriber : subscriberList) {
            subscriber.specialReport(latestNews);
        }
    }

    public void publishNews(String news) {
        this.latestNews = news;
        notifySubscribers();
    }
}
