package com.imooc.service;


import com.imooc.netty.ChatMsg;
import com.imooc.pojo.Users;
import com.imooc.pojo.vo.FriendRequestVO;
import com.imooc.pojo.vo.MyFriendsVO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
	public boolean queryUsernameIsExist(String name);


	public Users queryUserForLogin(String username, String pwd);

	Users saveUser(Users user);

	@Transactional(propagation = Propagation.REQUIRED)
	Users updateUserInfo(Users user);

	@Transactional(propagation = Propagation.SUPPORTS)
	Integer preconditionSearchFriends(String myUserId, String friendUsername);

	@Transactional(propagation = Propagation.SUPPORTS)
	Users queryUserInfoByUsername(String username);

	@Transactional(propagation = Propagation.REQUIRED)
	void sendFriendRequest(String myUserId, String friendUsername);

	@Transactional(propagation = Propagation.SUPPORTS)
	List<FriendRequestVO> queryFriendRequestList(String acceptUserId);

	@Transactional(propagation = Propagation.REQUIRED)
	void deleteFriendRequest(String sendUserId, String acceptUserId);

	@Transactional(propagation = Propagation.REQUIRED)
	void passFriendRequest(String sendUserId, String acceptUserId);

	@Transactional(propagation = Propagation.SUPPORTS)
	List<MyFriendsVO> queryMyFriends(String userId);

	String saveMsg(ChatMsg chatMsg);

	void updateMsgSigned(List<String> msgIdList);

	@Transactional(propagation = Propagation.SUPPORTS)
	List<com.imooc.pojo.ChatMsg> getUnReadMsgList(String acceptUserId);
}