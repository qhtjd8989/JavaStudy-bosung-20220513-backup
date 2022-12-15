package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	
	private UserService userService; // 클래스안에서 선언되는 변수는 무조건 private으로 한다
	private User[] users;
	
	public UserManagementController() {
		userService  = new UserService();
		users = new User[2];
	}
	
	public void createUser() {
		int indexResult = findEmptyInUsers();
		if(indexResult != -1) {
			users[indexResult] = userService.insertUser();
			
			System.out.println("[새로 추가된 사용자]");
			System.out.println(users[indexResult].toString());
		}else {
			System.out.println("더 이상 사용자를 추가할 수 없습니다.");
		}
		
//		User user = userService.insertUser();
//		
//		System.out.println("[새로 추가된 사용자]");
//		System.out.println(user.toString());
	}
	
	private int findEmptyInUsers() {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) { // 배열에 빈곳이 있는지 확인
				return i;
			}
		}
		return -1;
	}
	
	public void updateUser() {
		
	}
	
}
