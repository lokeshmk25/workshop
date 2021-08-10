package com.bridgelabz;


public class TicTacToeGame {

    public static char[] newboard() {
        //variables
        char[] board = new char[10];

        //loop iterates for 9 times

        for (int index = 1; index <board.length; index++) {
            //assingn empty spaces to character
            board[index] = ' ';
        }
        //returning the board
        return board;
    }
    public static void main(String[] args) {
        /* calling the function from mainmethod */
        System.out.println("Welcome to tictactoe");
        newboard();

    }
}

