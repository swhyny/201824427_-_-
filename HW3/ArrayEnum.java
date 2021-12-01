import java.util.Scanner;
enum Commands {ADD, LIST, AVG, SUM, STD, QUIT, INVALID}
public class ArrayEnum{
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] values = new int[100];
        int index = 0;
        while (true) {
            final Command command = getCommand(scanner.next());
            if (command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch (command) {
                case ADD :
                    final int newValue = getValue(scanner.next());
                    values[index] = newValue;
                    index++;
                    break;
                case LIST :
                    printList(values, index);
                    break;
                case AVG :
                    System.out.printf("%.2f%n", getAvg(values, index));
                    break;
                case SUM :
                    System.out.println(getSum(values, index));
                    break;
                case STD :
                    System.out.printf("%.2f%n", getStd(values, index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
    private static Command getCommand(String commando){
        Command command;
        try {
            command = Command.valueOf(commando.toUpperCase());
        } catch (IllegalArgumentException e) { command = Command.INVALID; }
        return command;
    }
    private static int getValue(String s){
        int news;
        news = Integer.parseInt(s);
        return news;
    }
    private static void printList(int[] n, int c){
        for (int i=0; i<c; i++) {
            System.out.printf("%d ", n[i]);
        }
        System.out.print("\n");
    }
    private static double getAvg(int[] n, int c){
        int sum = 0;
        double result;
        for (int i=0; i<c; i++){
            sum += n[i];
        }
        result = sum/(double)c;
        return result;
    }
    private static int getSum(int[] n, int c){
        int result = 0;
        for (int i=0; i<c; i++){
            result += n[i];
        }
        return result;
    }
    private static double getStd(int[] n, int c){
        double avg = getAvg(n, c);
        double semi = 0;
        for(int i=0; i<c; i++){
            semi += Math.pow(n[i]-avg, 2);
        }
        semi = semi/(double)c;
        return Math.sqrt(semi);
    }
}