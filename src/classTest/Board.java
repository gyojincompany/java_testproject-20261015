package classTest;

//Board 클래스 -> 게시판 글 하나를 책임질 설계도
//Board 클래스 -> 글 하나에 들어있는 모든 정보를 저장할 수 있는 변수가 모두 선언되어야 함
public class Board {
	
	private int boardNum; //게시판 글번호
	private String boardTite; //게시판 제목
	private String boardContent; //게시판 글 내용
	private String boardWriter; //게시판 글 쓴이
	private String boardDate; //게시판 글쓴 일시
	private int boardHit; //게시판 글 조회수
	
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Board(int boardNum, String boardTite, String boardContent, String boardWriter, String boardDate,
			int boardHit) {
		super();
		this.boardNum = boardNum;
		this.boardTite = boardTite;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
		this.boardHit = boardHit;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getBoardTite() {
		return boardTite;
	}

	public void setBoardTite(String boardTite) {
		this.boardTite = boardTite;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public int getBoardHit() {
		return boardHit;
	}

	public void setBoardHit(int boardHit) {
		this.boardHit = boardHit;
	}
	
	
	
}
