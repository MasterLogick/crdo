import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class crdo {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Vector<Integer> a = new Vector<Integer>();
        try {
            bf.readLine();
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            while (st.hasMoreElements()) {
                a.add(Integer.parseInt(st.nextToken()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if(a.size()==1){
            System.out.println(0);
            return;
        }
        if(a.size()==2&&a.get(0)!=a.get(1)){
            System.out.println(0);
        }
        if(a.size()==2&&a.get(0)==a.get(1)){
            System.out.println(1);
        }
        int count = 0;
        for (int i = 1; i < a.size()-1; i++) {

            if((a.get(i)==a.get(i+1))||(a.get(i)==a.get(i-1))||(a.get(i)>a.get(i-1)&&a.get(i)<a.get(i+1))||(a.get(i)<a.get(i-1)&&a.get(i)>a.get(i+1))){
                a.remove(i);
                i--;
                count++;
            }
        }
        System.out.println(count);
    }
}