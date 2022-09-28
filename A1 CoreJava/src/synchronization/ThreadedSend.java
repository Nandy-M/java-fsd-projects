package synchronization;

public class ThreadedSend extends Thread{
    private String msg; 
    private Thread t; 
    SendSync  sender; 
    ThreadedSend(String m,  SendSync obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 


}
