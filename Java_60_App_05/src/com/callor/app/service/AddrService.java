package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrService {
	
	// AddressVO type 의 매개변수 1개를 받기
	public void printAddr(AddressVO vo) {
		System.out.println(vo.toString());
	}
	
	// AddressVO 배열 type 의 매개변수 1개 받기
	// 배열의 개수만큼 AddressVO 가 전달된다
	public void printAddrList(AddressVO[] addrs) {

		for( AddressVO vo : addrs) {
			// 객체만 println() 에 전달하면
			// 내부에서 vo.toString() 을 호출하여 문자열을 받아 출력
			System.out.println(vo.toString());
		}
		
		for(int i = 0; i < addrs.length; i++) {
			System.out.println(addrs[i].toString());
		}
		
		
	}
	
	// 리스트로 받는 친구
	public void printAddrList(List<AddressVO> addList) {
		
		for(AddressVO advo : addList) {
			System.out.println(advo.toString());
		}
		
		int size = addList.size();
		for(int i = 0; i < size; i++) {
			System.out.println(addList.get(i));
		}
		
		for(int i = 0; i < size; i++) {
			AddressVO adVO = addList.get(i);
			System.out.println(adVO);
			
		}
		
	}


}
