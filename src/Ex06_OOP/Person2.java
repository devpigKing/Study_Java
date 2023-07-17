package Ex06_OOP;

public class Person2 {


        // 특성 : 변수로 표현 : 필드
        // private (접근지정자 : 외부에서 접근할 수 없음)
        private int no = 28;
        private String name;
        private String phone;
        private String email;

        // 생성자 : new 할 때 자동으로 호출되는 인스턴스 초기화
        public Person2() {
            System.out.println("전달인자 없는 생성자 메서드가 자동으로 호출되었습니다");
        }


        // getter, setter : 변수에 접근하는 전용 메서드
        // getter는 읽기
        // setter는 쓰기
        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        // 기능 : 메서드로 표현
        // public (접근지정자 : 외부에서 무제한 접근할 수 있음)
        public String info() {
            String info = String.format("[%d][%s][%s][%s]", no, name, phone, email); // 내부 접근
            return info;
        }

}
