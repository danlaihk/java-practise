package finalProject;

import java.util.Scanner;

public class MazeRunner {
    private static Maze maze = new finalProject.Maze();
    private static Scanner con = new Scanner(System.in);
    private static final float LIMIT = 100;
    private static int mv = 0;
    public static void main(String[] args){

        intro();

        userMove();
    }
    private static void userMove(){
        String mvTo;

        if(maze.didIWin()){
            System.out.println("Congratulations, " +
                    "you made it out alive and you did it in "+mv+" moves! ");
            return;
        }

        if(mv >= 100){
            System.out.println("Oh no! You took too long to escape, " +
                    "and now the maze exit is closed FOREVER >:[ ");
        }


        do{
            System.out.print("What would you like to move? (R, L, U, D) ");
            mvTo = String.valueOf(con.next().charAt(0)).toUpperCase();
            //System.out.println("your enter :"+mvTo);
        }while (!mvTo.equals("R")&&!mvTo.equals("L")&&!mvTo.equals("U")&&!mvTo.equals("D"));


        System.out.println("Your move: "+mvTo);

        if( maze.isThereAPit(mvTo)){
            if(navigatePit()){
                maze.jumpOverPit(mvTo);
            }else{
                userMove();
            }
        }else{
            switch (mvTo){
                case "R":
                    if(maze.canIMoveRight()){
                        maze.moveRight();
                    }else{
                        System.out.println("Sorry, you've hit a wall.");
                    }
                    break;
                case "L":
                    if(maze.canIMoveLeft()){
                        maze.moveLeft();
                    }else{
                        System.out.println("Sorry, you've hit a wall.");
                    }
                    break;
                case "U":
                    if(maze.canIMoveUp()){
                        maze.moveUp();
                    }else{
                        System.out.println("Sorry, you've hit a wall.");
                    }
                    break;
                case "D":
                    if(maze.canIMoveDown()){
                        maze.moveDown();
                    }else{
                        System.out.println("Sorry, you've hit a wall.");
                    }
                    break;
            }
        }


        mv++;
        maze.printMap();


        movesMessage(mv);

        userMove();
    }
    private static boolean navigatePit(){
        String input;
        System.out.println("Watch out! There's a pit ahead, jump it? ");
        input = con.next().toLowerCase();
        return input.charAt(0) == 'y';
    }
    private static void movesMessage(int moves){
        float movesF = Float.parseFloat(String.valueOf(moves));
        int mvLeft;

        mvLeft = (int) LIMIT - moves;
        //mvLeft = mvLeft < 0 ? 0: mvLeft;
        mvLeft = Math.max(0, mvLeft);

        if(movesF >= LIMIT*0.5 && movesF < LIMIT*0.75){
            System.out.println("Warning: You have made "+moves+" moves, " +
                    "you have "+mvLeft+" remaining before the maze exit closes");
        }else if(movesF >= LIMIT*0.75 && movesF < LIMIT*0.9){
            System.out.println("Alert! You have made "+moves+" moves, " +
                    "you only have "+mvLeft+" moves left to escape.\n");
        }else if(movesF >= LIMIT*0.9 && movesF < LIMIT){
            System.out.println("DANGER! You have made "+moves+" moves, " +
                    "you only have "+mvLeft+" moves left to escape!!\n");

        }else if(movesF >= LIMIT){
            System.out.println("Oh no! You took too long to escape, " +
                    "and now the maze exit is closed FOREVER >:[\n");

        }else if(movesF < LIMIT*0.5){
            System.out.println("You have made "+moves+" moves. ");
        }


    }
    private static void intro(){
        System.out.println("Welcome to Maze Runner! ");
        System.out.println("Here is your current position: ");

        maze.printMap();
    }
}
