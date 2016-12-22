package com.company;
public class ExpertAI {
    public static String[][] ExpertAI(String[][] a, String b) {
        String[][] board = a;
        String c1, c2, c3, c4, c5, c6, c7, c8, c9;
        int m0 = 0, m1 = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0, m6 = 0, m7 = 0, m8 = 0, m9 = 0;
        if (b.equals("X")) {
            c1 = "XX ";
            c2 = "X X";
            c3 = " XX";
            c4 = "OO ";
            c5 = "O O";
            c6 = " OO";
            c7 = "X  ";
            c8 = " X ";
            c9 = "  X";
        } else {
            c1 = "OO ";
            c2 = "O O";
            c3 = " OO";
            c4 = "XX ";
            c5 = "X X";
            c6 = " XX";
            c7 = "O  ";
            c8 = " O ";
            c9 = "  O";
        }
        for (int i = 0; i < board.length; i++) {
            String line = "";
            for (int u = 0; u < board.length; u++) {
                line = line + board[i][u];
            }
            if (line.equals(c1)) {
                board[i][2] = b;
                return board;
            } else if (line.equals(c2)) {
                board[i][1] = b;
                return board;
            } else if (line.equals(c3)) {
                board[i][0] = b;
                return board;
            }
        }
        for (int u = 0; u < board.length; u++) {
            String line = "";
            for (int i = 0; i < board.length; i++) {
                line = line + board[i][u];
            }
            if (line.equals(c1)) {
                board[2][u] = b;
                return board;
            } else if (line.equals(c2)) {
                board[1][u] = b;
                return board;
            } else if (line.equals(c3)) {
                board[0][u] = b;
                return board;
            }
        }
        String d1 = board[0][0] + board[1][1] + board[2][2];
        String d2 = board[2][0] + board[1][1] + board[0][2];
        if (d1.equals(c1)) {
            board[2][2] = b;
            return board;
        } else if (d1.equals(c2)) {
            board[1][1] = b;
            return board;
        } else if (d1.equals(c3)) {
            board[0][0] = b;
            return board;
        } else if (d2.equals(c1)) {
            board[0][2] = b;
            return board;
        } else if (d2.equals(c2)) {
            board[1][1] = b;
            return board;
        } else if (d2.equals(c3)) {
            board[2][0] = b;
            return board;
        }
        for (int i = 0; i < board.length; i++) {
            String line = "";
            for (int u = 0; u < board.length; u++) {
                line = line + board[i][u];
            }
            if (line.equals(c4)) {
                board[i][2] = b;
                return board;
            } else if (line.equals(c5)) {
                board[i][1] = b;
                return board;
            } else if (line.equals(c6)) {
                board[i][0] = b;
                return board;
            }
        }
        for (int u = 0; u < board.length; u++) {
            String line = "";
            for (int i = 0; i < board.length; i++) {
                line = line + board[i][u];
            }
            if (line.equals(c4)) {
                board[2][u] = b;
                return board;
            } else if (line.equals(c5)) {
                board[1][u] = b;
                return board;
            } else if (line.equals(c6)) {
                board[0][u] = b;
                return board;
            }
        }
        if (d1.equals(c4)) {
            board[2][2] = b;
            return board;
        } else if (d1.equals(c5)) {
            board[1][1] = b;
            return board;
        } else if (d1.equals(c6)) {
            board[0][0] = b;
            return board;
        }
        if (d2.equals(c4)) {
            board[0][2] = b;
            return board;
        } else if (d2.equals(c5)) {
            board[1][1] = b;
            return board;
        } else if (d2.equals(c6)) {
            board[2][0] = b;
            return board;
        }
        for (int i = 0; i < board.length; i++) {
            String line = "";
            for (int u = 0; u < board.length; u++) {
                line = line + board[i][u];
            }
            if (line.equals(c7)) {
                if (i == 0) {
                    m1++;
                    m2++;
                } else if (i == 1) {
                    m0++;
                    m2++;
                } else if (i == 2) {
                    m0++;
                    m1++;
                }
            } else if (line.equals(c8)) {
                if (i == 0) {
                    m4++;
                    m5++;
                } else if (i == 1) {
                    m3++;
                    m5++;
                } else if (i == 2) {
                    m3++;
                    m4++;
                }
            } else if (line.equals(c9)) {
                if (i == 0) {
                    m7++;
                    m8++;
                } else if (i == 1) {
                    m6++;
                    m8++;
                } else if (i == 2) {
                    m6++;
                    m7++;
                }
            }
        }
        for (int u = 0; u < board.length; u++) {
            String line = "";
            for (int i = 0; i < board.length; i++) {
                line = line + board[i][u];
            }
            if (line.equals(c7)) {
                if (u == 0) {
                    m3++;
                    m6++;
                } else if (u == 1) {
                    m0++;
                    m6++;
                } else if (u == 2) {
                    m0++;
                    m3++;
                }
            } else if (line.equals(c8)) {
                if (u == 0) {
                    m4++;
                    m7++;
                } else if (u == 1) {
                    m1++;
                    m7++;
                } else if (u == 2) {
                    m1++;
                    m4++;
                }
            } else if (line.equals(c9)) {
                if (u == 0) {
                    m5++;
                    m8++;
                } else if (u == 1) {
                    m2++;
                    m8++;
                } else if (u == 2) {
                    m2++;
                    m5++;
                }
            }
        }
        if (d1.equals(c7)) {
            m4++;
            m8++;
        } else if (d1.equals(c8)) {
            m0++;
            m8++;
        } else if (d1.equals(c9)) {
            m0++;
            m4++;
        } else if (d2.equals(c7)) {
            m4++;
            m6++;
        } else if (d2.equals(c8)) {
            m2++;
            m6++;
        } else if (d2.equals(c9)) {
            m2++;
            m4++;
        }
        if (0 == 1) {
        } else if (m4 >= m1 && m4 >= m2 && m4 >= m3 && m4 >= m0 && m4 >= m5 && m4 >= m6 && m4 >= m7 && m4 >= m8 && board[1][1].equals(" ")) {
            board[1][1] = b;
            return board;
        } else if (m3 >= m1 && m3 >= m2 && m3 >= m0 && m3 >= m4 && m3 >= m5 && m3 >= m6 && m3 >= m7 && m3 >= m8 && board[0][1].equals(" ")) {
            board[0][1] = b;
            return board;
        } else if (m1 >= m0 && m1 >= m2 && m1 >= m3 && m1 >= m4 && m1 >= m5 && m1 >= m6 && m1 >= m7 && m1 >= m8 && board[1][0].equals(" ")) {
            board[1][0] = b;
            return board;
        } else if (m7 >= m1 && m7 >= m2 && m7 >= m3 && m7 >= m4 && m7 >= m5 && m7 >= m6 && m7 >= m0 && m7 >= m8 && board[1][2].equals(" ")) {
            board[1][2] = b;
            return board;
        } else if (m5 >= m1 && m5 >= m2 && m5 >= m3 && m5 >= m4 && m5 >= m0 && m5 >= m6 && m5 >= m7 && m5 >= m8 && board[2][1].equals(" ")) {
            board[2][1] = b;
            return board;
        } else if (m0 >= m1 && m0 >= m2 && m0 >= m3 && m0 >= m4 && m0 >= m5 && m0 >= m6 && m0 >= m7 && m0 >= m8 && board[0][0].equals(" ")) {
            board[0][0] = b;
            return board;
        } else if (m8 >= m1 && m8 >= m2 && m8 >= m3 && m8 >= m4 && m8 >= m5 && m8 >= m6 && m8 >= m7 && m8 >= m0 && board[2][2].equals(" ")) {
            board[2][2] = b;
            return board;
        } else if (m2 >= m1 && m2 >= m0 && m2 >= m3 && m2 >= m4 && m2 >= m5 && m2 >= m6 && m2 >= m7 && m2 >= m8 && board[2][0].equals(" ")) {
            board[2][0] = b;
            return board;
        } else if (m6 >= m1 && m6 >= m2 && m6 >= m3 && m6 >= m4 && m6 >= m5 && m6 >= m0 && m6 >= m7 && m6 >= m8 && board[0][2].equals(" ")) {
            board[0][2] = b;
            return board;
        }
        else{
            int[] p1 = {0, 1, 0, 2, 1, 2, 0, 2, 1};
            int[] p2 = {0, 0, 1, 1, 2, 2, 2, 0, 1};
            for(int i = 0; i < 9; i++) {
                if (board[p1[i]][p2[i]].equals(" ")) {
                    board[p1[i]][p2[i]] = b;
                    return board;
                }
            }
        }
        return board;
    }
}