package com.km.knowledgemessage.Model;

public class LabelBase {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label_base.id
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label_base.label_name
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    private String labelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label_base.user_id
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label_base.card_id
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    private Long cardId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label_base.id
     *
     * @return the value of label_base.id
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label_base.id
     *
     * @param id the value for label_base.id
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label_base.label_name
     *
     * @return the value of label_base.label_name
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label_base.label_name
     *
     * @param labelName the value for label_base.label_name
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label_base.user_id
     *
     * @return the value of label_base.user_id
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label_base.user_id
     *
     * @param userId the value for label_base.user_id
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label_base.card_id
     *
     * @return the value of label_base.card_id
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label_base.card_id
     *
     * @param cardId the value for label_base.card_id
     *
     * @mbg.generated Wed Jun 24 21:22:04 CST 2020
     */
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }
}