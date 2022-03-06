package egovframework.dongin.ivory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.dongin.ivory.DAO.TestDAO;
import egovframework.dongin.ivory.service.TestService;
import egovframework.dongin.ivroy.vo.TestVO;

@Service
public class TestSerivceImpl implements TestService {

	@Autowired
	private TestDAO testDAO;
	
	@Override
	public List<TestVO> selectTest(TestVO testVO) throws Exception {
	
		return testDAO.selectTest(testVO);
	}
	
	@Override
	public void insertTest(TestVO testVO) throws Exception {
	
		testDAO.insertTest(testVO);
	}
	
	@Override
	public void deleteTest(int testId) throws Exception {
	
		testDAO.deleteTest(testId);
	}
	
	@Override
	public void updateTest(TestVO testVO) throws Exception {
	
		testDAO.updateTest(testVO);
	}
	
	@Override
	public TestVO selectOne(int testId) throws Exception {
	
		return testDAO.selectOne(testId);
	}
	

}
