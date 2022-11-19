import java.io.*;
import java.net.*;
public class server {
    public static void main(String[] args) {
        try {
            ServerSocket SS = new ServerSocket(6666);
            Socket S = SS.accept();//establishes connection
            DataInputStream dis = new DataInputStream(S.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message=" + str);
            SS.close();
        }catch(Exception e){
            System.out.println(e);}
        }
    }

