package egovframework.dongin.ivory.service;

import java.util.List;

import egovframework.dongin.ivroy.vo.TestVO;

public interface TestService {
	public List<TestVO> selectTest(TestVO testVO) throws Exception;
	
	public void insertTest(TestVO testVO) throws Exception;
	
	public void deleteTest(int testId) throws Exception;
	
	public void updateTest(TestVO testVO) throws Exception;
	
	public TestVO selectOne(int testId) throws Exception;
}
