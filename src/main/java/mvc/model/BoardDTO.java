package mvc.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

@Alias("boardDTO") // mapper에서 사용하는 별칭
public class BoardDTO {

	Integer id, cnt;
	Date reg_date;
	String pname, pw, title, content, upfile, sch, cntType;
	MultipartFile upfileMM;
	ArrayList<BoardDTO> mem;
	
	public String getCntType() {
		return cntType;
	}

	public void setCntType(String cntType) {
		this.cntType = cntType;
	}

	public ArrayList<BoardDTO> getMem() {
		return mem;
	}

	public void setMem(ArrayList<BoardDTO> mem) {
		this.mem = mem;
	}

	public String getSch() {
		return sch;
	}

	public void setSch(String sch) {
		this.sch = sch;
	}

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss");

	public MultipartFile getUpfileMM() {
		return upfileMM;
	}

	public void setUpfileMM(MultipartFile upfileMM) {
		this.upfileMM = upfileMM;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getReg_date() {
		return reg_date;
	}
	
	public String getReg_dateStr() {
		return sdf.format(reg_date);
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public Integer getCnt() {
		return cnt;
	}

	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}
	
	public String getContentBr() {
		return content.replaceAll("\n", "<br>");
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUpfile() {
		return upfile;
	}

	public void setUpfile(String upfile) {
		this.upfile = upfile;
	}

	@Override
	public String toString() {
		return "BoardDTO [id=" + id + ", cnt=" + cnt + ", reg_date=" + reg_date + ", pname=" + pname + ", pw=" + pw
				+ ", title=" + title + ", content=" + content + ", upfile=" + upfile + ", sch=" + sch + ", cntType="
				+ cntType + ", upfileMM=" + upfileMM + ", mem=" + mem + ", sdf=" + sdf + "]";
	}

}
