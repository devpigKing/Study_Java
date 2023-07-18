package Ex07_ToDo;

import java.util.Date;

public class ToDo {

    // ToDo List의 간단한 특성
    private int no; // 고유 식별번호
    private String title; // 제목
    private String content; // 간단한 메모
    private Date regDate; // 등록일자

    // ------------생성자--------------
    public ToDo() {
        // do nothing
        this.regDate = new Date();
    }

    public ToDo(int no, String title, String content /*, Date regDate*/) {
        this();
        this.no = no;
        this.title = title;
        this.content = content;
//        this.regDate = regDate;
//        this.regDate = new Date();
    }

    // --------------getter&&Setter-----------------
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getRegDate() {
        return regDate;
    }
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }


    // ------------------메서드---------------------
    public String info() {
        String info = String.format("[%3d][%s][%s][%s]", no, title, content, regDate);
        return info;
    }

}
