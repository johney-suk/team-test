package org.comstudy21.ch21_2;

import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.comstudy21.MyJFrame;

public class JTableEx extends MyJFrame {
   JPanel ctxPane = null;
   
   JTable table = null;
   DefaultTableModel dm = null;
   Vector<Vector<String>> data = new Vector<Vector<String>>();
   Vector<String> columnNames = new Vector<String>();
   {
//      columnNames.add("번호");
//      columnNames.add("이름");
//      columnNames.add("이메일");
//      columnNames.add("전화번호");
//      
//      Vector<String> rowData = new Vector<String>();
//      rowData.add("1001");
//      rowData.add("홍길동");
//      rowData.add("hong@korea.com");
//      rowData.add("010-1111-1211");
//      data.add(rowData);
	   
	   data.daa(new MemberVo("101","PARK","park@korea.com","010-1234-1234").getVectorData());
	   data.daa(new MemberVo("102","KIM","kim@korea.com","010-1234-2244").getVectorData());

   }
   
   public JTableEx() {
      ctxPane = (JPanel)getContentPane();
      dm = new DefaultTableModel(data, columnNames);
      table = new JTable(dm);
      
      ctxPane.add(BorderLayout.CENTER, new JScrollPane(table));
   }

   public static void main(String[] args) {
      new JTableEx().setVisible(true);;
   }

}