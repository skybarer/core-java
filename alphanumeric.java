import java.util.*;
import javax.swing.*;
public class alphanumeric{
    public static void main(String args[]){
        String nval,lenval;
        int n,len;

        nval=JOptionPane.showInputDialog("Enter number of codes you require : ");
        n=Integer.parseInt(nval);

        lenval=JOptionPane.showInputDialog("Enter code length you require : ");
        len=Integer.parseInt(lenval);

        find(n,len);

    }
    public static void find(int n,int length) {
        String str1="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb=new StringBuilder(length);
        Random r = new Random();

        System.out.println("\n\t Unique codes are \n\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<length;j++){
                sb.append(str1.charAt(r.nextInt(str1.length())));
            }
            System.out.println("  "+sb.toString());
            sb.delete(0,length);
        }
    }
}