package com.km.knowledgemessage.Mapper;

import com.km.knowledgemessage.Model.CardNum;
import com.km.knowledgemessage.Model.CardNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CardNumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    long countByExample(CardNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int deleteByExample(CardNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int deleteByPrimaryKey(Long cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int insert(CardNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int insertSelective(CardNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    List<CardNum> selectByExampleWithRowbounds(CardNumExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    List<CardNum> selectByExample(CardNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    CardNum selectByPrimaryKey(Long cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int updateByExampleSelective(@Param("record") CardNum record, @Param("example") CardNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int updateByExample(@Param("record") CardNum record, @Param("example") CardNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int updateByPrimaryKeySelective(CardNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_num
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int updateByPrimaryKey(CardNum record);
}