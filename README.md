# COM2018 객체지향 프로그래밍 — 수업 소스코드

한양대학교 ERICA 소프트웨어융합대학 컴퓨터학부 · 2026 가을학기 · 김현하

이론 수업 예제 코드와 실습 뼈대 코드, 실습 답안 코드를 모아 둔 저장소입니다.
Java(JDK)와 IntelliJ IDEA 환경을 기준으로 합니다.

## 구성

| 디렉토리 | 내용 | 범위 |
|---|---|---|
| `lectures/` | 이론 수업 예제 코드 (`chapters.weekNN` 패키지) | 1~12주차 |
| `labs-skeleton/` | 실습 뼈대 코드 — 실습 시간에 이 코드에서 시작합니다 (`labs.labNN` 패키지) | 실습 1~11 |
| `labs-solution/` | 실습 답안 코드 (`labs.labNN` 패키지) | 실습 1~11 |

- 4주차 이론 예제는 슬라이드 안에서만 다루므로 별도 코드가 없습니다.
- 8주차는 중간고사라서 이론·실습 코드가 없습니다.
- 뼈대와 답안은 같은 패키지 이름을 쓰므로 **서로 다른 소스 루트**로 열어야 합니다.

### 주차별 주제

| 주차 | 이론 | 실습 |
|:---:|:---|:---|
| 1 | 강의 소개 · 첫 애플리케이션 만들기 | 시계 출력 (콘솔·GUI) |
| 2 | 식, 변수, 타입 | 단위 환산, 9의 배수 판정 |
| 3 | 제어구조: 선택과 반복 | 발열 판정, 성적 출력기, 명령 처리기 |
| 4 | 클래스, 메소드, 객체 | 원의 면적 — 메소드 만들기 |
| 5 | 초기화 메소드와 필드 변수 | 계란 그리기 |
| 6 | 객체지향 개념 소개 | 이상한 나라의 앨리스 |
| 7 | MVC 아키텍처와 역할 분리 | 원 면적 프로그램을 MVC로 나누기 |
| 9 | 자료구조: 배열 | 슬라이딩 퍼즐 |
| 10 | 상속과 인터페이스를 활용한 재사용 | 상속, instanceof, 카드 게임 Dealer |
| 11 | GUI와 이벤트 구동 프로그래밍 ① | 양궁 과녁, 크기·색이 변하는 공 |
| 12 | GUI와 이벤트 구동 프로그래밍 ②: 메뉴, 람다, 애니메이션 | — |

## 소스코드 내려받기

아래 세 방법 중 편한 것 하나를 고르세요. git을 처음 쓴다면 **방법 1**이 가장 쉽습니다.

### 방법 1. ZIP 파일로 내려받기 (git 없이)

1. 웹 브라우저로 저장소 페이지 <https://github.com/Hyunha/2026COM2018> 에 접속합니다.
2. 파일 목록 위의 초록색 **`<> Code`** 버튼을 누릅니다.
3. 펼쳐진 메뉴 맨 아래의 **Download ZIP** 을 누릅니다.
4. 내려받은 `2026COM2018-main.zip` 의 압축을 풉니다.
   - Windows: 파일을 우클릭 → **압축 풀기(모두 추출)**
   - macOS: 파일을 더블클릭
5. 압축을 푼 `2026COM2018-main` 폴더를 아래 [사용 방법](#사용-방법)대로 IntelliJ에서 엽니다.

> ZIP으로 받은 폴더는 저장소가 바뀌어도 저절로 갱신되지 않습니다.
> 새 주차 코드가 올라오면 같은 방법으로 다시 내려받으세요.

### 방법 2. IntelliJ IDEA에서 바로 가져오기

git이 설치되어 있지 않아도 IntelliJ가 설치를 안내해 줍니다.

1. IntelliJ 시작 화면에서 **Clone Repository** (또는 메뉴 **File → New → Project from Version Control...**) 를 누릅니다.
2. **URL** 칸에 `https://github.com/Hyunha/2026COM2018.git` 를 붙여 넣습니다.
3. **Directory** 에서 저장할 위치를 고르고 **Clone** 을 누릅니다.
4. 새 주차 코드가 올라오면 메뉴 **Git → Pull...** 로 최신 내용을 받을 수 있습니다.

### 방법 3. 명령줄에서 git 사용

```bash
git clone https://github.com/Hyunha/2026COM2018.git
cd 2026COM2018

# 이후 새 내용 받기
git pull
```

> 실습 뼈대 코드를 고쳐서 과제를 하는 경우, 방법 2·3으로 받은 폴더에서 `git pull` 을 하면
> 내가 고친 파일과 충돌할 수 있습니다. 과제는 뼈대 코드를 **복사한 별도 프로젝트**에서 하는 것을 권장합니다.

## 사용 방법

### IntelliJ IDEA

1. 내려받은 저장소 폴더를 IntelliJ에서 엽니다 (**File → Open...** → 폴더 선택).
2. 사용할 디렉토리(`lectures`, `labs-skeleton`, `labs-solution` 중 하나 이상)를 우클릭하여
   **Mark Directory as → Sources Root** 로 지정합니다.
   `labs-skeleton` 과 `labs-solution` 은 같은 클래스 이름이 겹치므로 동시에 지정하지 마세요.
3. `main` 메소드가 있는 클래스를 열어 실행합니다.

### 명령줄

```bash
# 이론 예제 컴파일 후 실행
javac -encoding UTF-8 -d out $(find lectures -name '*.java')
java -cp out chapters.week01.HelloWorld

# 실습 뼈대 (답안은 labs-skeleton 대신 labs-solution)
javac -encoding UTF-8 -d out-lab $(find labs-skeleton -name '*.java')
java -cp out-lab labs.lab01.Clock
```

## 저작권과 이용 조건

이 저장소의 예제 중 상당수는 David A. Schmidt 교수님(Kansas State University)의 교재
*Programming Principles in Java: Architectures and Interfaces* 의 예제를 바탕으로 수업에 맞추어 수정·확장한 것이고,
교재에 없는 예제는 새로 작성했습니다.
**원 교재와 예제 소스코드 상당수의 저작권은 원저자 Schmidt 교수님에게 있으며**, 저장소 전체의 이용은 원저자가 교재 페이지에 남긴 안내의 취지를 따릅니다.
자세한 내용은 [LICENSE.md](LICENSE.md) 를 보세요.

- **개인 학습** 또는 **본인이 가르치는 수업**에는 무료로 사용할 수 있습니다. 사용할 때는 원저자에게 알려 주세요.
- 그 밖의 복제·재배포와 **상업적 이용**은 허락을 받아야 합니다.

이 저장소(수정·추가한 부분)에 관한 문의: lagrato@gmail.com

---

## English summary

Source code for COM2018 Object-Oriented Programming (Hanyang University ERICA, Fall 2026):
lecture examples for weeks 1–12 (`lectures/`), lab skeletons for labs 1–11 (`labs-skeleton/`),
and lab solutions for labs 1–11 (`labs-solution/`).

Many of the examples are adapted from *Programming Principles in Java: Architectures and Interfaces*
by David A. Schmidt (Kansas State University); copyright in the original text and in many of the
example programs belongs to him. Examples not found in the text were written for this course.
Use of the whole repository follows the spirit of the author's notice on his page for the text (see [LICENSE.md](LICENSE.md)):
free for personal study or for a course you are teaching (please let the author know you are using it);
any other copying, redistribution or commercial use requires permission.
