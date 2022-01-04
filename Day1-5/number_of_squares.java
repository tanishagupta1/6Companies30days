public class number_of_squares{
    // https://practice.geeksforgeeks.org/problems/squares-in-nn-chessboard1801/
    static Long squaresInChessBoard(Long N) {
        long ans=(N*(N+1)*(2*N+1))/6;
        return ans;
    }
}