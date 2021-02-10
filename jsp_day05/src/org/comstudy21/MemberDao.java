package org.comstudy21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
//
//	private static ArrayList<MemberVo> list = new ArrayList<MemberVo>();
//	static {
//		list.add(new MemberVo("1001", "KIM", "kim@naver.com", "010-1111-1111"));
//		list.add(new MemberVo("1002", "HONG", "hong@naver.com", "010-1111-2222"));
//		list.add(new MemberVo("1003", "PARK", "park@naver.com", "010-1111-3333"));
//	}
	private static Connection conn = null;
	private static Statement stmt = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;

	static String SELEC_ALL = "SELECT * FROM MEMBER";
	static String INSERT = "INSERT INTO MEMBER VALUES(?,?,?,?)";

	public static void insert(MemberVo vo) {

	}

	public static List<MemberVo> selectAll() {
		List<MemberVo> list = new ArrayList<MemberVo>();

		return list;
	}
}