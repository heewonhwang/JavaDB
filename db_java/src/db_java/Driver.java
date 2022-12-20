/*******************************************************************************************
* @filename  Driver.java
* @date      2022.12.20
* @comment   데이터베이스(mariaDB)에 접속해주는 드라이버 클래스
********************************************************************************************/
package db_java;

import java.sql.Connection;
import java.sql.DriverManager;

public class Driver {

	private Connection conn;
	
	public Driver() {
	      try {
	    	 //오라클 드라이버 클래스 로딩(OracleDriver 클래스를 사용할 준비를 한다)
	         Class.forName("org.mariadb.jdbc.Driver");
	         //접속할 DB 의 정보
	         String url="jdbc:mysql://127.0.0.1/db01";
	         //DB 연결 객체의 참조값 얻어와서 필드에 담기
	         conn=DriverManager.getConnection(url, "root", "1234");
	         System.out.println("Oracle DB 접속 성공!");
	         
	      }catch(Exception e){
	      
	      }
	      
	}
	
	public Connection getConn() {
		return conn;
	}
}
