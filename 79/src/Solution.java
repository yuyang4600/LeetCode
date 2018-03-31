public class Solution {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        String word = "ABCCED";
        Solution solution = new Solution();
        Boolean b = solution.exist(board, word);
        System.out.print(b);
    }

    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(exist(board, i, j, word, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean exist(char[][] board, int x, int y, String word, int index) {
        if(index == word.length()) return true;
        if(x < 0 || y<0 || x>=board.length || y>=board[0].length || board[x][y] != word.charAt(index))
            return false;

        board[x][y] ^= 128;
        System.out.print(board[x][y]);
        boolean exist = exist(board, x-1, y, word, index+1) ||
                exist(board, x+1, y, word, index+1) ||
                exist(board, x, y-1, word, index+1) ||
                exist(board, x, y+1, word, index+1) ;
        board[x][y] ^= 128;
        return exist;
    }
}
