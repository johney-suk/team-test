package org.comstudy21.member;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.comstudy21.util.JdbcUtil;

public class MemberDao {

	public static void main(String[] args) {
		String SELECT = "SELECT * FROM MEMBER";
		Connection conn = JdbcUtil.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		// Statement 객체를 이용해서 DB에 SQL문을 전달한다.
		try {
			stmt = conn.createStatement();
			// SQL 쿼리를 실행하고 그 결과를 ResultSet 객체로 돌려 받는다.
			rs = stmt.executeQuery(SELECT);
			while(rs.next()) {
				String code = rs.getString(1);
				String name = rs.getString(2);
				String id = rs.getString(3);
				String pwd = rs.getString(4);
				int age = rs.getInt(5);
				
				System.out.printf("%s, %s, %s, %s, %d\n", code, name, id, pwd, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			JdbcUtil.close(conn);
		}
	}
}
