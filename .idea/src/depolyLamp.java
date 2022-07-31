package algs4;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class depolyLamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++){
            int roadLong = sc.nextInt();
            String str = sc.next();
            System.out.println(lampSum(roadLong,str));
        }
        System.out.println(1);

        }
    public static int lampSum(int l,String r){
        int sum = 0;
        for(int i=0; i<l; i++){
            if(r.charAt(i) == '.'){
                sum ++;
                i+=2;
            }
        }
        return sum;
       // int M = sc.nextInt();
//        for(int i = 0; i < N; i++){
//            int roadLong = sc.nextInt();
//            String str = sc.next();
//            System.out.println(str + "what");
//            char[] charArray = str.toCharArray();
//            int count = 0;
//            int need = 0;
//            assert (str.length()== roadLong);
//            for(int j = 0; j < roadLong; j++){
//                while(charArray[j] == '.' ){
//                    ++count;
//                    j++;
//                    if(j == roadLong){ break};
//                }
//                need += (count % 3 == 0 ? count/3:count / 3 + 1);
//                    count = 0;
//            }
//            writer.println(need);
//        }
//        writer.flush();

    }

}
