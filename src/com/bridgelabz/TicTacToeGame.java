package com.bridgelabz;


import java.util.Scanner;

public class TicTacToeGame {

    private static int[][] board;

    public static char[] ticTacToeBoard() {
        //variables
        char[] board = new char[10];

        //loop iterates 9 times

        for (int index = 1; index < board.length; index++) {
            //assingn empty spaces to character
            board[index] = '_';
        }
        //returning the board
        return board;
    }

    static void players() {
        char computer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the option 'X' or 'O' :");
        char player1 = scanner.next().charAt(0);

        if (player1 == 'X') {
            computer = 'O';
        } else {
            player1 = 'O';
            computer = 'X';
        }
        System.out.println("player option is:" + player1);
        System.out.println("computer is:" + computer);
    }


     static void showBoard() {
        board= new int[3][3];
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }


    public static void main(String[] args) {
        /* calling the function from mainmethod */
        System.out.println("Welcome to tictactoe");
        ticTacToeBoard();
        players();
        showBoard();

    }
}
