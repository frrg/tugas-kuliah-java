import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class tugas {
    public static void main (String[] agrs) throws IOException{
        int nK,nUK,nTR,nUT,nUP,nTotal;
        String data;
        BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nilai Kehadiran :");
        data = Input.readLine();
        nK = Integer.parseInt(data);
        System.out.print("Nilai Ulangan Kelas :");
        data = Input.readLine();
        nUK = Integer.parseInt(data);
        System.out.print("Nilai Tugas Rumah :");
        data = Input.readLine();
        nTR = Integer.parseInt(data);
        System.out.print("Nilai Ujian Teori :");
        data = Input.readLine();
        nUT = Integer.parseInt(data);
        System.out.print("Nilai Ujian Praktek :");
        data = Input.readLine();
        nUP = Integer.parseInt(data);
        
        nTotal =  (nK*10/100)+(nUK*20/100)+(nTR*20/100)+(nUT*25/100)+(nUP*25/100);
        if(nTotal >= 80){
            System.out.println("GRADE A (Sangat Memuaskan)");
        }else if(nTotal >= 70){
            System.out.println("GRADE B (Memuaskan)");
        }else if(nTotal >= 60){
            System.out.println("GRADE C (Cukup)");
        }else if(nTotal >= 50){
            System.out.println("GRADE D (Kurang)");
        }else{
            System.out.println("GRADE E (Buruk)");
    }
    }
    }

