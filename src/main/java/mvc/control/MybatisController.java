package mvc.control;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.BoardDTO;
import mvc.model.ListDTO;
import mvc.model.PageStatus;
import mvc.service.BoardDAO;
import mvc.service.FileService;

@Controller
@RequestMapping("/mybatis/{service}")
public class MybatisController {

	@Autowired
	BoardDAO dao;
	
	@Autowired
	FileService fileService;
	
	PageStatus pageStatus = new PageStatus();
	
	@ModelAttribute("pageStatus")
	public Object statusGo() {
		return pageStatus;
	}
	
	@ModelAttribute
	public void listGo(@PathVariable("service") String service, ListDTO dto) {
		if(service.equals("insertMultiReg")) {
			System.out.println("listGo 진입 " + dto);
			dao.insertList(dto);
		}
		if(service.equals("insertErrorReg")) {
			try {
				dao.insertError(dto);
				pageStatus.setMsg("입력되었습니다.");
				pageStatus.setUrl("list");
			} catch (Exception e) {
				e.printStackTrace();
				pageStatus.setMsg("id 에러가 발생했습니다.");
				pageStatus.setUrl("list");
			}
		}
	}
	
	@ModelAttribute("data")
	public Object dataGo(@PathVariable("service") String service, BoardDTO dto, HttpServletRequest req, ArrayList<BoardDTO> mem) {
		
		Object res = null;
		switch(service) {
		
			case "list":
				System.out.println(dto.getCntType());
				res = dao.list(dto);
				break;
			case "insertReg":
				System.out.println(dto.getUpfileMM().isEmpty());
				if(!dto.getUpfileMM().isEmpty()) {
					dto.setUpfile(fileService.fileUpload(dto.getUpfileMM(), req));
				}
				System.out.println(dto);
				dao.insertOne(dto);
				System.out.println(res +":"+ dto);
				
				pageStatus.setMsg("등록되었습니다.");
				pageStatus.setUrl("detail?id=" + dto.getId());
				res = dto;
				break;
			//case "insertErrorReg":
				
			case "insertMultiReg":
				pageStatus.setMsg("입력되었습니다.");
				pageStatus.setUrl("list");
				res = dto;
				break;
			case "detail":
				dao.addCount(dto);
				/*res = dao.selectOne(dto);
				break;*/
			case "modifyForm":
				res = dao.selectOne(dto);
				break;
			case "deleteReg":
				pageStatus.setMsg("아이디 또는 비밀번호가 일치하지 않습니다.");
				pageStatus.setUrl("deleteForm?id=" + dto.getId());
				
				if((int)dao.deleteOne(dto) >= 1) {
					pageStatus.setMsg("삭제가 완료되었습니다.");
					pageStatus.setUrl("list");
				}
				res = dto;
				break;
			case "modifyReg":
				pageStatus.setMsg("아이디 또는 비밀번호가 일치하지 않습니다.");
				pageStatus.setUrl("modifyForm?id=" + dto.getId());
				
				if((int)dao.modify(dto) >= 1) {
					pageStatus.setMsg("수정이 완료되었습니다.");
					pageStatus.setUrl("detail?id=" + dto.getId());
				}
				res = dto;
				break;
				
		}
		return res;
	}
	
	@RequestMapping()
	public String view(@PathVariable("service") String service) {
		String res = "mybatis/" + service; 
		
		String [] arr = {"deleteReg", "modifyReg", "insertReg", "insertMultiReg", "insertMultiReg", "insertErrorReg"};
		
		/*if(service.equals("insertReg")) {
			res = "redirect:list";
		}*/
		
		if(Arrays.asList(arr).contains(service)) {
			res = "mybatis/alert";
		}
		/*if(service.equals("deleteReg") || service.equals("modifyReg") || 
		   service.equals("insertReg") || service.equals("insertMultiReg") ||
		   service.equals("insertError")) {
			res = "mybatis/alert";
		}*/
		return res;
	}
}
