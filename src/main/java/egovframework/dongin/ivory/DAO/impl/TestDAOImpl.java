package egovframework.dongin.ivory.DAO.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.dongin.ivory.DAO.TestDAO;
import egovframework.dongin.ivory.service.TestMapper;
import egovframework.dongin.ivroy.vo.TestVO;

@Repository
public class TestDAOImpl implements TestDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<TestVO> selectTest(TestVO testVO) throws Exception {
		// TODO Auto-generated method stub
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		return mapper.selectTest(testVO);
	}
	
	@Override
	public void insertTest(TestVO testVO) throws Exception {
		// TODO Auto-generated method stub
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		mapper.insertTest(testVO);
	}
	
	@Override
	public void deleteTest(int testId) throws Exception {
		// TODO Auto-generated method stub
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		mapper.deleteTest(testId);
	}
	
	@Override
	public void updateTest(TestVO testVO) throws Exception {
		// TODO Auto-generated method stub
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		mapper.updateTest(testVO);
	}
	
	@Override
	public TestVO selectOne(int testId) throws Exception {
		// TODO Auto-generated method stub
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		return mapper.selectOne(testId);
	}

}
