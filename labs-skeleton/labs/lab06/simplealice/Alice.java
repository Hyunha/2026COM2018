package labs.lab06.simplealice;

public class Alice {
    // TODO [실습 6-4] private int height 필드, getHeight(), private changeHeight(int) 추가

    // TODO [실습 6-2] 클래스 다이어그램을 보고 String getName() 작성
    public String getName() {
        return "";
    }

    public void eat(String food) {
        System.out.println("앨리스는 " + food + "을(를) 먹었습니다.");
    }

    // TODO [실습 6-2] 마신 것을 출력하는 drink 작성
    //      ([실습 6-5] 에서 문자열 대신 Drink 객체를 받도록 바꿉니다)
    public void drink(String beverage) {
    }

    // TODO [실습 6-2] 들어간 것을 출력하는 enter 작성
    //      ([실습 6-7] 에서 Door 객체를 받아 통과 여부를 스스로 판단하도록 바꿉니다)
    public void enter(String door) {
    }

    // TODO [실습 6-5] eat 이 문자열 대신 Cake 객체를 받도록 변경
    // TODO [실습 6-6] 버섯을 먹는 eat(Mushroom mushroom, boolean growthSide) 추가 (오버로딩)
}
