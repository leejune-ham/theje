package mvc.service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {
	
	String path;

	public String fileUpload(MultipartFile mf, HttpServletRequest req) {
		
		path = req.getRealPath("/resources/up")+"/"; // 배포할 때 사용
		path = "D:\\workspace\\mvcProj\\src\\main\\webapp\\resources\\up/"; // 작업할 때 사용
		
		String res = fileNamePolicy(mf); // 새로운 파일명
		System.out.println("변경된 파일명 : " + res);
		
			try {
				
				FileOutputStream fos = new FileOutputStream(path + res);
				
				fos.write(mf.getBytes()); // Byte배열
				
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return res;
	}
	
	String fileNamePolicy(MultipartFile mf) {
		
		int dot = mf.getOriginalFilename().lastIndexOf("."); // .의 위치
		String ext = mf.getOriginalFilename().substring(dot); // 확장자
		String fileName = mf.getOriginalFilename().substring(0, dot); // 확장자 제외한 파일명
		
		String res = mf.getOriginalFilename();
		String filePath = path + res;
		
		File file = new File(filePath); // 경로를 결합해서 파일객체를 만듬. 왜? 동일한 파일이 존재하는지 확인하기 위해
		
		int cnt = 0;
		
		while(file.exists()) { // 동일한 파일명이 존재한다면
			res = fileName + "_" + cnt + ext; // 새로운 파일명을 만듦. 파일명_cnt.확장자
			filePath = path + res; // 파일경로+파일명
			
			file = new File(filePath); 
			cnt++;
		}
		
		return res;
	}
	
	// 이미지 확장자 체크
	/*
	private String isDuplication(MultipartFile mf) { // 파일명 중복 체크
			String originalName = mf.getOriginalFilename(); // 파일명.확장자
			String fileName = originalName.substring(0, originalName.lastIndexOf(".") - 1); // 확장자를 제외한 파일명
			String ext = originalName.substring(originalName.lastIndexOf(".") + 1).toLowerCase(); // 확장자 -> 소문자
			
			
			int cnt = 1;
			
			return ext;
	}
	*/
	
	// 이미지 확장자 체크
	public boolean isImgChk(MultipartFile mf) {
		String ext = mf.getOriginalFilename().toLowerCase().substring(mf.getOriginalFilename().lastIndexOf(".")+1);
		
		/*
		ArrayList<String> extList = new ArrayList<>();
		for(String string: "jpg, jpeg, gif, png, bmp".split(",")) {
			extList.add(string);
		}
		*/
		
		// List<String> extList = Arrays.asList("jpg", "jpeg", "gif", "png", "bmp");
		
		return Arrays.asList("jpg", "jpeg", "gif", "png", "bmp").contains(ext);
	}
	
	// 이미지 확장자 체크하는 다른 방법
	/*public boolean isImage(String ext) {
		List<String> extList = Arrays.asList("jpg", "jpeg", "gif", "png", "bmp");
		return extList.contains(ext); // true, 
	}*/
}
