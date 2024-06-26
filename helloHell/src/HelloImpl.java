import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements  Hello {

    public HelloImpl() throws RemoteException {
    }

    public String sayHello(){  
        return "Hello world!";
    }

        
    public static void main(String args[]){  

        try {
            HelloImpl obj = new HelloImpl();

            //Bind this object instance to the name "HelloServer"  
            Naming.rebind("HelloServer", obj);
            System.out.println("service running");
        } catch (Exception e){  e.printStackTrace();
        }
    }
}

