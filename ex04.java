import java.util.Scanner;
import java.util.Random;

public class cointos{

public static void main(String[] args){
String judge ={"Heads", "Tails"};
Scanner sc = new Scanner(System.in);

System.out.prontln("who are you?");
System.out.print(">");

String name = scanner.nextLine();

System.out.println("Hello," + name + "!");
System.out.println("Tossing coin...");

Random r = new Random();
int head,tail =0;

for(int i=0 ; i<3 ;i++){
String result = judge[r.nextInt(2)];
System.out.println("Round " + i + ":" + result);
if(result == judge[0]) head = head + 1;
else tail = tail + 1;
}

System.out.println("Heads:" + head + "," + "Tails:" +tail);

if(head > tail)System.out.println(name +" won!");
else System.out.println(name + " lost...");

}
