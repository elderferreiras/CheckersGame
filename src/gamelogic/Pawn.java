package gamelogic;

public class Pawn {
	int type;
	boolean king;
	int row;
	int column;
	
	public final static int GREY = 1;
	public final static int YELLOW = 2;
	public final static int EMPTY = 3;	
	public final static int VOID = 4;

	Pawn(int row, int column, int type, boolean dama){
		this.row = row; this.column = column;
		this.type = type; this.king =  dama;
	}	
	
	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public boolean isKing() {
		return king;
	}


	public void setKing(boolean king) {
		this.king = king;
	}


	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getColumn() {
		return column;
	}


	public void setColumn(int column) {
		this.column = column;
	}


	public static int getGrey() {
		return GREY;
	}


	public static int getYellow() {
		return YELLOW;
	}


	public static int getEmpty() {
		return EMPTY;
	}
	
	@Override
	public String toString() {
		if(getType()==VOID)
			return " ";
		else if(getType()==EMPTY)
			return "*";
		return Integer.toString(getType());
	}
}
