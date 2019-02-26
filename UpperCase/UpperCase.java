import java.io.*;

public class UpperCase{

    public static void main(String[] args){
        System.out.println("Input text:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        String read = null;
        try {
            read = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] strs = read.split(" ");
        int index = 0;
        for(String s : strs){
            strs[index++] = s.toUpperCase();
        }
        for(String s : strs){
            System.out.println(s);
        }

    }

}
