package org.comstudy21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.dbcp.JdbcUtil;

public class MemberDao {
	/*
	 * private static ArrayList<MemberVo> list = new ArrayList<MemberVo>(); 
	 * static {
	 * list.add(new MemberVo("1001", "HONG", "hong@naver.com", "010-1111-1111"));
	 * list.add(new MemberVo("1002", "KIM", "kim@korea.com", "010-1122-1221"));
	 * list.add(new MemberVo("1003", "LEE", "leee@kakao.com", "010-1123-1234")); }
	 */
	private static Connection conn = null;
	private static Statement stmt = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	
	static String SELECT_ALL = "SELECT * FROM MEMBER";
	static String INSERT = "INSERT INTO MEMBER VALUES(?,?,?,?)";
	static String SELECT = "SELECT * FROM MEMBER WHERE NO=?";
	static String SELECT_NO = "SELECT NO FROM MEMBER";

	public static void insert(MemberVo vo) {
		conn = JdbcUtil.getConnection();
		int maxNo = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_NO);
			while(rs.next()) {
				if(Integer.parseInt(rs.getString("no")) > maxNo) {
					maxNo = Integer.parseInt(rs.getString("no"));
				}
			}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		
		try {
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, ""+ (maxNo+1));
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getPhone());
			int cnt = pstmt.executeUpdate();
			if(cnt > 0) {
				//System.out.println("저장 완료!");
				conn.commit();
			} else {
				System.out.println("저장 실패!");
				conn.rollback();
			}
		} catch (SQLException e) {
			System.out.println("저장 실패!");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
			JdbcUtil.close(stmt);
		}
	}
	
	public static List<MemberVo> selectAll() {
		List<MemberVo> list = new ArrayList<MemberVo>();
		conn = JdbcUtil.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while(rs.next()) {
				MemberVo member = new MemberVo();
				member.setNo(rs.getString(1));
				member.setName(rs.getString(2));
				member.setEmail(rs.getString(3));
				member.setPhone(rs.getString(4));
				list.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, stmt, rs);
		}
		
		return list;
	}
	
	public static MemberVo selectOne(MemberVo vo) {
		MemberVo member = null;
		
		conn = JdbcUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(SELECT);
			pstmt.setString(1, vo.getNo());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new MemberVo();
				member.setNo(rs.getString(1));
				member.setName(rs.getString(2));
				member.setEmail(rs.getString(3));
				member.setPhone(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		return member;
	}
	
	public static void delete(MemberVo vo) {
		String DELETE = "DELETE FROM MEMBER WHERE no=?";
		conn = JdbcUtil.getConnection();
		try {
			pstmt = conn.prepareCall(DELETE);
			pstmt.setString(1, vo.getNo());
			int cnt = pstmt.executeUpdate();
			if(cnt > 0) {
				System.out.println("삭제 완료!");
				conn.commit();
			} else {
				System.out.println("삭제 실패!");
				conn.rollback();
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
	}
	
	public static void modify(MemberVo vo) {
		String MODIFY = "UPDATE MEMBER SET NAME=?, EMAIL=?, PHONE=? WHERE NO=?";
		conn = JdbcUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(MODIFY);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getPhone());
			pstmt.setString(4, vo.getNo());
			int cnt  = pstmt.executeUpdate();
			if(cnt > 0) {
				System.out.println("수정 완료!");
				conn.commit();
			} else {
				System.out.println("수정 실패!");
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				System.out.println("수정 실패!");
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
	}
	
	public static void main(String[] args) {
		//insert(new MemberVo("1004", "TEST", "test@a.com", "010-1111-2222"));
		
//		List<MemberVo> list = selectAll();
//		for(MemberVo vo : list) {
//			System.out.println(vo);
//		}
		
		MemberVo member = selectOne(new MemberVo("1001"));
		System.out.println(member);
	}
}