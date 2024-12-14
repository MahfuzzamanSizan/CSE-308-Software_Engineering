package main;

import subject.server;

import observer.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass
{

    private static server ABC = new server();

    private static List<Observer> userDetached = new ArrayList<>();

    private static Scanner scn = new Scanner(System.in);


    public static String getServerState(int serverState)
    {

        if (serverState == 1)
        {

            return "Operational";

        }

        else if (serverState == 2)
        {

            return "Partially Down";

        }

        else if (serverState == 3)
        {

            return "Fully Down";

        }

        else
        {

            return "N/A";

        }


    }


    public static void main(String[] args) {


        String type;
        String name;
        int select;


        while (true)
        {

            System.out.println("MENU --> ");

            System.out.println("Previous State: " + getServerState(ABC.getPreviousState()));
            System.out.println("Current State: " + getServerState(ABC.getCurrentState()));

            System.out.println("\n" + "options-->");


            System.out.println("(1) Add User");
            System.out.println("(2) Remove User");
            System.out.println("(3) Change Server State");
            System.out.println("(4) Exit");

            System.out.print("\n" + "select any(1/2/3/4): ");

            select = scn.nextInt();
            type = scn.nextLine();


            if (select == 1)
            {

                if (ABC.getCurrentState() != 1)
                {

                    System.out.println("\n" + "operation failed, server is not operational");
                    continue;

                }


                System.out.println("\n" + "options-->");


                System.out.println("(1) Add New User");
                System.out.println("(2) Add From Previous User");


                System.out.print("\n" + "select any(1/2): ");


                select = scn.nextInt();
                type = scn.nextLine();


                if (select == 1)
                {

                    System.out.print("\n" + "Enter User Name: ");
                    name = scn.nextLine();


                    System.out.print("\n" + "Enter User Type (Premium/Regular): ");
                    type = scn.nextLine();


                    if (type.equalsIgnoreCase("premium"))
                    {

                        new premium(ABC, name);

                    }

                    else if (type.equalsIgnoreCase("regular"))
                    {

                        new regular(ABC, name);

                    }

                    else
                    {

                        System.out.println("\n" + "sorry! invalid type given, try again");

                    }

                }


                else if (select == 2)
                {

                    if (userDetached.size() == 0)
                    {

                        System.out.println("\n" + "no previous user");
                        continue;

                    }

                    System.out.println("\n" + "previous users--> ");


                    for (int i = 0; i < userDetached.size(); i++)
                    {

                        System.out.println("(" + (i + 1) + ") " + userDetached.get(i));

                    }


                    System.out.print("\n" + "Select: ");


                    select = scn.nextInt();
                    type = scn.nextLine();

                    if (select < 1 || select > userDetached.size())
                    {

                        System.out.println("\n" + "Sorry! invalid choice given, try again");

                    }


                    else
                    {

                        userDetached.get(select - 1).setSub(ABC);

                        ABC.Attach(userDetached.get(select - 1));

                        userDetached.remove(select - 1);

                    }

                }


                else
                {

                    System.out.println("\n" + "Sorry! invalid choice given, try again");

                }

            }



            else if (select == 2)
            {


                if (ABC.getCurrentState() != 1)
                {

                    System.out.println("\n" + "operation failed, server is not operational");
                    continue;

                }


                if (ABC.getListSize() == 0)
                {

                    System.out.println("\n" + "no current user");
                    continue;

                }


                System.out.println("\n" + "current users--> ");


                for (int i = 0; i < ABC.getListSize(); i++)
                {

                    System.out.println("(" + (i + 1) + ") " + ABC.getUser(i));

                }


                System.out.print("\n" + "Select: ");


                select = scn.nextInt();
                type = scn.nextLine();


                if (select < 1 || select > ABC.getListSize())
                {

                    System.out.println("\n" + "Sorry! invalid choice given, try again");

                }


                else
                {

                    ABC.getUser(select - 1).setSub(null);

                    userDetached.add(ABC.getUser(select - 1));

                    ABC.Detach(ABC.getUser(select - 1).getName());

                }


            }



            else if (select == 3)
            {

                System.out.println("\n" + "options-->");

                System.out.println("(1) Operational");
                System.out.println("(2) Partially Down");
                System.out.println("(3) Fully Down");


                System.out.print("\n" + "select any(1/2/3): ");


                select = scn.nextInt();
                type = scn.nextLine();


                if (select == ABC.getCurrentState())

                {

                    System.out.println("\n" + "Sorry! same state chosen, try again");
                    continue;

                }


                if (select == 1 || select == 2 || select == 3)
                {

                    ABC.setCurrentState(select);

                    System.out.println();

                }


                else
                {

                    System.out.println("\n" + "Sorry! invalid state given, try again");

                }


            }


            else if (select == 4)
            {

                System.out.println("\n" + "Exiting...");
                break;

            }


            else
            {

                System.out.println("\n" + "Sorry! invalid choice given, try again");

            }


        }

        return;

    }

}
