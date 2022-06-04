package domain;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer> observers= new ArrayList<>();

    public void RegisterObserver(Observer obs){
        getObservers().add(obs);
    };


    public void RemoveObserver(Observer obs){
        getObservers().remove(obs);
    };


    public void NotifyObservers(){
        for (Observer obs : getObservers()){
            obs.update();
        }
    };

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public String getIdentity() {
        return null;
    }
}