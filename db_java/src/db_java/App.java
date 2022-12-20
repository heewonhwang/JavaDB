package db_java;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dao dao = new Dao();
		
		
		Dto dto1 = new Dto();
		dto1.setIndex(3333);
		dto1.setLib_name("마크애니 도서관");
		dto1.setCode("0008");
		dto1.setAd_name("종로구");
		dto1.setAddress("서울 중구 퇴계로 286");
		dto1.setPhone("02-2262-5222");
		dto1.setUrl("http://www.markany.com/");
		dto1.setTime("평일 : 09:00~20:00 주말 : 09:00~17:00");
		dto1.setHoliday("매주 월요일 및 법정공휴일");
		dto1.setDevision("0001");
		dto1.setDev_name("공공도서관");
		dto1.setLat("37.50230583");
		dto1.setLongitude("127.1739098");
		
		boolean isSuccess = dao.insert(dto1);
		if(isSuccess) {
			System.out.println("삽입 성공");
		}else {
			System.out.println("삽입 실패");
		}
		
		
		Dto dto2 = new Dto();
		dto2.setIndex(1935);
		dto2.setPhone("02-222-2222");
		dto2.setHoliday("매주 화요일 및 법정공휴일");
		
		boolean isSuccess2 = dao.update(dto2);
		if(isSuccess2) {
			System.out.println("갱신 성공");
		}else {
			System.out.println("갱신 실패");
		}
		
		
		
		Dto dto3 = new Dto();
		dto3.setIndex(48);
		
		boolean isSuccess3 = dao.delete(dto3);
		if(isSuccess3) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		

		
		List<Dto> list = new ArrayList<>();
		list = dao.getList();
		if(list.size()==0) {
			System.out.println("조회 내역이 없습니다.");
		}else {
			for(Dto tmp:list) {
				System.out.println(tmp.getLib_name() + " | " + tmp.getTime() + " | "  +tmp.getHoliday());
			}
		}

	}
	
	

}
