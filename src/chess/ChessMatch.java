package chess;

import boardgame.Board;
<<<<<<< HEAD
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;
=======
>>>>>>> 172922141ecbf1852ab51d00c4cdc0ff0f4f20a6

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() { 
		board = new Board(8, 8);
<<<<<<< HEAD
		initialSetup();
=======
>>>>>>> 172922141ecbf1852ab51d00c4cdc0ff0f4f20a6
	}
	
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows();i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}	
		}
		return mat;
		
	}
<<<<<<< HEAD
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
	}
=======
>>>>>>> 172922141ecbf1852ab51d00c4cdc0ff0f4f20a6
}
