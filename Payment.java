import java.io.*;
class Payment
{
    public void payment()throws IOException , InterruptedException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("__________________________________________________");
        System.out.println("Payment");
        System.out.println("");
        int flag;
        do
        {
            flag = 0;
            System.out.println("Choose payment method - ");
            System.out.println("1. Online Banking");
            System.out.println("2. Credit Card");

            int c5 = Integer.parseInt(br.readLine());

            String type = "";
            String bank = "";
            
            int CVV = 0;
            String exp = "";
            
            int c6 = 0;
            String log = "";
            String pass = "";                        

            if(c5==1)
            {
                System.out.println("-----Choose Bank-----");
                System.out.println("");
                System.out.println("1.Axis Bank");
                System.out.println("2.City Union Bank");
                System.out.println("3.State Bank of India");
                System.out.println("4.HDFC");
                System.out.println("5.Indian Overseas Bank");
                System.out.println("6.ICICI Bank");
                System.out.println("7.Bank of Baroda");
                c6 = Integer.parseInt(br.readLine()); 
                switch(c6)
                {
                    case 1 : bank = "Axis Bank"; break;
                    case 2 : bank = "City Union Bank"; break;
                    case 3 : bank = "State Bank of India"; break;
                    case 4 : bank = "HDFC"; break;
                    case 5 : bank = "Indian Overseas Bank"; break;
                    case 6 : bank = "ICICI Bank"; break;
                    case 7 : bank = "Bank of Baroda"; break;
                    default : System.out.println("Error!");

                }
                System.out.println("__________________________________________________");
                System.out.println("Enter Log-in ID");
                log = br.readLine();

                System.out.println("__________________________________________________");
                System.out.println("Enter Password");
                pass = br.readLine();

                System.out.println("Verifying password. Please wait...");
                Thread.sleep(4000);

                System.out.println("\f");
                System.out.println("____________________________________________");
                System.out.println("Pay to Book My Wings from "+bank+"? (Y/N)");
                String c7 =br.readLine();

                if(c7.equalsIgnoreCase("y"))
                {
                    System.out.println("Your transacrion is being processed.");
                    System.out.println("Please wait...");
                    Thread.sleep(5000);

                    System.out.println("Transaction Completed.");
                    System.out.println("Thank you for banking with "+bank+"!");

                }

                else if(c7.equalsIgnoreCase("n"))
                {
                    System.out.println("Are you sure you want to cancel payment? (Y/N)");
                    String c8 = br.readLine();
                    if(c8.equalsIgnoreCase("Y"))
                    {
                        System.out.println("Booking Canceled.");
                    }
                    if(c8.equalsIgnoreCase("N"))
                    {
                        flag = 1;
                    }

                }

                else
                {
                    System.out.println("Error!");
                    System.out.println("Enter 'Y' or 'N' only.");
                    flag = 1;
                }

            }

            else if(c5==2)
            {
                int pl;
                do
                {
                    pl = 0;
                    System.out.println("Type of Card : ");
                    System.out.println("1. MasterCard ©");
                    System.out.println("2. VISA ©");
                    int c9 = Integer.parseInt(br.readLine());
                    System.out.println("");
                    if(c9>2||c9<1)
                    {
                        System.out.println("Error! Enter '1' or '2' only!");
                        pl=0;
                    }
                }while(pl!=0);

                System.out.println("Please enter Card number(16-digit)");
                int pl2 = 0;

                do
                {
                    String cardno = br.readLine();
                    int i;
                    pl2 = 0;

                    if(cardno.length() > 16 || cardno.length() < 16)
                    {
                        System.out.println("---Error! Enter your valid Card number (16-digit)---");
                        pl2 =1;
                    }
                }while(pl2!=0);
                System.out.println("");

                System.out.println("Please enter CVV Number (Card Verification Value)");
                int flag4;
                do
                {
                    flag4 = 0;
                    try
                    {

                        CVV = Integer.parseInt(br.readLine());
                    }

                    catch(Exception e)
                    {
                        System.out.println("---Error! Enter your valid CVV (3-digit)---");
                        flag4 = 1;
                    }
                    if(CVV >999 || CVV < 100)
                    {
                        System.out.println("---Error! Enter your valid CVV (3-digit)---");
                        flag4 = 1;
                    }

                }while(flag4!=0);

                System.out.println("Enter the expiry date (dd)");
                int flag3,fl8;
                int ed = 0,em = 0,yyyy = 0;
                do
                {
                    fl8 = 0;
                    ed = Integer.parseInt(br.readLine());
                    if(ed>31 || ed<1)
                    {
                        System.out.println("----Error! Please Enter a number from 1 - 31----");
                        fl8 = 1;
                    }
                }while(fl8!=0);

                System.out.println("Enter Month(mm)");
                System.out.println("(1 for January, 2 for February and so on...)");

                do
                {
                    flag3 = 0;
                    em = Integer.parseInt(br.readLine());
                    if(em>12 || em<1)
                    {
                        System.out.println("----Error! Please Enter a number from 1 - 12----");
                        flag3 = 1;
                    }

                    if(em==4 && ed>30)
                    {
                        System.out.println("----Error! This month does not contain the date specified----");
                        flag3 = 1;
                    }
                    if(em==6 && ed>30)
                    {
                        System.out.println("----Error! This month does not contain the date specified----");
                        flag3 = 1;
                    }
                    if(em==9 && ed>30)
                    {
                        System.out.println("----Error! This month does not contain the date specified----");
                        flag3 = 1;
                    }
                    if(em==11 && ed>30)
                    {
                        System.out.println("----Error! This month does not contain the date specified----");
                        flag3 = 1;
                    }

                    if(em==2&&ed>28)
                    {
                        System.out.println("----Error! This month does not contain the date specified----");
                        flag3 = 1;
                    }
                }while(flag3!=0);

                System.out.println("Enter Year(yyyy)");
                do
                {
                    flag3 = 0;
                    yyyy = Integer.parseInt(br.readLine());
                    if(yyyy<2014)
                    {
                        System.out.println("----Error! Please Enter a valid year----");
                        flag3 = 1;
                    }
                }while(flag3!=0);

                System.out.println("");
                System.out.println("Please enter name (As on the card -- For Security purposes only--).");
                String cardname = br.readLine();

                System.out.println("_____________________________________________");
                System.out.println("Please wait till your details are verified...");
                Thread.sleep(5000);

                System.out.println("---Payment received---");

            }

        }while(flag!=0);

        System.out.println("");
        System.out.println("Thank you for using Book My Wings ©!");
        System.out.println("We hope you had a pleasureable experience!");
        System.out.println("Have a happy and a safe journey!");
        System.out.println("                                           .MM8                                             ");
        System.out.println("                     ..                   MMMMM                                             ");
        System.out.println("             .   ...MMM     .MN        ..MMMMMM                                             ");
        System.out.println("           MMMMMMMMMM..  .=MMD.       MMMMMMM                                            ");
        System.out.println("         . MMMMMMMMMMMMMMMMMMMM$. ..~MMMMMM.                               ");
        System.out.println("           . . MMMMMMMMMMMMMMMMMMMMMMMMMMM.                                                              ");
        System.out.println("                 . 7MMMMMMMMMMMMMMMMMMMM.                                                             ");
        System.out.println("                    .. MMMMMMMMMMMMMMMMN                                                        ");
        System.out.println("                          MMMMMMMMMMMMMM.                                                    ");
        System.out.println("                           DMMMMMMMMMMMM                                                     ");
        System.out.println("                            MMMMMMMMMMMM ..                                                    ");
        System.out.println("                            =MMMMMMMMMMMMMMMMN                                                   ");
        System.out.println("                          .MMMMMZ. MMMMMMMMM.                                                     ");
        System.out.println("                         7MMMM .     MMMMMM,.                                                   ");
        System.out.println("                       .MMMM         MMMMMM                                                     ");
        System.out.println("              MO:.    MMMMM.          MMMMM,                                                        ");
        System.out.println("            :MMMMMMMMMMMMM             DMMMMMMM7                                                                 ");
        System.out.println("               $MMMMMMMMM              .MMMMMM.                                                                   ");
        System.out.println("                  .MMMMMMM               IMMMM.                                                            ");
        System.out.println("                   =ZMMMMM.               MMMM                                                              ");
        System.out.println("                      MMMM.                MMM.                                                                   ");
        System.out.println("                     ..MMM8               .MMMM                                                                    ");
        System.out.println("                      . MM.                .MM                                                                  ");
    }
}