import java.util.Scanner;

import static ui.UIMenu.menuGeneral;
public class Main {
    public static void main(String[] args) {
        try {
            menuGeneral();
        }catch (Exception e){
            System.out.println("Hubo un error con la elección vuelva a intentarlo");
            main(args);
        }
    }
}