package synchronization;

public class DriveSync {

	public static void main(String args[]) 
    { 
        SendSync snd = new SendSync(); 
        ThreadedSend S1 = new ThreadedSend( " Hi " , snd ); 
        ThreadedSend S2 = new ThreadedSend( " Bye " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 


}
