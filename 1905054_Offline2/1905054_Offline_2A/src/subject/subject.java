package subject;

import observer.Observer;

public interface subject
{

    void Attach(Observer observer);

    void notifyAllObservers();

    boolean Detach(String name);

}
