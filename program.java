import java.util.Scanner;
import java.util.LinkedList;
public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> listStr = new LinkedList<>();
        Boolean flag = true;
        while (flag) {
            System.out.println("Введите строку, которую нужно запомнить.\n" +
                    "'print' - если хотите вывести в консоль введённые значения.\n"+
                    "'revert' - если хотите сохранить введённые значения в обратном порядке.\n" +
                    "'exit' - если хотите завершить программу.");
            String input = scan.next();
            switch (input) {
                case "print":
                    System.out.println(listStr);
                    break;
                case "revert":
                    listStr = flipOver(listStr);
                    break;
                case "exit":
                    flag = false;
                default:
                    listStr.add(input);
            }

        }
    }
    static LinkedList<String> flipOver(LinkedList<String> arrStr) {
        LinkedList<String> newArrStr = new LinkedList<String>();
        arrStr.removeLast();
        while (!arrStr.isEmpty()){
            newArrStr.add(arrStr.removeLast());
        }
        return newArrStr;
    }
}
