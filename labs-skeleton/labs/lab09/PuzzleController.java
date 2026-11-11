package labs.lab09;

import javax.swing.*;

/** PuzzleController 슬라이드 퍼즐 조각의 움직임을 제어  */
public class PuzzleController {
	private SlidePuzzleBoard board;
	private PuzzleWriter writer;

	/** Constructor - PuzzleController 초기화 메소드
	 * @param b - 퍼즐 보드
	 * @param w - 출력 뷰  */
	public PuzzleController(SlidePuzzleBoard b, PuzzleWriter w) {
		board = b;
		writer = w;
	}

	/** play 퍼즐 시작  */
	public void play() {
		// TODO [실습 9-1] 퍼즐 보드 그리기 → 조각 번호 입력 → 이동 시도 (실패 시 printError("움직일 수 없습니다.")) 를 반복
	}

}
