import java.util.Scanner;
import java.util.concurrent.Callable;

public class Test {
    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);


    public static void suppress_transactions(){

        System.out.println("\t 0-View Transactions");
        System.out.println("\t 1-View Singers");
        System.out.println("\t 2-Add Singer");
        System.out.println("\t 3-Update Singer");
        System.out.println("\t 4-Delete Singer");
        System.out.println("\t 5-Search Singer");
        System.out.println("\t 6-Exit Application");

    }
    public static void singer_view(){
        singers.singers_print();
    }

    public static void singer_add(){
        System.out.println("Name of the singer you want to add: ");

        String name = scanner.nextLine();
        singers.singer_add(name);

    }

    public static void singer_update(){

        System.out.println("The position you want to update (1,2,3...)");

        int position = scanner.nextInt();
        scanner.nextLine();

        String new_name = scanner.nextLine();

        singers.singer_update(new_name, position - 1);
    }

    public static void delete(){

        System.out.println("The position you want to delete (1,2,3...)");

        int position = scanner.nextInt();

        singers.singer_delete(position - 1);
    }

    public static void search(){

        System.out.println("The singer you want to search: ");

        String name = scanner.nextLine();
        singers.singer_search(name);

    }


    public static void main(String[] args) {

        System.out.println("\t Welcome to the singer app...");

        suppress_transactions();

        boolean exit = false;

        int process;

        while(!exit){
            System.out.println("Choose an action:");

            process = scanner.nextInt();

            scanner.nextLine();

            switch (process){

                case 0:
                    suppress_transactions();
                break;
                case 1:
                    singer_view();
                break;
                case 2:
                    singer_add();
                break;
                case 3:
                    singer_update();
                 break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the Application...");
                    break;


                }


            }


        }




    }



