package labs.lab12.slidepuzzlegui;

/** SlidePuzzleBoard models a slide puzzle. */
public class SlidePuzzleBoard {
	private PuzzlePiece[][] board;

	// 빈칸의 좌표
	private int emptyRow;
	private int emptyCol;
	// representation invariant: board[emptyRow][emptyCol] == null

	/** Constructor - SlidePuzzleBoard 초기 퍼즐 보드 설정 - 감소하는 순으로 나열
	 */
	public SlidePuzzleBoard() {
		// size x size 보드 만들기
		board = new PuzzlePiece[4][4];
        int idx = 0;
        // 퍼즐 조각을 정해진 순서대로 넣기
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,13,14,11,12,15,0};
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                board[row][col] = new PuzzlePiece(numbers[idx]);
                idx++;
            }
        }
		board[3][3] = null;
		emptyRow = 3;
		emptyCol = 3;
	}

	/** contents - 현재 퍼즐 조각을 리턴
    * @return 퍼즐 조각  */
	public PuzzlePiece getPuzzlePiece(int row, int col) {
		return board[row][col];
	}

	/** 이동이 가능하면, 퍼즐 조각을 빈칸으로 이동
	 * @param w - 이동하기 원하는 퍼즐 조각
	 * @return 이동 성공하면 true를 리턴하고, 이동이 불가능하면 false를 리턴 */
	public boolean move(int w) {
		// TODO [실습 11-3] 빈칸과 인접한 조각 w 를 빈칸으로 이동 (불가능하면 false)
		return false;
	}

	/** found - board[row][col]에 퍼즐 조각 v가 있는지 확인  */
	private boolean found(int v, int row, int col) {
		// TODO [실습 11-3] board[row][col] 에 조각 v 가 있는지 확인 (보드 범위 밖이면 false)
		return false;
	}
}
