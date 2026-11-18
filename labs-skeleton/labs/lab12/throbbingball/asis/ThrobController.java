package labs.lab12.throbbingball.asis;

public class ThrobController {
    private ThrobPanel view;
    private ThrobbingBall model;
    private int time;

    public ThrobController(ThrobPanel v, ThrobbingBall m, int delayTime) {
        view = v;
        model = m;
        time = delayTime;
    }

    public void run() {
        // TODO [실습 12-1] 무한 루프: 공의 크기를 바꾸고 다시 그린 뒤 delay() 로 잠시 멈춤
    }

    private void delay() {
        // TODO [실습 12-1] time 밀리초만큼 쉼 (LoopSample 의 delay 참고)
    }
}
