package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        Aeroport A1 =new Aeroport("cdg","Paris","arp");
        Aeroport A2 =new Aeroport("dgc","LYON","ora");
        Avion vrom =new Avion(1,"rapide",240);
        Avion vrom2 =new Avion(2,"meh",280);
        Passager P1 =new Passager(1234);
        Passager P2 =new Passager(4321);
        Pilote ch =new Pilote();
        
    }
}