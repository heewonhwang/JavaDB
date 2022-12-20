package db_java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	 
	public boolean insert(Dto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			
			conn = new Driver().getConn();
			
			String sql = "INSERT INTO lib_eng"
					+ " (num, lib_name, code, ad_name, address, phone, url, time, holiday, devision, dev_name, lat, longitude)"
					+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getIndex());
			pstmt.setString(2, dto.getLib_name());
			pstmt.setString(3, dto.getCode());
			pstmt.setString(4, dto.getAd_name());
			pstmt.setString(5, dto.getAddress());
			pstmt.setString(6, dto.getPhone());
			pstmt.setString(7, dto.getUrl());
			pstmt.setString(8, dto.getTime());
			pstmt.setString(9, dto.getHoliday());
			pstmt.setString(10, dto.getDevision());
			pstmt.setString(11, dto.getDev_name());
			pstmt.setString(12, dto.getLat());
			pstmt.setString(13, dto.getLongitude());
			
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
		if (flag > 0) {
			
			return true;
		} else {
			
			return false;
		}
	}
	
	public boolean update(Dto dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			
			conn = new Driver().getConn();
			
			String sql = "UPDATE lib_eng"
					+" SET phone=?, holiday=?"
					+" WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getPhone());
			pstmt.setString(2, dto.getHoliday());
			pstmt.setInt(3, dto.getIndex());
			
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
		if (flag > 0) {
			
			return true;
		} else {
			
			return false;
		}
	}
	
	public boolean delete(Dto dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			
			conn = new Driver().getConn();
			
			String sql = "DELETE FROM lib_eng"
					+" WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getIndex());
			
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
		if (flag > 0) {
			
			return true;
		} else {
			
			return false;
		}
	}
	
	public List<Dto> getList(){
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dto> list = new ArrayList<>();
		
		try {
		
			conn = new Driver().getConn();
			
			String sql = "SELECT lib_name, time, holiday"
					+" FROM lib_eng";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				
				Dto dto = new Dto();
				dto.setLib_name(rs.getString("lib_name"));
				dto.setTime(rs.getString("time"));
				dto.setHoliday(rs.getString("holiday"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
		return list;
	}
}
