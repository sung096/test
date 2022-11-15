package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.DeptVO;

public class DeptDAO {

	SqlSession sqlSession;
	
	//context-3-dao.xml -> DeptDAO dept_dao = new DeptDAO();
	//					   dept_dao.setSqlSession(sqlSessionBean);
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	//부서정보 조회
	public List<DeptVO> selectList() {
		List<DeptVO> list = sqlSession.selectList("dept.dept_list");
		return list;
	}
}
