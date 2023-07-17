package Ex07_ToDo;

import java.util.Date;
import java.util.Scanner;

public class ToDoApp {

    private Scanner sc = new Scanner(System.in);
    private ToDo[] toDos = new ToDo[1000]; // 할 일을 저장, 관리하는 배열
    private int nextPosition = 0; // 다음 할 일을 등록할 때, 저장할 배열의 위치 값

    /**
     * 할 일 목록 관리 로직 구현 메서드
     */
    public void doManage() {

        outer : while (true) {
            String select = selectTask();
            switch (select) {
                case "1": // 등록 처리
                    // 1. ToDo 인스턴스 만들기
                    ToDo toDo = new ToDo();

                    // 2. 사용자 입력 + ToDo 인스턴스에 저장
                    System.out.print("할 일 제목 : ");
                    String title = sc.nextLine();

                    System.out.print("할 일 내용 : ");
                    String content = sc.nextLine();
                    Date now = new Date();

                    // 입력 데이터를 toDo 인스턴스에 저장
                    toDo.setTitle(title);
                    toDo.setContent(content);
                    toDo.setRegDate(now);

                    // 3. ToDo 인스턴스를 할 일 관리 배열에 추가
                    toDos[nextPosition] = toDo;
                    nextPosition++; // 다음에 등록할 위치 변경

                    break;
                case "2":
                    if ( nextPosition == 0 ) {
                        System.out.println("등록된 할 일이 없습니다.");
                        break;
                    }
                    for (int i = 0; i < nextPosition; i++) {
                        // 처음부터 마지막 할 일이 등록되어 있는 위치까지 순회
                        String info = toDos[i].info();
                        System.out.println(info);
                    }
                    break;
                case "3": break;
                case "4": break;
                case "5": break;
                case "9":
                    System.out.println("할 일 관리 프로그램을 종료합니다.");
                    break outer;
                default :
                    System.out.println("지원하지 않는 작업입니다.");
                    break;
            }
        }

    }

    private String selectTask() {
        System.out.println("**************************************");
        System.out.println("* 1. 할 일 등록                    *");
        System.out.println("* 2. 할 일 목록                    *");
        System.out.println("* 3. 할 일 검색                    *");
        System.out.println("* 4. 할 일 수정                    *");
        System.out.println("* 5. 할 일 삭제                    *");
        System.out.println("* 9. 종료                         *");
        System.out.println("**************************************");
        System.out.print("작업을 선택하세요 : ");
        String select = sc.nextLine();

        return select;
    }

    public static void main(String[] args) {

        ToDoApp toDoApp = new ToDoApp();
        toDoApp.doManage();

    }
}
