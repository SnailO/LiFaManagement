package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.ConRecordMapper;
import cn.edu.guet.mapper.VipMapper;
import cn.edu.guet.model.ConRecord;
import cn.edu.guet.service.IConRecordService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

public class ConRecordServiceImpl implements IConRecordService {

    @Autowired
    ConRecordMapper conRecordMapper;

    @Override
    public void insertRecord(ConRecord conRecord) throws Exception {

        conRecordMapper.insertRecord(conRecord);
    }
}
