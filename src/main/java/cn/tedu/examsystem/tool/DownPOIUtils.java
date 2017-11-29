package cn.tedu.examsystem.tool;

import cn.tedu.examsystem.pojo.Student;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DownPOIUtils {
    public DownPOIUtils() {
    }

    public static void downPoi(HttpServletResponse response, Map<Student, String> map) throws Exception {
        String fname = "detial" + getTimeStamp();
        OutputStream os = response.getOutputStream();
        response.reset();
        response.setHeader("Content-disposition", "attachment; filename=" + fname + ".xls");
        response.setContentType("application/msexcel");

        try {
            (new DownPOIUtils().new POIS()).createFixationSheet(os, map);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }

    public static String getTimeStamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    class POIS {
        POIS() {
        }

        public void createFixationSheet(OutputStream os, Map<Student, String> student) throws Exception {
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet();
            HSSFRow row = sheet.createRow(0);
            sheet.createFreezePane(0, 1);
            this.cteateCell(wb, row, (short)0, "学号");
            this.cteateCell(wb, row, (short)1, "姓名");
            this.cteateCell(wb, row, (short)2, "性别");
            this.cteateCell(wb, row, (short)3, "班级");
            this.cteateCell(wb, row, (short)4, "分数");
            int i = 0;
            Set<Student> keySet = student.keySet();
            Iterator iterator = keySet.iterator();

            while(iterator.hasNext()) {
                ++i;
                HSSFRow rowi = sheet.createRow((short)i);
                Student student2 = (Student)iterator.next();

                for(int j = 0; j < 4; ++j) {
                    this.cteateCell(wb, rowi, (short)0, student2.getsId().toString());
                    this.cteateCell(wb, rowi, (short)1, student2.getsName());
                    this.cteateCell(wb, rowi, (short)2, student2.getsGender());
                    this.cteateCell(wb, rowi, (short)3, student2.getsClass());
                    this.cteateCell(wb, rowi, (short)4, (String)student.get(student2));
                }
            }

            wb.write(os);
            os.flush();
            os.close();
            System.out.println("文件生成");
        }

        private void cteateCell(HSSFWorkbook wb, HSSFRow row, short col, String val) {
            HSSFCell cell = row.createCell(col);
            cell.setCellValue(val);
            HSSFCellStyle cellstyle = wb.createCellStyle();
            cellstyle.setAlignment((short)6);
            cell.setCellStyle(cellstyle);
        }
    }
}
