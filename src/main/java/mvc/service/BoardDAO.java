package mvc.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mvc.model.BoardDTO;
import mvc.model.ListDTO;

@Transactional
@Service
public class BoardDAO {

	@Autowired
	SqlSessionTemplate sqlsessionTemplate;
	
	public Object list(BoardDTO dto) {
		return sqlsessionTemplate.selectList("boardMM.list", dto); //boardMapper에서 namespace가 boardMM으로 찾아감
	}
	
	public Object insertOne(BoardDTO dto) {
		return sqlsessionTemplate.insert("boardMM.insertOne", dto);
	}
	
	public Object selectOne(BoardDTO dto) {
		return sqlsessionTemplate.selectOne("boardMM.selectOne", dto);
	}
	
	public Object deleteOne(BoardDTO dto) {
		return sqlsessionTemplate.delete("boardMM.deleteOne", dto);
	}
	
	public Object modify(BoardDTO dto) {
		return sqlsessionTemplate.update("boardMM.modify", dto);
	}
	
	public void addCount(BoardDTO dto) {
		sqlsessionTemplate.update("boardMM.addCount", dto);
	}
	
	public void insertList(ListDTO dto) {
		sqlsessionTemplate.insert("boardMM.insertList", dto);
	}
	
	public void insertError(ListDTO dto) throws Exception {
		for(BoardDTO boardDTO : dto.getMem()) {
			sqlsessionTemplate.insert("boardMM.insertError", boardDTO);
		}
	}
	
}
