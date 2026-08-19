

enum Stat{

    Running, Failed, Pending, Success;

}

class EnumIfSwitch{

    public static void main(String a[]){

        Stat s = Stat.Failed;

        // if else if

        if(s == Stat.Running)
            System.out.println("All Good");
        else if(s == Stat.Failed)
            System.out.println("Try Again");
        else if(s == Stat.Pending)
            System.err.println("Please Wait");
        else if(s == Stat.Success)
            System.out.println("Done");


        //switch case

        switch(s){

            case Running:
                System.out.println("All Good");
                break;
            
            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please wait");
                break;

            default:
                System.out.println("Done");
                break;
        }
    }
}