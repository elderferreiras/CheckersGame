package gamelogic;

import javax.swing.JOptionPane;

public class Board {
	private static Pawn board[][] = {
			{ new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false) },
			{ new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(1, 2, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(1, 4, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(1, 6, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(1, 8, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false) },
			{ new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(2, 1, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(2, 3, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(2, 5, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(2, 7, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false) },
			{ new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(3, 2, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(3, 4, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(3, 6, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(3, 8, Pawn.GREY, false),
					new Pawn(0, 0, Pawn.VOID, false) },
			{ new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(4, 1, Pawn.EMPTY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(4, 3, Pawn.EMPTY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(4, 5, Pawn.EMPTY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(4, 7, Pawn.EMPTY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false) },
			{ new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(5, 2, Pawn.EMPTY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(5, 4, Pawn.EMPTY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(5, 6, Pawn.EMPTY, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(5, 8, Pawn.EMPTY, false),
					new Pawn(0, 0, Pawn.VOID, false) },
			{ new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(6, 1, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(6, 3, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(6, 5, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(6, 7, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false) },
			{ new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(7, 2, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(7, 4, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(7, 6, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(7, 8, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false) },
			{ new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(8, 1, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(8, 3, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(8, 5, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(8, 7, Pawn.YELLOW, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false) },
			{ new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false),
					new Pawn(0, 0, Pawn.VOID, false) } };

	private static int whoisplaying = Pawn.GREY;
	private static int whoisNOTplaying = Pawn.YELLOW;
	private static int greyPawns = 12;
	private static int yellowPawns = 12;
	public static int jumpX;
	public static int jumpY;
	public static boolean mustTakeTheJump = false;

	public static Pawn getBoard(int i, int j) {
		return board[i][j];
	}

	public static void setBoard(Pawn[][] board) {
		Board.board = board;
	}

	public static int getWhoisplaying() {
		return whoisplaying;
	}

	public static void setWhoisplaying(int whoisplaying) {
		Board.whoisplaying = whoisplaying;
	}

	public static int getWhoisnotplaying() {
		return whoisNOTplaying;
	}

	public static void setWhoisnotplaying(int whoisnotplaying) {
		Board.whoisNOTplaying = whoisnotplaying;
	}

	public static int getWhitePawn() {
		return greyPawns;
	}

	public static void setWhitePawn(int whitePawn) {
		Board.greyPawns = whitePawn;
	}

	public static int getBlackPawn() {
		return yellowPawns;
	}

	public static void setBlackPawn(int blackPawn) {
		Board.yellowPawns = blackPawn;
	}

	public static void Move(int x, int y, int xd, int yd) {

		if (board[x][y].getType() == Pawn.GREY && whoisplaying == Pawn.GREY) {
			if (x < 8) {
				if (y < 8) {
					if (board[x + 1][y + 1].getType() == Pawn.EMPTY
							&& (xd == x + 1 && yd == y + 1)) {
						movePawn(x, y, xd, yd);
						mustTakeTheJump( xd, yd);
						gameController();
					}
					if (board[x + 1][y + 1].getType() == Pawn.YELLOW && y < 7
							&& x < 7) {
						if (board[x + 2][y + 2].getType() == Pawn.EMPTY
								&& (xd == x + 2 && yd == y + 2)) {
							eatPawn(x + 1, y + 1);
							movePawn(x, y, xd, yd);
							if(!eatMore(xd, yd)){
								mustTakeTheJump( xd, yd);
								gameController();
							}
						}
					}

				}
				if (y > 1) {
					if (board[x + 1][y - 1].getType() == Pawn.YELLOW && x < 7
							&& y > 2) {
						if (board[x + 2][y - 2].getType() == Pawn.EMPTY
								&& (xd == x + 2 && yd == y - 2)) {
							eatPawn(x + 1, y - 1);
							movePawn(x, y, xd, yd);
							if(!eatMore(xd, yd)){
								mustTakeTheJump( xd, yd);
								gameController();
							}
						}
					}
					if (board[x + 1][y - 1].getType() == Pawn.EMPTY
							&& (xd == x + 1 && yd == y - 1)) {
						movePawn(x, y, xd, yd);
						mustTakeTheJump( xd, yd);
						gameController();
					}
				}
			}
			if (x > 1 && board[x][y].isKing()) {
				if (y < 8) {
					if (board[x - 1][y + 1].getType() == Pawn.YELLOW && y < 7
							&& x > 2) {
						if (board[x - 2][y + 2].getType() == Pawn.EMPTY
								&& (xd == x - 2 && yd == y + 2)) {
							eatPawn(x - 1, y + 1);
							movePawn(x, y, xd, yd);
							if(!eatMore(xd, yd)){
								mustTakeTheJump( xd, yd);
								gameController();
							}
						}
					}
					if (board[x - 1][y + 1].getType() == Pawn.EMPTY
							&& (xd == x - 1 && yd == y + 1)) {
						movePawn(x, y, xd, yd);
						mustTakeTheJump( xd, yd);
						gameController();
					}
				}
				if (y > 0) {
					if (board[x - 1][y - 1].getType() == Pawn.YELLOW && x > 1
							&& y > 1) {
						if (board[x - 2][y - 2].getType() == Pawn.EMPTY
								&& (xd == x - 2 && yd == y - 2)) {
							eatPawn(x - 1, y - 1);
							movePawn(x, y, xd, yd);
							mustTakeTheJump( xd, yd);
							if(!eatMore(xd, yd)){
								mustTakeTheJump( xd, yd);
								gameController();
							}
						}
					}
					if (board[x - 1][y - 1].getType() == Pawn.EMPTY
							&& (xd == x - 1 && yd == y - 1)) {
						movePawn(x, y, xd, yd);
						mustTakeTheJump( xd, yd);
						gameController();
					}
				}
			}
		}

		if (board[x][y].getType() == Pawn.YELLOW && whoisplaying == Pawn.YELLOW) {
			if (x > 1) {
				if (y < 8) {
					if (board[x - 1][y + 1].getType() == Pawn.GREY && y < 7
							&& x > 2) {
						if (board[x - 2][y + 2].getType() == Pawn.EMPTY
								&& (xd == x - 2 && yd == y + 2)) {
							eatPawn(x - 1, y + 1);
							movePawn(x, y, xd, yd);
							if(!eatMore(xd, yd)){
								mustTakeTheJump( xd, yd);
								gameController();
							}
						}
					}
					if (board[x - 1][y + 1].getType() == Pawn.EMPTY
							&& (xd == x - 1 && yd == y + 1)) {
						movePawn(x, y, xd, yd);
						mustTakeTheJump( xd, yd);
						gameController();
					}

				}
				if (y > 1) {
					if (board[x - 1][y - 1].getType() == Pawn.GREY && x > 2
							&& y > 2) {
						if (board[x - 2][y - 2].getType() == Pawn.EMPTY
								&& (xd == x - 2 && yd == y - 2)) {
							eatPawn(x - 1, y - 1);
							movePawn(x, y, xd, yd);
							if(!eatMore(xd, yd)){
								mustTakeTheJump( xd, yd);
								gameController();
							}
						}
					}
					if (board[x - 1][y - 1].getType() == Pawn.EMPTY
							&& (xd == x - 1 && yd == y - 1)) {
						movePawn(x, y, xd, yd);
						mustTakeTheJump( xd, yd);
						gameController();
					}
				}
			}
			if (x < 8 && board[x][y].isKing()) {
				if (y < 8) {
					if (board[x + 1][y + 1].getType() == Pawn.GREY && y < 7
							&& x < 7) {
						if (board[x + 2][y + 2].getType() == Pawn.EMPTY
								&& (xd == x + 2 && yd == y + 2)) {
							eatPawn(x + 1, y + 1);
							movePawn(x, y, xd, yd);
							if(!eatMore(xd, yd)){
								mustTakeTheJump( xd, yd);
								gameController();
							}

						}
					}
					if (board[x + 1][y + 1].getType() == Pawn.EMPTY
							&& (xd == x + 1 && yd == y + 1)) {
						movePawn(x, y, xd, yd);
						mustTakeTheJump( xd, yd);
						gameController();
					}

				}
				if (y > 1) {
					if (board[x + 1][y - 1].getType() == Pawn.GREY && x < 7
							&& y > 2) {
						if (board[x + 2][y - 2].getType() == Pawn.EMPTY
								&& (xd == x + 2 && yd == y - 2)) {
							eatPawn(x + 1, y - 1);
							movePawn(x, y, xd, yd);
							if(!eatMore(xd, yd)){
								mustTakeTheJump( xd, yd);
								gameController();
							}
						}
					}
					if (board[x + 1][y - 1].getType() == Pawn.EMPTY
							&& (xd == x + 1 && yd == y - 1)) {
						movePawn(x, y, xd, yd);
						mustTakeTheJump( xd, yd);
						gameController();
					}
				}
			}
		}
	}

	public static boolean eatMore(int x, int y) {
		if (board[x][y].getType() == Pawn.GREY && whoisplaying == Pawn.GREY) {
			if (x < 8) {
				if (y < 8) {
					if (board[x + 1][y + 1].getType() == Pawn.YELLOW && y < 7
							&& x < 7) {
						if (board[x + 2][y + 2].getType() == Pawn.EMPTY) {
							return true;
							}
						}
					}
				if (y > 1) {
					if (board[x + 1][y - 1].getType() == Pawn.YELLOW && x < 7
							&& y > 2) {
						if (board[x + 2][y - 2].getType() == Pawn.EMPTY) {
							return true;
						}
					}
				}
			}
			if (x > 1 && board[x][y].isKing()) {
				if (y < 8) {
					if (board[x - 1][y + 1].getType() == Pawn.YELLOW && y < 7
							&& x > 2) {
						if (board[x - 2][y + 2].getType() == Pawn.EMPTY) {
							return true;
						}
					}
				}
				if (y > 0) {
					if (board[x - 1][y - 1].getType() == Pawn.YELLOW && x > 1
							&& y > 1) {
						if (board[x - 2][y - 2].getType() == Pawn.EMPTY) {
							return true;
						}
					}
				}
			}
		}

		if (board[x][y].getType() == Pawn.YELLOW && whoisplaying == Pawn.YELLOW) {
			if (x > 1) {
				if (y < 8) {
					if (board[x - 1][y + 1].getType() == Pawn.GREY && y < 7
							&& x > 2) {
						if (board[x - 2][y + 2].getType() == Pawn.EMPTY) {
							return true;
						}
					}
				}
				if (y > 1) {
					if (board[x - 1][y - 1].getType() == Pawn.GREY && x > 2
							&& y > 2) {
						if (board[x - 2][y - 2].getType() == Pawn.EMPTY) {
							return true;
						}
					}
				}
			}
			if (x < 8 && board[x][y].isKing()) {
				if (y < 8) {
					if (board[x + 1][y + 1].getType() == Pawn.GREY && y < 7
							&& x < 7) {
						if (board[x + 2][y + 2].getType() == Pawn.EMPTY) {
							return true;
						}
					}
				}
				if (y > 1) {
					if (board[x + 1][y - 1].getType() == Pawn.GREY && x < 7
							&& y > 2) {
						if (board[x + 2][y - 2].getType() == Pawn.EMPTY) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	private static void mustTakeTheJump(int xd, int yd) {
		if (whoisplaying == Pawn.GREY) {
				if (Board.board[xd + 1][yd + 1].getType() == whoisNOTplaying
						&& Board.board[xd - 1][yd - 1].getType() == Pawn.EMPTY) {
					jumpX= xd;
					jumpY = yd;
					mustTakeTheJump = true;
					System.out.println(jumpX+" "+ jumpY);
				} else if (Board.board[xd + 1][yd - 1].getType() == whoisNOTplaying
						&& Board.board[xd - 1][yd + 1].getType() == Pawn.EMPTY) {
					jumpX= xd;
					jumpY = yd;
					mustTakeTheJump = true;
					System.out.println(jumpX+" "+ jumpY);
				} else if (Board.board[xd - 1][yd - 1].getType() == whoisNOTplaying
						&& Board.board[xd + 1][yd + 1].getType() == Pawn.EMPTY 
						&& Board.board[xd - 1][yd - 1].isKing()) {
					jumpX= xd;
					jumpY = yd;
					mustTakeTheJump = true;
					System.out.println(jumpX+" "+ jumpY);
				} else if (Board.board[xd - 1][yd + 1].getType() == whoisNOTplaying
						&& Board.board[xd + 1][yd - 1].getType() == Pawn.EMPTY
						&& Board.board[xd - 1][yd + 1].isKing()) {
					jumpX= xd;
					jumpY = yd;
					mustTakeTheJump = true;
					System.out.println(jumpX+" "+ jumpY);
				}
		} else {
				if (Board.board[xd - 1][yd + 1].getType() == whoisNOTplaying
						&& Board.board[xd + 1][yd - 1].getType() == Pawn.EMPTY) {
					jumpX= xd;
					jumpY = yd;
					mustTakeTheJump = true;
					System.out.println(jumpX+" "+ jumpY);
				}
				if (Board.board[xd - 1][yd - 1].getType() == whoisNOTplaying
						&& Board.board[xd + 1][yd + 1].getType() == Pawn.EMPTY) {
					jumpX= xd;
					jumpY = yd;
					mustTakeTheJump = true;
					System.out.println(jumpX+" "+ jumpY);
				} if (Board.board[xd + 1][yd - 1].getType() == whoisNOTplaying
						&& Board.board[xd - 1][yd + 1].getType() == Pawn.EMPTY
						&& Board.board[xd + 1][yd - 1].isKing()) {
					jumpX= xd;
					jumpY = yd;
					mustTakeTheJump = true;
					System.out.println(jumpX+" "+ jumpY);
				}
				if (Board.board[xd + 1][yd + 1].getType() == whoisNOTplaying
						&& Board.board[xd - 1][yd - 1].getType() == Pawn.EMPTY
						&& Board.board[xd + 1][yd + 1].isKing()) {
					jumpX= xd;
					jumpY = yd;
					mustTakeTheJump = true;
					System.out.println(jumpX+" "+ jumpY);
				}
		}
	}

	public static void eatPawn(int x, int y) {
		if (board[x][y].getType() == Pawn.GREY)
			greyPawns--;
		else if (board[y][x].getType() == Pawn.YELLOW)
			yellowPawns--;
		board[x][y].setType(Pawn.EMPTY);
		board[x][y].setKing(false);
	}

	public static void movePawn(int x, int y, int xd, int yd) {
		if (board[xd][yd].getType() == Pawn.EMPTY) {
			board[xd][yd].setType(whoisplaying);
			board[x][y].setType(Pawn.EMPTY);
			if ((xd == 8 && board[xd][yd].getType() == Pawn.GREY)
					|| (xd == 1 && board[xd][yd].getType() == Pawn.YELLOW)
					|| (board[x][y].isKing())) {
				board[xd][yd].setKing(true);
			}
			board[x][y].setKing(false);
		}
	}

	public static void gameController() {
		if (greyPawns == 0)
			JOptionPane.showMessageDialog(null, "The Client is the winner!",
					"Fim de Jogo", JOptionPane.PLAIN_MESSAGE);
		else if (yellowPawns == 0)
			JOptionPane.showMessageDialog(null, "The Server is the winner!",
					"Fim de Jogo", JOptionPane.PLAIN_MESSAGE);

		if (whoisplaying == Pawn.GREY) {
			whoisplaying = Pawn.YELLOW;
			whoisNOTplaying = Pawn.GREY;
		} else if (whoisplaying == Pawn.YELLOW) {
			whoisplaying = Pawn.GREY;
			whoisNOTplaying = Pawn.YELLOW;
		}
	}

	public static boolean takingTheJump(int x, int y, int xd, int yd) {
		if(mustTakeTheJump){
			System.out.println("entrou");
			if (whoisplaying == Pawn.GREY) {
					if (board[x + 1][y + 1].getType() == Pawn.YELLOW && y < 7 && x < 7) {
						if (board[x + 2][y + 2].getType() == Pawn.EMPTY
								&& (xd == x + 2 && yd == y + 2) && (x+1 == jumpX && y+1 == jumpY)) {
							System.out.println("type 1");
							System.out.println(jumpX+" "+ jumpY);
							mustTakeTheJump = false;
							return true;
						}
					}
					if (board[x + 1][y - 1].getType() == Pawn.YELLOW && x < 7 && y > 2) {
						if (board[x + 2][y - 2].getType() == Pawn.EMPTY
								&& (xd == x + 2 && yd == y - 2)&& (x+1 == jumpX && y-1 == jumpY)) {
							System.out.println("type 2");
							System.out.println(jumpX+" "+ jumpY);
							mustTakeTheJump = false;
							return true;
						}
					}
					if (board[x - 1][y + 1].getType() == Pawn.YELLOW && y < 7 && x > 2) {
						if (board[x - 2][y + 2].getType() == Pawn.EMPTY
								&& (xd == x - 2 && yd == y + 2)&& (x-1 == jumpX && y+1 == jumpY)
								&& board[x][y].isKing()) {
							System.out.println("type 3");
							System.out.println(jumpX+" "+ jumpY);
							mustTakeTheJump = false;
							return true;
						}
					}
					if (board[x - 1][y - 1].getType() == Pawn.YELLOW && x > 2 && y > 2) {
						if (board[x - 2][y - 2].getType() == Pawn.EMPTY
								&& (xd == x - 2 && yd == y - 2)&& (x-1 == jumpX && y-1 == jumpY)
								&& board[x][y].isKing()) {
							{
								System.out.println("type 4");
								System.out.println(jumpX+" "+ jumpY);
								mustTakeTheJump = false;
								return true;
							}
						}
					}
			} else {
					if (board[x - 1][y + 1].getType() == Pawn.GREY && y < 7 && x > 2) {
						if (board[x - 2][y + 2].getType() == Pawn.EMPTY
								&& (xd == x - 2 && yd == y + 2)&& (x-1 == jumpX && y+1 == jumpY)) {
							System.out.println("type 5");
							System.out.println(jumpX+" "+ jumpY);
							mustTakeTheJump = false;
							return true;
						}
					}
					if (board[x - 1][y - 1].getType() == Pawn.GREY && x > 2 && y > 2) {
						if (board[x - 2][y - 2].getType() == Pawn.EMPTY
								&& (xd == x - 2 && yd == y - 2)&& (x-1 == jumpX && y-1 == jumpY)) {
							{
								System.out.println("type 6");
								System.out.println(jumpX+" "+ jumpY);
								mustTakeTheJump = false;
								return true;
							}
						}
					}
					if (board[x + 1][y + 1].getType() == Pawn.GREY && y < 7 && x < 7) {
						if (board[x + 2][y + 2].getType() == Pawn.EMPTY
								&& (xd == x + 2 && yd == y + 2) && (x+1 == jumpX && y+1 == jumpY)
								&& board[x][y].isKing()) {
							System.out.println("type 7");
							System.out.println(jumpX+" "+ jumpY);
							mustTakeTheJump = false;
							return true;
						}
					}
					if (board[x + 1][y - 1].getType() == Pawn.GREY && x < 7 && y > 2) {
						if (board[x + 2][y - 2].getType() == Pawn.EMPTY
								&& (xd == x + 2 && yd == y - 2)&& (x+1 == jumpX && y-1 == jumpY)
								&& board[x][y].isKing()) {
							System.out.println("type 8");
							System.out.println(jumpX+" "+ jumpY);
								mustTakeTheJump = false;
							return true;
						}
					}
			}
			return false;
		}
		mustTakeTheJump = false;
		return true;
	}

}