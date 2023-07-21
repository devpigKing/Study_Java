package ex07_ToDo;

import ex07_ToDo.ToDo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ToDoApp {

    private final Scanner sc = new Scanner(System.in);
//    private final ToDo[] toDos = new ToDo[1000]; // 할 일을 저장, 관리하는 배열
    private int nextPosition = 1; // 다음 할 일을 등록할 때, 사용할 자동 증가 값.
    private ArrayList<ToDo> toDos = new ArrayList<>();

    /**
     * 할 일 목록 관리 로직 구현 메서드
     */
    public void doManage() {

        outer : while (true) {
            String select = selectTask();
            switch (select) {
                case "1": // 등록 처리
                    ToDo toDo = inputNewToDo();

                    // 4. ToDo 인스턴스를 할 일 관리 배열에 추가
                    toDo.setNo(nextPosition);
//                    toDos[nextPosition] = toDo;
                    toDos.add(toDo);
                    nextPosition++; // 다음에 등록할 할 일 번호 변경

                    break;
                case "2":
                    if ( nextPosition == 0 ) {
                        System.out.println("등록된 할 일이 없습니다.");
                    } else {
                        showAllToDos();
                    }
                    break;
                case "3":
                    // 검색어 입력
                    System.out.println("검색어를 입력하세요 : ");
                    String searchWord = sc.nextLine();
                    // 입력된 내용이 포함된 ToDo 찾기 (반복문)
//                    for ( int i = 0; i < nextPosition; i++) {
                    for ( int i = 0; i < toDos.size(); i++) {

                        String title = toDos.get(i).getTitle();
                        if ( title.contains(searchWord)) {
                            // 결과 표시
                            System.out.println(toDos.get(i).info());
                        }
                    }
                    break;


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

    private ToDo inputNewToDo() {
        // 1. ToDo 인스턴스 만들기
        ToDo toDo = new ToDo();

        // 2. 사용자 입력 + ToDo 인스턴스에 저장
        System.out.print("할 일 제목 : ");
        String title = sc.nextLine();

        System.out.print("할 일 내용 : ");
        String content = sc.nextLine();

        // 3. 입력 데이터를 toDo 인스턴스에 저장
        toDo.setTitle(title);
        toDo.setContent(content);


        return toDo;
    }

    private void showAllToDos() {

        for (ToDo toDo : toDos) {
            System.out.println("[전체 할 일 목록]");
            // 처음부터 마지막 할 일이 등록되어 있는 위치까지 순회
            String info = toDo.info();
            System.out.println(info);
        }
    }

    public static void main(String[] args) {

        ToDoApp toDoApp = new ToDoApp();
        toDoApp.doManage();

    }
}
