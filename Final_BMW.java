import java.util.*;
import java.io.*;

class Final_BMW
{

    void display(String s[])
    {
        for(int i = 0;i < s.length; i++)
        {
            System.out.println(s[i]);
        }
    }
    
    public static int random()
    {
        int min = 100;
        int max = 999;

        Random r = new Random();
        int i1 = r.nextInt(max - min + 1) + min;
        return i1;
    }
    
    public static int hourRandom()
    {
        int min = 1;
        int max = 15;

        Random r = new Random();
        int i1 = r.nextInt(max - min + 1) + min;
        return i1;
    }
    
    public static int minuteRandom()
    {
        int min = 10;
        int max = 59;

        Random r = new Random();
        int i1 = r.nextInt(max - min + 1) + min;
        return i1;
    }

    public static void main(String args[])throws IOException, InterruptedException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" __________________________________________________________________________________________________"); 
        System.out.println(" ___________________________________________________________________________________________________"); 
        System.out.println(" BBBBBBBBBBBBBBBBB      MMMMMMMM               MMMMMMMM WWWWWWWW                           WWWWWWWW  "); 
        System.out.println(" B::::::::::::::::B     M:::::::M             M:::::::M W::::::W                           W::::::W           ");
        System.out.println(" B::::::BBBBBB:::::B    M::::::::M           M::::::::M W::::::W                           W::::::W   ");
        System.out.println(" BB:::::B     B:::::B   M:::::::::M         M:::::::::M W::::::W                           W::::::W   ");
        System.out.println("   B::::B     B:::::B   M::::::::::M       M::::::::::M W:::::W           WWWWW           W:::::W   ");
        System.out.println("   B::::B     B:::::B   M:::::::::::M     M:::::::::::M   W:::::W         W:::::W         W:::::W   ");
        System.out.println("   B::::BBBBBB:::::B    M:::::::M::::M   M::::M:::::::M    W:::::W       W:::::::W       W:::::W    ");
        System.out.println("   B:::::::::::::BB     M::::::M M::::M M::::M M::::::M     W:::::W     W:::::::::W     W:::::W    ");
        System.out.println("   B::::BBBBBB:::::B    M::::::M  M::::M::::M  M::::::M      W:::::W   W:::::W:::::W   W:::::W     ");
        System.out.println("   B::::B     B:::::B   M::::::M   M:::::::M   M::::::M       W:::::W W:::::W W:::::W W:::::W      ");
        System.out.println("   B::::B     B:::::B   M::::::M    M:::::M    M::::::M        W:::::W:::::W   W:::::W:::::W        ");
        System.out.println("   B::::B     B:::::B   M::::::M     MMMMM     M::::::M         W:::::::::W     W:::::::::W         ");
        System.out.println(" BB:::::BBBBBB::::::B   M::::::M               M::::::M          W:::::::W       W:::::::W         ");
        System.out.println(" B:::::::::::::::::B    M::::::M               M::::::M           W:::::W         W:::::W          ");
        System.out.println(" B::::::::::::::::B     M::::::M               M::::::M            W:::W           W:::W           ");
        System.out.println(" BBBBBBBBBBBBBBBBB      MMMMMMMM               MMMMMMMM             WWW             WWW              ");
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println(" ___________________________________________________________________________________________________"); 
        System.out.println(" Book My Wings © - We Truly Make You Fly..."); 
        System.out.println("");
        System.out.println("Welcome to Book My Wings © ! The one place that truly makes you fly! ");
        System.out.println("_________________________________");
        System.out.println("Guidelines for using BMW : ");
        System.out.println("To Select an option,Please enter the corresponding number.");
        System.out.println("The options are not case-sensitive, but please check your spellings.");
        System.out.println("The bank details,credit card details and other such details are secure and safe to enter."); 

        System.out.println("_________________________________________________________");
        System.out.println("Please Note : ");
        System.out.println("Persons in the age of 12 and above are considered adults.");
        System.out.println("_________________________________________________________");
        System.out.println("_________________________________");

        System.out.println("              ");
        System.out.println("              ");
        System.out.println("Choose area of travel");
        System.out.println("-- 1.Domestic --");
        System.out.println("                ");
        System.out.println("-- 2.International --");
        System.out.println("                ");

        String domestic[] = {"1.Chennai- MAA","2.Mumbai - BOM","3.New Delhi - DEL" ,"4.Kolkata - CCU" ,"5.Bangalore - BLR" ,"6.Hyderabad - HYD" ,"7.Trivandrum  - TRV", "8.Ahmadabad - AMD"};
        String international[] = {"1.New York - JFK","2.London - LCY","3.Paris - CDG","4.Tokyo - HND","5.Dubai - DXB","6.Moscow - DME","7.Sydney - SYD","8.Beijing - BJS","9.Rio de Janeiro  - GIG"};
        Final_BMW b = new Final_BMW();
        String from = "";
        String to = "";
        String cl = "";
        int c1 = 0,c2 = 0,c3 = 0 ,c4 = 0;

        int destE;

        int mm, dd;
        int area = 0,a2 = 0;
        do
        {
            destE = 0;
            
            try
            {
                area = Integer.parseInt(br.readLine());
            }
            catch(Exception e)
            {
                System.out.println("---Error! Enter '1' or '2' only---");
                destE = 1;
            }

            if (area > 2 || area < 1)
            {
                System.out.println("---Error! Enter '1' or '2' only---");
                destE = 1;
            }
        }while(destE!=0);

        do
        {
            destE = 0;
            if ( area == 1)
            {
                System.out.println("Choose 'From' Destination");
                b.display(domestic);
                int fl0;
                do
                {
                    fl0 = 0;
                    try
                    {
                        c1 = Integer.parseInt(br.readLine());
                        from = domestic[c1-1];
                    }
                    catch(Exception e)
                    {
                        System.out.println("---Error! Enter the corresponding number of the city---");
                        fl0 = 1;
                    }
                }while(fl0!=0);

                System.out.println("You have chosen : "+from);

                System.out.println("Area of 'To' Destination");
                System.out.println("--1.Domestic--");
                System.out.println("               ");
                System.out.println("--2.International--");
                System.out.println("                ");
                do
                {
                    destE = 0;
                    a2 = Integer.parseInt(br.readLine());
                    if (area > 2 || area < 1)
                    {
                        System.out.println("---Error! Enter '1' or '2' only---");
                        destE = 1;
                    }
                }while(destE!=0);

                if (a2 == 1)
                {   b.display(domestic);

                    do
                    {
                        fl0 = 0;
                        try
                        {
                            c2 = Integer.parseInt(br.readLine());
                            to = domestic[c2-1];
                        }
                        catch(Exception e)
                        {
                            System.out.println("---Error! Enter the corresponding number of the city---");
                            fl0 = 1;
                        }
                    }while(fl0!=0);

                    if(from.equals(to))
                    {
                        System.out.println("---Error! Departure and Arrival destinations same!---");
                        destE = 1;
                    }
                    else
                        System.out.println("You have chosen : "+to);

                }

                if(a2 == 2)
                {
                    b.display(international);

                    int fl1;
                    do
                    {
                        fl1 = 0;
                        try
                        {
                            c2 = Integer.parseInt(br.readLine());
                            to = international[c2-1];
                        }
                        catch(Exception e)
                        {
                            System.out.println("---Error! Enter the corresponding number of the city---");
                            fl1 = 1;
                        }
                    }while(fl1!=0);

                    if(from.equals(to))
                    {
                        System.out.println("---Error! Departure and Arrival destinations same!---");
                        destE = 1;
                    }
                    else
                        System.out.println("You have chosen : "+to);

                }

            }
        }while(destE!=0);

        do
        {
            destE = 0;
            if( area == 2)
            {
                System.out.println("Choose 'From' Destination");
                b.display(international);
                int fl4,dstE;
                do
                {
                    fl4 = 0;
                    try
                    {
                        c3 = Integer.parseInt(br.readLine());
                        from = international[c3-1];
                    }
                    catch(Exception e)
                    {
                        System.out.println("---Error! Enter the corresponding number of the city---");
                        fl4 = 1;
                    }
                }while(fl4!=0);

                System.out.println("You have chosen : "+from);
                System.out.println("Area of 'To' Destination");
                System.out.println("--1.Domestic--");
                System.out.println("               ");
                System.out.println("--2.International--");
                System.out.println("                ");
                do
                {
                    dstE = 0;
                    try
                    {
                        a2 = Integer.parseInt(br.readLine());
                    }
                    catch(Exception e)
                    {
                        System.out.println("---Error! Enter '1' or '2' only---");
                        dstE = 1;
                    }
                    
                    if (a2 > 2 || a2 < 1)
                    {
                        System.out.println("---Error! Enter '1' or '2' only---");
                        dstE = 1;
                    }
                }while(dstE!=0);

                if (a2 == 1)
                {   b.display(domestic);
                    int fl1;
                    do
                    {
                        fl1 = 0;
                        try
                        {
                            c2 = Integer.parseInt(br.readLine());
                            to = domestic[c2-1];
                        }
                        catch(Exception e)
                        {
                            System.out.println("---Error! Enter the corresponding number of the city---");
                            fl1 = 1;
                        }
                    }while(fl1!=0);

                    if(from.equals(to))
                    {
                        System.out.println("---Error! Departure and Arrival destinations same!---");
                        destE = 1;
                    }
                    else
                        System.out.println("You have chosen : "+to);

                }

                if(a2 == 2)
                {
                    b.display(international);
                    int fl1;
                    do
                    {
                        fl1 = 0;
                        try
                        {
                            c2 = Integer.parseInt(br.readLine());
                            to = international[c2-1];
                        }
                        catch(Exception e)
                        {
                            System.out.println("---Error! Enter the corresponding number of the city---");
                            fl1 = 1;
                        }
                    }while(fl1!=0);

                    if(from.equals(to))
                    {
                        System.out.println("---Error! Departure and Arrival destinations same!---");
                        destE = 1;
                    }
                    else
                        System.out.println("You have chosen : "+to);

                }
            }

        }while(destE!=0);
        System.out.println("_________________________________________");
        System.out.println(from+" --> "+to);

        System.out.println("Enter Date of Travel(dd : 1-31) ");
        int flag,bflag;
        do
        {
            bflag = 0;
            do
            {
                flag = 0;
                dd = Integer.parseInt(br.readLine());
                if(dd>31 || dd<1)
                {
                    System.out.println("----Error! Please Enter a number from 1 - 31----");
                    flag = 1;
                }
            }while(flag!=0);

            System.out.println("Enter Month(mm)");
            System.out.println("(1 for January, 2 for February and so on...)");

            do
            {
                flag = 0;
                mm = Integer.parseInt(br.readLine());
                if(mm>12 || mm<1)
                {
                    System.out.println("----Error! Please Enter a number from 1 - 12----");
                    flag = 1;
                }

                if(mm==4 && dd>30)
                {
                    System.out.println("----Error! This month does not contain the date specified----");
                    flag = 1;
                }
                
                if(mm==6 && dd>30)
                {
                    System.out.println("----Error! This month does not contain the date specified----");
                    flag = 1;
                }
                
                if(mm==9 && dd>30)
                {
                    System.out.println("----Error! This month does not contain the date specified----");
                    flag = 1;
                }
                
                if(mm==11 && dd>30)
                {
                    System.out.println("----Error! This month does not contain the date specified----");
                    flag = 1;
                }

                if(mm==2 && dd>28)
                {
                    System.out.println("----Error! This month does not contain the date specified----");
                    flag = 1;
                }                

            }while(flag!=0);

        }while(bflag!=0);

        System.out.println("Enter Class");
        System.out.println("1.Economy");
        System.out.println("2.Business");
        int flag0;
        do
        {
            flag0 = 0;
            c4 = Integer.parseInt(br.readLine());
            if(c4==1)
                cl = "Economy";
            else if(c4==2)
                cl = "Business";
            else
            { System.out.println("---Error! Please enter '1' or '2' only---");
                flag0=1;
            }
        }
        while(flag0!=0);

        System.out.println("Enter the Number of tickets to be booked :  ");
        int ns = Integer.parseInt(br.readLine());
        int fl,exfl,infl;

        String name[] = new String[ns];
        int age[] = new int[ns] ;
        String sex[] = new String[ns];
        String ph[] = new String[ns];
        System.out.println(from+" --> "+to);
        for(int i = 0; i< ns ; i++)
        {

            System.out.println("Enter Name of Passenger "+(i+1));
            do
            {
                infl = 0;
                name[i] = br.readLine();
                for(int v = 0 ;v < name[i].length(); v++)
                {
                    if(Character.isDigit(name[i].charAt(v)))
                    {
                        System.out.println("---Error! Enter your full name in alphabets--- ");
                        infl = 1;
                        break;
                    }
                }                
            }while(infl!=0);

            System.out.println("Age (in years)");
            do
            {
                exfl = 0;
                try
                {
                    age[i] = Integer.parseInt(br.readLine());
                }
                catch(Exception e)
                {
                    System.out.println("---Error! Please enter your  age in numerals.");
                    exfl = 1;
                }
            }while(exfl!=0);

            System.out.println("Sex (Male,Female, Other)");
            do
            {
                fl = 0;
                sex[i] = br.readLine();
                if(sex[i].equalsIgnoreCase("Male")||sex[i].equalsIgnoreCase("Female")||sex[i].equalsIgnoreCase("Other"))
                    continue;
                else
                {
                    System.out.println("---Error! Enter the sex of the passenger(Check spelling)---");
                    fl =  1;
                }
            }while(fl!=0);

            System.out.println("Phone Number  (India +91)");
            System.out.println("--NOTE : Phone numbers are optional and are for informational purposes only. Please skip, if unavailable--");
            do
            {
                ph[i] = br.readLine();
                fl = 0;
                for(int k = 0; k<ph[i].length();k++)
                {
                    if(Character.isLetter(ph[i].charAt(k)))
                    {
                        System.out.println("---Error! Enter your phone number in numerals---");
                        fl = 1;
                        break;
                    }
                    if(Character.isDigit(ph[i].charAt(k)))
                    {
                        continue;
                    }

                }

            }while(fl!=0);
        }

        System.out.println(from+" --> "+to);
        System.out.println("Searching flights, Please wait...");
        System.out.println("                                                                     ...              ");    
        System.out.println("                                                                  ...7Z$...           ");
        System.out.println("                                                                  ..$...7..           ");
        System.out.println("                                                                   ..$   $..           ");
        System.out.println("                                                                   .$.   $..           ");
        System.out.println("                                                                 ..ZI   7?..           ");
        System.out.println("                                                               ...?7    :$......        ");
        System.out.println("                                                              ..$7..    I$.......        ");
        System.out.println("                                                .. .......... .ZZ.     .7$777$$$...     ");
        System.out.println("                                                ..:$$$$$$$+...$~.      .........$..     ");
        System.out.println("                                                ..$+++++++$$$$..             ...7..     ");
        System.out.println("                                                ..$+++++++$7 ..               .Z$..     ");
        System.out.println("                                                ..$+++++++$7                  ..$..     ");
        System.out.println("                                                ..$+++++++$7                   .$..     ");
        System.out.println("                                                ..$+++++++$7                  .$..      ");
        System.out.println("                                                ..$+++++++$7                 ..7...     ");
        System.out.println("                                                ..$++++??+$7                 .77..      ");
        System.out.println("                                                ..7??++?..$I..................$.        ");
        System.out.println("                                                 ..7+++++?+77$$:,,,,,,,,,,,,,:$Z.        ");
        System.out.println("                                                ..,.............................       ");
        System.out.println("_____________________________________________________________________________________Like us on Facebook!");

        Thread.sleep(7000);

        System.out.flush();
        System.out.println("Flights Found!");
        System.out.println("______________________________________________");
        System.out.println(from+" --> "+to);
        System.out.println("_______________________________________________");
        System.out.println("--Select your choice-- ");
        int fchoice = 0;
        double amount = 0;

        if(a2==1)//Domestic
        {                                                
            double n4 = (Math.random()+1) * 1000;

            int fn1 = random();
            int fn2 = random();
            int fn3 = random();
            
            int Ih = hourRandom();
            int SJh = hourRandom();
            int AIh = hourRandom();
            
            
            int Im = minuteRandom();
            int SJm = minuteRandom();
            int AIm = minuteRandom();

            System.out.println("_____________________________________   ");
            System.out.println(" 1.                                     ");
            System.out.println("  Indigo ");
            System.out.println("  Flight 6E "+fn1);
            System.out.println("  Departure : "+(Ih)+":"+(Im)+"  Arrival : "+(Ih+4)+":"+(Im));
            System.out.println("  Price :  INR "+Math.rint(n4*4)+" + tax");
            System.out.println("_____________________________________   ");
            System.out.println("");

            System.out.println("_____________________________________   ");
            System.out.println(" 2.                                     ");
            System.out.println("  Spicejet ");
            System.out.println("  Flight SG "+fn2);
            System.out.println("  Departure : "+(SJh)+":"+(SJm)+"  Arrival : "+(SJh+2)+":"+(SJm));
            System.out.println("  Price :  INR "+Math.rint((n4*4+100))+" + tax");
            System.out.println("_____________________________________   ");

            System.out.println("");

            System.out.println("_____________________________________   ");
            System.out.println(" 3.                                     ");
            System.out.println("  Air India ");
            System.out.println("  Flight AI "+fn3);
            System.out.println("  Departure : "+(AIh)+":"+(AIm)+"  Arrival : "+(AIh+3)+":"+(AIm));
            System.out.println("  Price :  INR "+Math.rint(n4*4+175)+" + tax");
            System.out.println("_____________________________________   ");

            int fl6;
            do
            {
                fl6 = 0;
                fchoice = Integer.parseInt(br.readLine());
                if(fchoice>3||fchoice<1)
                {
                    System.out.println("---Error! Enter the number that corresponds the Flight Name---");
                    fl6 = 1;
                }
            }while(fl6!=0);
            System.out.println("Ticket Details : ");
            System.out.println(from+" --> "+to);
            System.out.println("Date "+dd+" / "+mm+" / 2015");
            System.out.println("Class : "+cl);

            switch(fchoice)
            {
                case 1 : amount = n4*4; break;
                case 2 : amount = n4*4+100; break;
                case 3 : amount = (n4*4+175); break;
                default : System.out.println("---Error! Wrong Choice---");

            }

            for(int i=0;i<ns;i++)
            {   System.out.println("");
                System.out.println("Name  : "+name[i]);
                System.out.println("Age   : "+age[i]);
                System.out.println("Sex   : "+sex[i]);
                System.out.println("Phone : "+ph[i]);
                System.out.println("___________________");
                System.out.println("");
            }

            if(fchoice==1)
            {  System.out.println("Flight : 6E "+fn1);
                System.out.println("  Departure : "+(Ih)+":"+(Im)+"  Arrival : "+(Ih+4)+":"+(Im));
            }

            if(fchoice==2)
            {  System.out.println("Flight : Spicejet SG "+(fn2));
                System.out.println("  Departure : "+(SJh)+":"+(SJm)+"  Arrival : "+(SJh+2)+":"+(SJm));
            }

            if(fchoice==3)
            {  System.out.println("Flight : Air India AI "+(fn3));
                System.out.println("  Departure : "+(AIh)+":"+(AIm)+"  Arrival : "+(AIh+3)+":"+(AIm));
            }

        }

        if(a2==2)//International
        {            
            
            double n4 = (Math.random()+1) * 1000;

            int ifn1 = random();
            int ifn2 = random();
            int ifn3 = random();
            int ifn4 = random();
            
            int JAh = hourRandom();
            int BAh = hourRandom();
            int CPh = hourRandom();
            int EMh = hourRandom();
            
            
            int JAm = minuteRandom();
            int BAm = minuteRandom();
            int CPm = minuteRandom();
            int EMm = minuteRandom();
            

            System.out.println("_____________________________________   ");
            System.out.println(" 1.                                     ");
            System.out.println("  Jet Airways ");
            System.out.println("  Flight 9W "+ifn1);
            System.out.println("  Departure : "+(JAh)+":"+(JAm)+"  Arrival : "+(JAh+8)+":"+(JAm));
            System.out.println("  Price :  INR "+Math.rint(n4*30)+" + tax");
            System.out.println("_____________________________________   ");

            System.out.println("");

            System.out.println("_____________________________________   ");
            System.out.println(" 2.                                     ");
            System.out.println("  British Airways ");
            System.out.println("  Flight BA "+ifn2);
            System.out.println("  Departure : "+(BAh)+":"+(BAm)+"  Arrival : "+(BAh+9)+":"+(BAm));
            System.out.println("  Price :  INR "+Math.rint(n4*29)+" + tax");
            System.out.println("_____________________________________   ");

            System.out.println("");

            System.out.println("_____________________________________   ");
            System.out.println(" 3.                                     ");
            System.out.println("  Cathay Pacific ");
            System.out.println("  Flight CX  "+ifn3);
            System.out.println("  Departure : "+(CPh-1)+":"+(CPm)+"  Arrival : "+(CPh+5)+":"+(CPm));
            System.out.println("  Price :  INR "+Math.rint(n4*28)+" + tax");
            System.out.println("_____________________________________   ");

            System.out.println("");

            System.out.println("_____________________________________   ");
            System.out.println(" 4.                                     ");
            System.out.println("  Emirates ");
            System.out.println("  Flight EK  "+ifn4);
            System.out.println("  Departure : "+(EMh)+":"+(EMm)+"  Arrival : "+(EMh+6)+":"+(EMm));
            System.out.println("  Price :  INR "+Math.rint(n4*33)+" + tax");
            System.out.println("_____________________________________   ");

            int fl7;
            do
            {
                fl7 = 0;
                fchoice = Integer.parseInt(br.readLine());
                if(fchoice>4||fchoice<1)
                {
                    System.out.println("---Error! Enter the number that corresponds the Flight Name---");
                    fl7 = 1;
                }
            }while(fl7!=0);

            System.out.flush();

            switch(fchoice)
            {
                case 1 : amount = n4*30;break;
                case 2 : amount = n4*29;break;
                case 3 : amount = n4*28;break;
                case 4 : amount = n4*33;break;
                default : System.out.println("---Error!Wrong Choice---");

            }

            System.out.println("Ticket Details : ");
            System.out.println(from+" --> "+to);
            System.out.println("");
            System.out.println("Date "+dd+" / "+mm+" / 2014");
            System.out.println("Class : "+cl);

            for(int i=0;i<ns;i++)
            {   System.out.println("");
                System.out.println("Name  : "+name[i]);
                System.out.println("Age   : "+age[i]);
                System.out.println("Sex   : "+sex[i]);
                System.out.println("Phone : "+ph[i]);
                System.out.println("___________________");
                System.out.println("");
            }
            if(fchoice==1)
            {  System.out.println("Flight : Jet Airways 9W "+ifn1);
                System.out.println("  Departure : "+(JAh)+":"+(JAm)+"  Arrival : "+(JAh+8)+":"+(JAm));
            }

            if(fchoice==2)
            {  System.out.println("Flight : British Airways BA "+ifn2);
                System.out.println("  Departure : "+(BAh)+":"+(BAm)+"  Arrival : "+(BAh+9)+":"+(BAm));
            }

            if(fchoice==3)
            {  System.out.println("Flight : Cathay Pacific CX "+ifn3);
                System.out.println("  Departure : "+(CPh-1)+":"+(CPm)+"  Arrival : "+(CPh+5)+":"+(CPm));
            }

            if(fchoice==4)
            {  System.out.println("Flight : EK  "+ifn4);
                System.out.println("  Departure : "+(EMh+2)+":"+(EMm)+"  Arrival : "+(EMh+7)+":"+(EMm));
            }

        }
        System.out.flush();

        Payment p = new Payment();
        p.payment();

    }
}

