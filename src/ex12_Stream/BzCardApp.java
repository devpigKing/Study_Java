package ex12_Stream;

import java.util.ArrayList;
import java.util.Scanner;

public class BzCardApp {


    private final Scanner sc= new Scanner(System.in);
    private int bzNo = 0;
    private ArrayList<BizCard> biz = new ArrayList<>();


    // 1. 작업 메뉴표시 + 선택
    // 2. 선택된 작업에 따라 실행하는 구조 만들기
    // 3. 등록 기능 구현

    public void BzCard() {

        menu : while (true) {
            String select = selectTask();
            switch (select) {
                case "1":
                    BizCard bzCard = newBz();

                    bzCard.setNo(bzNo);
                    biz.add(bzCard);
                    bzNo++;

                    break;
                case "2":
                    if ( bzNo == 0 ) {
                        System.out.println("등록된 사원이 없다.");
                    } else {
                        showMember();
                    }
                    break;
                case "3": break;
                case "4": break;
                case "5": break;
                case "9":
                    System.out.println("사원 정보 프로그램을 종료합니다.");
                    break menu;
                default :
                    System.out.println("지원하지 않는 작업입니다.");
                    break;
            }
        }
    }


    private String selectTask() {
        System.out.println("**************************************");
        System.out.println("* 1. 사원 등록                    *");
        System.out.println("* 2. 사원 목록                    *");
        System.out.println("* 3. 사원 검색                    *");
        System.out.println("* 4. 사원정보 수정                    *");
        System.out.println("* 5. 사원정보 삭제                    *");
        System.out.println("* 9. 종료                         *");
        System.out.println("**************************************");
        System.out.print("작업을 선택하세요 : ");
        String select = sc.nextLine();

        return select;
    }

    private BizCard newBz() {
        BizCard bizCard1 = new BizCard();

        System.out.println("사원 이름");
        String name = sc.nextLine();

        System.out.println("전화번호");
        String phone = sc.nextLine();

        bizCard1.setName(name);
        bizCard1.setPhone(phone);

        return bizCard1;
    }

    private void showMember() {

        for (BizCard bizCard : biz) {
            System.out.println("[사원 정보 목록]");
            String info = bizCard.toString();
            System.out.println(info);
        }

    }

    public static String main(String[] args) {

        // 1. 작업 메뉴표시 + 선택
        // 2. 선택된 작업에 따라 실행하는 구조 만들기
        // 3. 등록 기능 구현

        BzCardApp bzCardApp = new BzCardApp();
        bzCardApp.BzCard();


        return null;
    }
}
