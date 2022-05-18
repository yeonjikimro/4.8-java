package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrService;

/*
 * service.AddrService 클래스에서 
 * printAddrList() method 를 선언
 * AddressVO List 를 매개변수로 받아 리스트를 출력
 * AddrEx04 에서 List<AddressVO> 선언 및 생성
 * 임의의 데이터를 3개 추가하고
 * printAddrList()에 전달하여 출력
 */
public class AddrEx05 {
	
	public static void main(String[] args) {
		/*
		 * List : interface, 데이터 그룹을 저장하기 위한 type
		 * 		Collections type
		 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터 type
		 * List를 선언할 때는 Generic type 을 지정한다
		 * 		1. List에 add 하늩 데이터를 제한하여
		 * 		잘못된 데이터가 add 되는 것을 방지하기 위함
		 * 		2. 메모리 낭비를 막고 성능상 이점이 있기 때문에
		 * 		아래 선언된 List 는 Generic type 이 AddressVO 이다
		 * 		여기 List 에 데이터를 추가하려면 먼저 AddressVO type 의
		 * 		vo 객체를 만들고, 데이터를 저장한 다음 add 한다.
		 */
		
		List<AddressVO> addList = new ArrayList<>();
		
		AddressVO advo = new AddressVO();
		
		advo.setName("홍길동");
		advo.setTel("010-222-2222");;
		advo.setAge(14);		
		addList.add(advo);
		
		/*
		 * VO 데이터를 List 에 add 하기 위해서는
		 * 항상 새로운 VO 를 생성하고 데이터를 setting 하고 add 해야 한다.
		 */
		advo = new AddressVO();
		advo.setName("성춘향");
		advo.setTel("010-222-2223");;
		advo.setAge(15);		
		addList.add(advo);
		
		advo = new AddressVO();
		advo.setName("이몽룡");
		advo.setTel("010-222-2224");;
		advo.setAge(20);		
		addList.add(advo);
		
		AddrService adService = new AddrService();
		// 3명의 데이터 출력하기
		adService.printAddrList(addList);
		System.out.println("=".repeat(100));
		advo = AddressVO.builder()
				.name("임꺽정")
				.tel("010-111-1234")
				.age(40)
				.build();
		
		// addList 리스트의 2번째 데이터를 임꺽정 데이터로 변경하고 싶다
		// addList.add(AddressVO) : 데이터를 추가하기
		/*
		 * AddrEx05에서 List<AddressVO>에 3명의 데이터가 저장되어 있다.
		 * 이 데이터를 나이순으로 오름차순 정렬하고
		 * printAddrList() method 에 전달하여 출력
		 */
		addList.set(2, advo);
		// 출력문
		adService.printAddrList(addList);
		
		for(int i = 0; i < addList.size(); i ++) {
			for(int j = i + 1 ; j < addList.size(); j++) {
				if(addList.get(i).getAge() > addList.get(j).getAge()) {
					
					AddressVO num = addList.get(i);
					addList.set(i, addList.get(j));
					addList.set(j, num);
					
				}
				
			}
		}
		System.out.println("=".repeat(100));
		System.out.println(addList);
	}
}
