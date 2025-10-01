package Patterns.Observer;

public class ObserverPattern {

  public void runObserverPattern(){
    EmailTopic topic = new EmailTopic();
    Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
    Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
    Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");

    topic.register(firstObserver);
    topic.register(secondObserver);
    topic.register(thirdObserver);

    firstObserver.setSubject(topic);
    secondObserver.setSubject(topic);
    thirdObserver.setSubject(topic);

    firstObserver.update();

    topic.postMessage("Hola Subs!");

    topic.unregister(firstObserver);

    topic.postMessage("Hola Fellas!");
  }

}
