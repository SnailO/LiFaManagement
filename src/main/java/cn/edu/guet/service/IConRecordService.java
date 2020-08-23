package cn.edu.guet.service;

import cn.edu.guet.model.ConRecord;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;

public interface IConRecordService {
    void insertRecord(ConRecord conRecord) throws Exception;
}
