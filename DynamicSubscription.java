public interface DynamicSubscription {
    void attach(ImplementsSubscriber subscriber);
    void detach(ImplementsSubscriber subscriber);
    void notifySubscribers();
}