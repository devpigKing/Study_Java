package ex12_Stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BizCardApp {
    Scanner sc = new Scanner(System.in);
    private int nextBizCardNo = 1;
    private ArrayList<BizCard> bizCards;
    public BizCardApp() {
//        bizCards = new ArrayList<BizCard>();
        FileInputStream fis = null;  // 파일에서 읽는 객체
        ObjectInputStream ois = null;  // byte[] -> 객체 변환하는 객체
        try {
            fis = new FileInputStream("bizcards.dat");
            ois = new ObjectInputStream(fis);
            bizCards = (ArrayList<BizCard>)ois.readObject();
            if (bizCards.size() > 0) { // 읽어 온 목록에 데이터가 1개 이상인 경우에만 다음 번호 조정
                BizCard lastBizCard = bizCards.get(bizCards.size() - 1); // 마지막 할 일
                nextBizCardNo = lastBizCard.getNo() + 1; // 마지막 할 일 번호의 다음 번호를 다음에 생성할 ToDo의 번호로 저장
            }
        } catch (IOException | ClassNotFoundException ex) { // 두 종류의 예외를 한 곳에서 처리
            bizCards = new ArrayList<>(); // 파일 읽기 실패하면 빈 ArrayList로 초기화
        } finally {
            try { ois.close(); } catch (Exception ex) { /* do nothin - ignore exception */ }
            try { fis.close(); } catch (Exception ex) { /* do nothin - ignore exception */ }
        }
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
                case "3":// 검색
                    System.out.println("검색어를 입력하세요 : ");
                    String searchName = sc.nextLine();

                    ArrayList<BizCard> searchedCards = new ArrayList<BizCard>();

                    for( BizCard bizCard2 : bizCards) {
                        if (bizCard2.getName().contains(searchName)) {
                            searchedCards.add(bizCard2);
                        }
                    }

                    for(BizCard searchCard: searchedCards) {
                        System.out.println(searchCard);
                    }
                    break;
                case "4": // 수정
                    System.out.println("수정할 대상을 입력하세요 : ");
                    break;
                case "5": // 삭제
                    break;
                case "6": // 저장
                    saveBizCards();
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
        System.out.println("[사원 정보 목록]");
        for ( BizCard s : bizCards) {
            System.out.println(s.toString());
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


    private void saveBizCards() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("bizcards.dat");	// 저장
            oos = new ObjectOutputStream(fos);			// 객체 -> byte[] 변환
            oos.writeObject(bizCards);  // 파일에 데이터 쓰기
            System.out.println("파일에 할 일 데이터를 저장했습니다.");
        } catch (IOException e) { // IOException은 FileNotFoundException의 부모 클래스
            e.printStackTrace();  // 예외 정보를 화면에 출력, 테스트 할 때만 사용
        } finally {
            try { oos.close(); } catch (Exception ex) { /* do nothing - ignore exception */ }
            try { fos.close(); } catch (Exception ex) { /* do nothing - ignore exception */ }
        }
    }

    ////////////////////////////////
    public static void main(String[] args) {
        BizCardApp app = new BizCardApp();
         app.doManage();
    }
}
