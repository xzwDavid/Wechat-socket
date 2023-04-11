package com.imooc.mapper;

import com.imooc.pojo.ChatMsg;
import com.imooc.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChatMsgMapper extends MyMapper<ChatMsg> {
}