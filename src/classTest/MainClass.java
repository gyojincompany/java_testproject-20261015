package classTest;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		
		//사용자가 작성한 글이 인터넷을 타고 글제목과 글내용의 정보가 도착
		//나머지 4개의 정보를 받아서 각각의 변수에 저장하는 작업
		//총 6개의 정보가 6개의 변수에 저장
		
		int bnum = 11; //게시판 글 번호가 11번이 할당
		String btitle = "안녕하세요 가입인사드려요"; //게시판 글 제목이 할당
		String bcontent = "오늘은 비가오다가 날씨가 맑아졌네요"; //게시판 글 내용이 할당
		String bwriter = "tiger"; //글쓴이 아이디 할당
		String bdate = "2026-10-15"; //글쓴 날짜 할당
		int bhit = 0; //글 조회수 초기값 0
		
		
		Board board1 = new Board(bnum, btitle, bcontent, bwriter, bdate, bhit);
		//글 정보가 저장된 6개의 정보를 가지고 board1 객체를 생성자를 통해 초기화
		
		
		Board board2 = new Board();
		//객체 멤버변수에 직접 접근하여 초기화
//		board2.boardNum = bnum;
//		board2.boardTite = btitle;
//		board2.boardContent = bcontent;
//		board2.boardWriter = bwriter;
//		board2.boardDate = bdate;
//		board2.boardHit = bhit;
		
		//setter를 이용해서 객체를 초기화
		board2.setBoardNum(bnum);
		board2.setBoardTite(btitle);
		board2.setBoardContent(bcontent);
		board2.setBoardWriter(bwriter);
		board2.setBoardDate(bdate);
		board2.setBoardHit(bhit);
		
		//해당 글의 글쓴이를 가져와서 출력
		//객체의 멤버 변수값을 가져오려면 getter를 사용
		String bid = board1.getBoardWriter(); //boardWriter 값을 반환
		System.out.println(bid);
		
		ArrayList<Board> boardList = new ArrayList<>();
		
		boardList.add(board1);
		boardList.add(board2);
		
		HashMap<Integer, String> hmap = new HashMap<>();
		
		hmap.put(1, "홍길동");
		hmap.put(2, "김유신");
		hmap.put(3, "강감찬");
		
		hmap.get(2); //김유신
	}

}
