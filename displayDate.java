import java.time.LocalDate;

public class displayDate{
    public static void main(String[] args){
        //Displaying Hello World
        System.out.println("Hello, world!");

        //Displaying the current date
        System.out.println("Current Date: " + LocalDate.now());

        //Displaying free memory
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Free momory " + freeMemory + "bytes");
    }
}