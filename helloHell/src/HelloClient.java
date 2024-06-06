import java.rmi.Naming;
import java.rmi.RemoteException;

public class HelloClient {
public static void main(String args[]) {  
    String hostname = "localhost"; 

    if (args.length>0){  
        hostname = args[0];
    }
    try {
        System.setProperty("java.rmi.server.hostname", hostname);
        // obtain a proxy object (stub) for the implementation 
        //  on the server (specified by hostname)
        Hello obj = (Hello) Naming.lookup( "//" + hostname + "/HelloServer");
        System.out.println(obj.sayHello());
    } catch (Exception e) {  e.printStackTrace();
    }
}
}
