package observer;

import subject.server;

public abstract class Observer
{

    private server ABC;
    private String name;


    private int state;



    public Observer(server ABC, String name)
    {
        this.ABC = ABC;
        this.name = name;
        this.ABC.Attach(this);
        state = 1;
    }


    public void setSub(server ABC)
    {
        this.ABC = ABC;

        return;
    }


    public server getSub()
    {

        return ABC;

    }



    public void setState(int state)
    {
        this.state = state;

        return ;

    }



    public int getState()
    {

        return state;

    }



    public String getName()
    {

        return name;

    }



    public abstract void updateAll();


    public abstract void notifyObserver();


}
