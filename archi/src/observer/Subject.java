package observer;

import java.util.LinkedList;
import java.util.List;


public class Subject {

    private List<Observer> vector = new LinkedList<>();

    public void addObserver(Observer observer) {
        vector.add(observer);
    }

    public void deleteObserver(Observer observer) {
        vector.remove(observer);
    }

    public void notifyAllObserver() {
        for(Observer observer : vector) {
            observer.toDo();
        }
    }

    // 通知特定观察者
    public void notifyOneObserver(int i) {
        vector.get(i).toDo();
    }

}
