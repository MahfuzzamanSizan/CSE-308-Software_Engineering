package observer;

import subject.server;

import java.util.Scanner;

public class premium extends Observer
{

    public premium(server ABC, String name)
    {
        super(ABC, name);
    }



    @Override
    public void updateAll()
    {

        if(getState() == 1)
        {

            System.out.println("\n"+" is using ABC server");

        }


        else if(getState() == 2)
        {

            System.out.println("\n"+" is using both ABC and DEF servers");

        }


        else if(getState() == 3)
        {

            System.out.println("\n"+" is using DEF server");

        }


        return ;

    }





    @Override
    public void notifyObserver()
    {

        if(getSub() == null)
        {

            return ;

        }


        int currentState = getSub().getCurrentState();
        int previousState = getSub().getPreviousState();


        int select;
        String input;


        Scanner scn = new Scanner(System.in);



        System.out.println("\n"+" --> "+this+" notified");


        if(previousState==1 && currentState==2)
        {

            System.out.println("\n"+"options-->");

            System.out.println("\n"+"(1) use service from two servers, ABC and DEF");
            System.out.println("\n"+"(2) use service from one server, DEF");

            System.out.print("\n"+"select any(1/2): ");


            select = scn.nextInt();
            input = scn.nextLine();


            if(select == 1)
            {

                setState(2);

            }


            else if(select == 2)
            {

                setState(3);

            }


            else
            {
                System.out.println("\n"+"invalid choice is given, choosing option (2)");
                setState(3);

            }


        }


        else if(previousState==1 && currentState==3)
        {

            setState(3);

        }


        else if(previousState==2 && currentState==3)
        {


            if(getState() == 2)
            {

                setState(3);

            }

        }



        else if((previousState==2 || previousState==3) && currentState==1)
        {

            setState(1);

        }



        updateAll();

        return ;
    }



    @Override
    public String toString()
    {

        return getName() + " (premium user) ";

    }


}
