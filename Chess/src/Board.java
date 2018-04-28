
public class Board {
	private Figure[][] board;
	
	public Board() {
		this.board = new Figure[8][8];
	}
	 public void addFigure(Figure f) {
		 this.board[f.x][f.y] = f;
	 }
	
}
