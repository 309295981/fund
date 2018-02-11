package com.fund.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundInfoSearch {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FundInfoSearch() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andWalletAddressIsNull() {
            addCriterion("wallet_address is null");
            return (Criteria) this;
        }

        public Criteria andWalletAddressIsNotNull() {
            addCriterion("wallet_address is not null");
            return (Criteria) this;
        }

        public Criteria andWalletAddressEqualTo(Long value) {
            addCriterion("wallet_address =", value, "walletAddress");
            return (Criteria) this;
        }

        public Criteria andWalletAddressNotEqualTo(Long value) {
            addCriterion("wallet_address <>", value, "walletAddress");
            return (Criteria) this;
        }

        public Criteria andWalletAddressGreaterThan(Long value) {
            addCriterion("wallet_address >", value, "walletAddress");
            return (Criteria) this;
        }

        public Criteria andWalletAddressGreaterThanOrEqualTo(Long value) {
            addCriterion("wallet_address >=", value, "walletAddress");
            return (Criteria) this;
        }

        public Criteria andWalletAddressLessThan(Long value) {
            addCriterion("wallet_address <", value, "walletAddress");
            return (Criteria) this;
        }

        public Criteria andWalletAddressLessThanOrEqualTo(Long value) {
            addCriterion("wallet_address <=", value, "walletAddress");
            return (Criteria) this;
        }

        public Criteria andWalletAddressIn(List<Long> values) {
            addCriterion("wallet_address in", values, "walletAddress");
            return (Criteria) this;
        }

        public Criteria andWalletAddressNotIn(List<Long> values) {
            addCriterion("wallet_address not in", values, "walletAddress");
            return (Criteria) this;
        }

        public Criteria andWalletAddressBetween(Long value1, Long value2) {
            addCriterion("wallet_address between", value1, value2, "walletAddress");
            return (Criteria) this;
        }

        public Criteria andWalletAddressNotBetween(Long value1, Long value2) {
            addCriterion("wallet_address not between", value1, value2, "walletAddress");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameIsNull() {
            addCriterion("fundraising_token_name is null");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameIsNotNull() {
            addCriterion("fundraising_token_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameEqualTo(String value) {
            addCriterion("fundraising_token_name =", value, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameNotEqualTo(String value) {
            addCriterion("fundraising_token_name <>", value, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameGreaterThan(String value) {
            addCriterion("fundraising_token_name >", value, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameGreaterThanOrEqualTo(String value) {
            addCriterion("fundraising_token_name >=", value, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameLessThan(String value) {
            addCriterion("fundraising_token_name <", value, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameLessThanOrEqualTo(String value) {
            addCriterion("fundraising_token_name <=", value, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameLike(String value) {
            addCriterion("fundraising_token_name like", value, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameNotLike(String value) {
            addCriterion("fundraising_token_name not like", value, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameIn(List<String> values) {
            addCriterion("fundraising_token_name in", values, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameNotIn(List<String> values) {
            addCriterion("fundraising_token_name not in", values, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameBetween(String value1, String value2) {
            addCriterion("fundraising_token_name between", value1, value2, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameNotBetween(String value1, String value2) {
            addCriterion("fundraising_token_name not between", value1, value2, "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressIsNull() {
            addCriterion("fundraising_token_address is null");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressIsNotNull() {
            addCriterion("fundraising_token_address is not null");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressEqualTo(String value) {
            addCriterion("fundraising_token_address =", value, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressNotEqualTo(String value) {
            addCriterion("fundraising_token_address <>", value, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressGreaterThan(String value) {
            addCriterion("fundraising_token_address >", value, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressGreaterThanOrEqualTo(String value) {
            addCriterion("fundraising_token_address >=", value, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressLessThan(String value) {
            addCriterion("fundraising_token_address <", value, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressLessThanOrEqualTo(String value) {
            addCriterion("fundraising_token_address <=", value, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressLike(String value) {
            addCriterion("fundraising_token_address like", value, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressNotLike(String value) {
            addCriterion("fundraising_token_address not like", value, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressIn(List<String> values) {
            addCriterion("fundraising_token_address in", values, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressNotIn(List<String> values) {
            addCriterion("fundraising_token_address not in", values, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressBetween(String value1, String value2) {
            addCriterion("fundraising_token_address between", value1, value2, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressNotBetween(String value1, String value2) {
            addCriterion("fundraising_token_address not between", value1, value2, "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountIsNull() {
            addCriterion("fundraising_plan_amount is null");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountIsNotNull() {
            addCriterion("fundraising_plan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountEqualTo(Long value) {
            addCriterion("fundraising_plan_amount =", value, "fundraisingPlanAmount");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountNotEqualTo(Long value) {
            addCriterion("fundraising_plan_amount <>", value, "fundraisingPlanAmount");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountGreaterThan(Long value) {
            addCriterion("fundraising_plan_amount >", value, "fundraisingPlanAmount");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("fundraising_plan_amount >=", value, "fundraisingPlanAmount");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountLessThan(Long value) {
            addCriterion("fundraising_plan_amount <", value, "fundraisingPlanAmount");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountLessThanOrEqualTo(Long value) {
            addCriterion("fundraising_plan_amount <=", value, "fundraisingPlanAmount");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountIn(List<Long> values) {
            addCriterion("fundraising_plan_amount in", values, "fundraisingPlanAmount");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountNotIn(List<Long> values) {
            addCriterion("fundraising_plan_amount not in", values, "fundraisingPlanAmount");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountBetween(Long value1, Long value2) {
            addCriterion("fundraising_plan_amount between", value1, value2, "fundraisingPlanAmount");
            return (Criteria) this;
        }

        public Criteria andFundraisingPlanAmountNotBetween(Long value1, Long value2) {
            addCriterion("fundraising_plan_amount not between", value1, value2, "fundraisingPlanAmount");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartIsNull() {
            addCriterion("fundraising_start is null");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartIsNotNull() {
            addCriterion("fundraising_start is not null");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartEqualTo(Date value) {
            addCriterion("fundraising_start =", value, "fundraisingStart");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartNotEqualTo(Date value) {
            addCriterion("fundraising_start <>", value, "fundraisingStart");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartGreaterThan(Date value) {
            addCriterion("fundraising_start >", value, "fundraisingStart");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartGreaterThanOrEqualTo(Date value) {
            addCriterion("fundraising_start >=", value, "fundraisingStart");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartLessThan(Date value) {
            addCriterion("fundraising_start <", value, "fundraisingStart");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartLessThanOrEqualTo(Date value) {
            addCriterion("fundraising_start <=", value, "fundraisingStart");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartIn(List<Date> values) {
            addCriterion("fundraising_start in", values, "fundraisingStart");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartNotIn(List<Date> values) {
            addCriterion("fundraising_start not in", values, "fundraisingStart");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartBetween(Date value1, Date value2) {
            addCriterion("fundraising_start between", value1, value2, "fundraisingStart");
            return (Criteria) this;
        }

        public Criteria andFundraisingStartNotBetween(Date value1, Date value2) {
            addCriterion("fundraising_start not between", value1, value2, "fundraisingStart");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndIsNull() {
            addCriterion("fundraising_end is null");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndIsNotNull() {
            addCriterion("fundraising_end is not null");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndEqualTo(Date value) {
            addCriterion("fundraising_end =", value, "fundraisingEnd");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndNotEqualTo(Date value) {
            addCriterion("fundraising_end <>", value, "fundraisingEnd");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndGreaterThan(Date value) {
            addCriterion("fundraising_end >", value, "fundraisingEnd");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndGreaterThanOrEqualTo(Date value) {
            addCriterion("fundraising_end >=", value, "fundraisingEnd");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndLessThan(Date value) {
            addCriterion("fundraising_end <", value, "fundraisingEnd");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndLessThanOrEqualTo(Date value) {
            addCriterion("fundraising_end <=", value, "fundraisingEnd");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndIn(List<Date> values) {
            addCriterion("fundraising_end in", values, "fundraisingEnd");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndNotIn(List<Date> values) {
            addCriterion("fundraising_end not in", values, "fundraisingEnd");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndBetween(Date value1, Date value2) {
            addCriterion("fundraising_end between", value1, value2, "fundraisingEnd");
            return (Criteria) this;
        }

        public Criteria andFundraisingEndNotBetween(Date value1, Date value2) {
            addCriterion("fundraising_end not between", value1, value2, "fundraisingEnd");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureIsNull() {
            addCriterion("fundraising_signature is null");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureIsNotNull() {
            addCriterion("fundraising_signature is not null");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureEqualTo(String value) {
            addCriterion("fundraising_signature =", value, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureNotEqualTo(String value) {
            addCriterion("fundraising_signature <>", value, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureGreaterThan(String value) {
            addCriterion("fundraising_signature >", value, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("fundraising_signature >=", value, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureLessThan(String value) {
            addCriterion("fundraising_signature <", value, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureLessThanOrEqualTo(String value) {
            addCriterion("fundraising_signature <=", value, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureLike(String value) {
            addCriterion("fundraising_signature like", value, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureNotLike(String value) {
            addCriterion("fundraising_signature not like", value, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureIn(List<String> values) {
            addCriterion("fundraising_signature in", values, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureNotIn(List<String> values) {
            addCriterion("fundraising_signature not in", values, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureBetween(String value1, String value2) {
            addCriterion("fundraising_signature between", value1, value2, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureNotBetween(String value1, String value2) {
            addCriterion("fundraising_signature not between", value1, value2, "fundraisingSignature");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusIsNull() {
            addCriterion("fundraising_status is null");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusIsNotNull() {
            addCriterion("fundraising_status is not null");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusEqualTo(Byte value) {
            addCriterion("fundraising_status =", value, "fundraisingStatus");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusNotEqualTo(Byte value) {
            addCriterion("fundraising_status <>", value, "fundraisingStatus");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusGreaterThan(Byte value) {
            addCriterion("fundraising_status >", value, "fundraisingStatus");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("fundraising_status >=", value, "fundraisingStatus");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusLessThan(Byte value) {
            addCriterion("fundraising_status <", value, "fundraisingStatus");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusLessThanOrEqualTo(Byte value) {
            addCriterion("fundraising_status <=", value, "fundraisingStatus");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusIn(List<Byte> values) {
            addCriterion("fundraising_status in", values, "fundraisingStatus");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusNotIn(List<Byte> values) {
            addCriterion("fundraising_status not in", values, "fundraisingStatus");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusBetween(Byte value1, Byte value2) {
            addCriterion("fundraising_status between", value1, value2, "fundraisingStatus");
            return (Criteria) this;
        }

        public Criteria andFundraisingStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("fundraising_status not between", value1, value2, "fundraisingStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andSignatureLikeInsensitive(String value) {
            addCriterion("upper(signature) like", value.toUpperCase(), "signature");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenNameLikeInsensitive(String value) {
            addCriterion("upper(fundraising_token_name) like", value.toUpperCase(), "fundraisingTokenName");
            return (Criteria) this;
        }

        public Criteria andFundraisingTokenAddressLikeInsensitive(String value) {
            addCriterion("upper(fundraising_token_address) like", value.toUpperCase(), "fundraisingTokenAddress");
            return (Criteria) this;
        }

        public Criteria andFundraisingSignatureLikeInsensitive(String value) {
            addCriterion("upper(fundraising_signature) like", value.toUpperCase(), "fundraisingSignature");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}