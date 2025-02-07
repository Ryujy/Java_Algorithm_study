import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BuffereReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        StringBuiler sb = new StringBuilder();
        
        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToekn) );
            sb.append('\n')'
        }
        System.out.println(sb);
    }
}
