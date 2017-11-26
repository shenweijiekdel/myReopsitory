package cn.tedu.examsystem.mapper;

import cn.tedu.examsystem.pojo.Answer;
import cn.tedu.examsystem.pojo.Option;

import java.util.List;

public interface OptionMapper {
    void addOption(List<Option> options);
    void deleteOptionByPid(List<Option> option);
}
