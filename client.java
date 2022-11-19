import java.io.*;
import java.net.*;
public class client {
    public static void main(String[] args) {
        try {
            //ServerSocket SS = new ServerSocket(6666);
            Socket S =new Socket("localhost",6666);//establishes connection
            DataOutputStream dout=new DataOutputStream(S.getOutputStream());
            dout.writeUTF("Hello server");
            dout.flush();
            dout.close();
            S.close();
          // System.out.println("message=" + "str");
           // SS.close();
        }catch(Exception e){
            System.out.println(e);}
    }
}
