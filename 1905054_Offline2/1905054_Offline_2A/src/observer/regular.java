package observer;

import subject.server;

import java.util.Scanner;

public class regular extends Observer
{

    public regular(server ABC, String name)
    {
        super(ABC, name);
    }


    @Override
    public void updateAll()
    {

        if(getState() == 1)
        {

            System.out.println("\n"+" using ABC server");

        }


        else if(getState() == 2)
        {

            System.out.println("\n"+" using limited functionality from ABC server");

        }


        else if(getState() == 3)
        {

            System.out.println("\n"+" all data copied to DEF server and DEF server is running");

        }


        else if(getState() == 4)
        {

            System.out.println("\n"+" no service currently, will be notified later");

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



        int previousState = getSub().getPreviousState();
        int currentState = getSub().getCurrentState();

        String input;
        int select;
        int x=100;


        Scanner scn = new Scanner(System.in);


        System.out.println("\n"+" --> "+this+" notified");


        if(previousState==1 && currentState==2)
        {

            System.out.println("\n"+"options--> ");

            System.out.println("\n"+"(1) continue using limited functionality from ABC server");
            System.out.println("\n"+"(2) use service from DEF server with payment");

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

                System.out.println("\n"+"invalid choice  is given, choosing option (1)");

                setState(2);

            }

        }



        else if(previousState==1 && currentState==3)
        {

            System.out.println("\n"+"would you like to use service from DEF server with payment?");


            System.out.println("\n"+"(1) YES");
            System.out.println("\n"+"(2) NO");

            System.out.print("\n"+"select any (1/2): ");


            select = scn.nextInt();
            input = scn.nextLine();

            if(select == 1)
            {

                setState(3);

            }


            else if(select == 2)
            {

                setState(4);

            }


            else
            {

                System.out.println("\n"+"invalid choice is given, choosing option (2)");

                setState(4);

            }


        }


        else if(previousState==2 && currentState==3)
        {

            if(getState() == 2)
            {
                System.out.println("\n"+"would you like to use service from DEF server with payment?");


                System.out.println("\n"+"(1) YES");
                System.out.println("\t"+"(2) NO");

                System.out.print("\n"+"select any (1/2): ");


                select = scn.nextInt();
                input = scn.nextLine();


                if(select == 1)
                {

                    setState(3);

                }


                else if(select == 2)
                {

                    setState(4);

                }


                else
                {

                    System.out.println("\n"+"invalid choice is given, choosing option (2)");

                    setState(4);

                }


            }

        }



        else if((previousState==2 || previousState==3) && currentState==1)
        {

            if(getState() == 3)
            {

                System.out.println("\n"+" total bill for using DEF server is " + x + "$");

            }

            setState(1);


        }



        else if(previousState==3 && currentState==2)
        {

            if(getState() == 4)
            {

                System.out.println("\n"+"would you like to use limited functionality from ABC server?");


                System.out.println("\n"+"(1) YES");
                System.out.println("\n"+"(2) NO");

                System.out.print("\n"+"select any(1/2): ");


                select = scn.nextInt();
                input = scn.nextLine();

                if(select == 1)
                {

                    setState(2);

                }


                else if(select == 2)
                {


                }

                else
                {

                    System.out.println("\n"+"invalid choice is given, choosing option (2)");

                }


            }

        }



        updateAll();


        return ;

    }




    @Override
    public String toString()
    {

        return getName()+" ; regular user ";

    }

}
