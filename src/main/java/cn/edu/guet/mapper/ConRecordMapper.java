package cn.edu.guet.mapper;

import cn.edu.guet.model.ConRecord;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;

public interface ConRecordMapper {
    void insertRecord(ConRecord conRecord) throws Exception;
}
