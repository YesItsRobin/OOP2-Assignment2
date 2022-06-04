package domain;

import java.util.ArrayList;

public class Universe <T extends Body> implements Observer{
    private static Universe single_instance = null;
    private ArrayList<T> bodies=new ArrayList<T>();


    private Universe() {
    }

    public static Universe getInstance()
    {
        if (single_instance == null)
            single_instance = new Universe();

        return single_instance;
    }

    public void addBody(T body){
        bodies.add(body);
    }

    public ArrayList<T> getBodies() {
        return bodies;
    }

    @Override
    public void update() {

    }
}
