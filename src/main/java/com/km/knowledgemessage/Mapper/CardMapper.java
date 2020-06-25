package com.km.knowledgemessage.Mapper;

import com.km.knowledgemessage.Model.Card;
import com.km.knowledgemessage.Model.CardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    long countByExample(CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int deleteByExample(CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int insert(Card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int insertSelective(Card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    List<Card> selectByExampleWithBLOBsWithRowbounds(CardExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    List<Card> selectByExampleWithBLOBs(CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    List<Card> selectByExampleWithRowbounds(CardExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    List<Card> selectByExample(CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    Card selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int updateByExampleSelective(@Param("record") Card record, @Param("example") CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") Card record, @Param("example") CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int updateByExample(@Param("record") Card record, @Param("example") CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int updateByPrimaryKeySelective(Card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(Card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Thu Jun 25 08:27:26 CST 2020
     */
    int updateByPrimaryKey(Card record);
}