package ex12_Stream;

import java.util.ArrayList;
import java.util.Scanner;

public class BizCardApp {
    Scanner sc = new Scanner(System.in);
    private int nextBizCardNo = 1;
    private ArrayList<BizCard> bizCards;
    public BizCardApp() {
        bizCards = new ArrayList<BizCard>();
    }

    public void doManage() {

        outer : while (true) {
            String selection = selectTask();
            switch(selection) {
                case "1": // 등록
                    BizCard bizCard = newBz();
                    bizCard.setNo(nextBizCardNo);
                    bizCards.add(bizCard);
                    nextBizCardNo++;
                    break;
                case "2": // 목록 보기
                    if (nextBizCardNo == 0) {
                        System.out.println("등록된 명함이 없습니다.");
                    } else {
                        showMember();
                    }
                    break;
                case "3": // 검색
                    break;
                case "4": // 수정
                    break;
                case "5": // 삭제
                    break;
                case "6": // 저장
                    break;
                case "9": // 종료
                    System.out.println("명함 관리 프로그램을 종료합니다.");
                    break outer;
                default :
                    System.out.println("지원하지 않는 작업입니다.");
                    break;
            }
        }

    }

    private String selectTask() {
        System.out.println("************************************");
        System.out.println("* 1. 명함 등록                        *");
        System.out.println("* 2. 명함 목록 보기                     *");
        System.out.println("* 3. 명함 검색                        *");
        System.out.println("* 4. 명함 수정                        *");
        System.out.println("* 5. 명함 삭제                        *");
        System.out.println("* 6. 명함 저장                        *");
        System.out.println("* 9. 종료                            *");
        System.out.println("************************************");
        System.out.print("작업을 선택하세요 : ");
        String selection = sc.nextLine();

        return selection;
    }

    private void showMember() {
        for ( BizCard s : bizCards) {
            System.out.println("[사원 정보 목록]");
            String sb = s.toString();
            System.out.println(sb);
        }
    }

    private BizCard newBz() {
        BizCard bizCard = new BizCard();

        System.out.print("사원 이름 : ");
        String name = sc.nextLine();

        System.out.print("전화번호 : ");
        String phone = sc.nextLine();

        bizCard.setName(name);
        bizCard.setPhone(phone);

        return bizCard;
    }

    public static void main(String[] args) {
        BizCardApp app = new BizCardApp();
         app.doManage();
    }
}
