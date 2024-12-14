package subject;

import java.util.ArrayList;

import java.util.List;

import observer.Observer;

public class server implements subject

{


    private List<Observer> observer;

    private int previous;

    private int current;



    public server()
    {

        current = 1;

        observer = new ArrayList<>();

    }


    public void setCurrentState(int current)
    {
        previous = this.current;
        this.current = current;

        notifyAllObservers();

        return;

    }




    public int getCurrentState()
    {

        return current;

    }



    public int getPreviousState()
    {

        return previous;

    }




    @Override
    public void Attach(Observer observers)
    {

        observer.add(observers);

        return;

    }



    @Override
    public void notifyAllObservers()
    {

        for(Observer observers: observer)
        {

            observers.notifyObserver();

        }

        return ;

    }



    @Override
    public boolean Detach(String name)
    {

        int idx = -1;


        for(int i=0; i<observer.size(); i++)
        {

            if(name.equalsIgnoreCase(observer.get(i).getName()))
            {

                idx = i;

            }

        }




        if(idx == -1)
        {

            return false;

        }


        else
        {

            observer.remove(observer.get(idx));
            return true;

        }
    }




    public Observer getUser(int idx)
    {

        return observer.get(idx);

    }


    public int getListSize()
    {

        return observer.size();

    }


}
