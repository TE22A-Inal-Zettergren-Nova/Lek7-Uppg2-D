import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tb = new Scanner(System.in);
        System.out.println("Hur mycket är klockan?");
        int tid = tb.nextInt();

        if(tid>23){
            System.out.println("Dags att lägga sig");
        }
        else if(tid==12){
            System.out.println("Dags att äta");
        }
        else if(tid>7){
            System.out.println("Dags att gå upp");
        }
        }
    }

