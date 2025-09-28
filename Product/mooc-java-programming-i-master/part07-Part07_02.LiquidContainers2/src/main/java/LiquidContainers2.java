
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();
        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts.length == 1) {
                if (parts[0].equals("quit")) {
                    break;
                }
            } else {
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                switch (command) {
                    case "add":
                        if (firstContainer.contains() + amount <= 100 && amount >= 0) {
                            firstContainer.add(amount);
                        } else {
                            firstContainer.setLiquidAmount(100);
                        }
                        break;
                    case "move":
                        if (firstContainer.contains() - amount >= 0 && amount >= 0) {
                            if (secondContainer.contains() + amount <= 100) {
                                if (amount <= firstContainer.contains()) {
                                    firstContainer.remove(amount);
                                    secondContainer.add(amount);
                                } else {
                                    firstContainer.setLiquidAmount(0);
                                    secondContainer.add(amount);
                                }
                            } else {
                                firstContainer.remove(amount);
                                secondContainer.setLiquidAmount(100);
                            }
                        } else {
                            secondContainer.add(firstContainer.contains());
                            firstContainer.setLiquidAmount(0);

                        }      
                        break;
                    case "remove":
                        if (secondContainer.contains() - amount >= 0 && secondContainer.contains() - amount <= 100) {
                            secondContainer.remove(amount);
                        } else {
                            secondContainer.setLiquidAmount(0);
                        }    
                }    
            }     
        }
    }

}
