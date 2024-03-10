package Beginner.Day21;

public class SafetyZone {
    class Solution {
        public int solution(int[][] board) {
            int answer = 0;
            int n = board.length;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 1) {
                        if (i == 0 && j == 0) {
                            markDangerousAreas(board, i + 1, j);
                            markDangerousAreas(board, i, j + 1);
                            markDangerousAreas(board, i + 1, j + 1);
                        } else if (i == 0 && j == n - 1) {
                            markDangerousAreas(board, i, j - 1);
                            markDangerousAreas(board, i + 1, j - 1);
                            markDangerousAreas(board, i + 1, j);
                        } else if (i == n - 1 && j == 0) {
                            markDangerousAreas(board, i - 1, j);
                            markDangerousAreas(board, i - 1, j + 1);
                            markDangerousAreas(board, i, j + 1);
                        } else if (i == n - 1 && j == n - 1) {
                            markDangerousAreas(board, i, j - 1);
                            markDangerousAreas(board, i - 1, j - 1);
                            markDangerousAreas(board, i - 1, j);
                        } else if (i == 0) {
                            markDangerousAreas(board, i, j - 1);
                            markDangerousAreas(board, i, j + 1);
                            markDangerousAreas(board, i + 1, j - 1);
                            markDangerousAreas(board, i + 1, j);
                            markDangerousAreas(board, i + 1, j + 1);
                        } else if (j == 0) {
                            markDangerousAreas(board, i - 1, j);
                            markDangerousAreas(board, i - 1, j + 1);
                            markDangerousAreas(board, i, j + 1);
                            markDangerousAreas(board, i + 1, j + 1);
                            markDangerousAreas(board, i + 1, j);
                        } else if (i == n - 1) {
                            markDangerousAreas(board, i, j - 1);
                            markDangerousAreas(board, i - 1, j - 1);
                            markDangerousAreas(board, i - 1, j);
                            markDangerousAreas(board, i - 1, j + 1);
                            markDangerousAreas(board, i, j + 1);
                        } else if (j == n - 1) {
                            markDangerousAreas(board, i - 1, j);
                            markDangerousAreas(board, i - 1, j - 1);
                            markDangerousAreas(board, i, j - 1);
                            markDangerousAreas(board, i + 1, j - 1);
                            markDangerousAreas(board, i + 1, j);
                        } else {
                            markDangerousAreas(board, i - 1, j - 1);
                            markDangerousAreas(board, i - 1, j);
                            markDangerousAreas(board, i - 1, j + 1);
                            markDangerousAreas(board, i, j - 1);
                            markDangerousAreas(board, i, j + 1);
                            markDangerousAreas(board, i + 1, j - 1);
                            markDangerousAreas(board, i + 1, j);
                            markDangerousAreas(board, i + 1, j + 1);
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 0) {
                        answer++;
                    }
                }
            }

            return answer;
        }

        private void markDangerousAreas(int[][] board, int row, int col) {
            int n = board.length;
            if (row >= 0 && row < n && col >= 0 && col < n && board[row][col] == 0) {
                board[row][col] = -1;
            }
        }
    }

}
