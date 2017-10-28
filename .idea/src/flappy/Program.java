package flappy;

import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {
            try (Scanner reader = new Scanner(System.in)) {
                while (true) {
                    Program.introduction();
                    int n = Program.input(reader);
                    Program.result(n);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private static void introduction() {
            System.out.println("Sveiki, jusu galimi veiksmai:");
            System.out.println("1) Singleton");
            System.out.println("2) Factory");
            System.out.println("3) Observer");
        }

        private static int input(Scanner reader){
            int n = -1;
            if(reader.hasNextInt())
                n = reader.nextInt();
            else System.out.println(reader.next() + " Nėra tinkama įvestis");
            return n;
        }

        private static void result(int n) {
            switch (n) {
                case (0):
                    System.out.println("programa baige darba");
                    break;
                case (1):
                    //System.out.println("S");
                    Bird singleton = Bird.getInstance();
                    System.out.println("Sukurtas paukstis nr: " + singleton.getId());
                    break;
                default:
                    System.out.println("Tokios procedūros nėra");
            }
        }

    }


