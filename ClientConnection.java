// Bernat Xandri Zaragoza & Ramon Roca Oliver


import java.lang.Thread;
import java.io.*;


public class ClientConnection{

	public static final String SERVER_HOST = "localhost";
	public static final int SERVER_PORT = 6666;

	//public static void main(String hostAddress, int hostPort, String nick){
	public static void main(String[] args){//por algun motivo el compilador me obliga a declaralo asi?
		//MySocket mSocket = new MySocket(hostAddress, hostPort);
		MySocket mSocket = new MySocket(SERVER_HOST, SERVER_PORT);
		
		// Input Thread
		new Thread(){
			public void run(){
				// In case we had a preassignes nick, we would send this host's nick to the server.
				//mSocket.write(nick + " has connected to the server.");

				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String hostMessage;
				try{
					//while ((línia = in.readLine()) != null)
    					//escriure línia per socket;
					while((hostMessage = in.readLine()) != null){

						//mSocket.write("\n" + nick + ": " + hostMessage);
						mSocket.write(hostMessage);
					}
					mSocket.close();
				}catch(IOException e){
					System.out.println("There was an error in the connection.");
				}
			}
		}.start();


		// Output Thread
		new Thread(){
			public void run(){
				String serverMessage;
				//while (hi ha línia del servidor)
    				//escriure línia per pantalla;
				while((serverMessage = mSocket.read()) != null){
					System.out.println(serverMessage); 
				}
			}
		}.start();
	}
}


// Input Thread
//while ((línia = in.readLine()) != null)
//    escriure línia per socket;

// Output Thread
//while (hi ha línia del servidor)
//    escriure línia per pantalla;