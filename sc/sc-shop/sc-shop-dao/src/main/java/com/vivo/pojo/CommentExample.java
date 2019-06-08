package com.vivo.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArticleSourceIsNull() {
            addCriterion("article_source is null");
            return (Criteria) this;
        }

        public Criteria andArticleSourceIsNotNull() {
            addCriterion("article_source is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSourceEqualTo(String value) {
            addCriterion("article_source =", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceNotEqualTo(String value) {
            addCriterion("article_source <>", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceGreaterThan(String value) {
            addCriterion("article_source >", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceGreaterThanOrEqualTo(String value) {
            addCriterion("article_source >=", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceLessThan(String value) {
            addCriterion("article_source <", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceLessThanOrEqualTo(String value) {
            addCriterion("article_source <=", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceLike(String value) {
            addCriterion("article_source like", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceNotLike(String value) {
            addCriterion("article_source not like", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceIn(List<String> values) {
            addCriterion("article_source in", values, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceNotIn(List<String> values) {
            addCriterion("article_source not in", values, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceBetween(String value1, String value2) {
            addCriterion("article_source between", value1, value2, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceNotBetween(String value1, String value2) {
            addCriterion("article_source not between", value1, value2, "articleSource");
            return (Criteria) this;
        }

        public Criteria andUniqueIdIsNull() {
            addCriterion("unique_id is null");
            return (Criteria) this;
        }

        public Criteria andUniqueIdIsNotNull() {
            addCriterion("unique_id is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueIdEqualTo(String value) {
            addCriterion("unique_id =", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdNotEqualTo(String value) {
            addCriterion("unique_id <>", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdGreaterThan(String value) {
            addCriterion("unique_id >", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdGreaterThanOrEqualTo(String value) {
            addCriterion("unique_id >=", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdLessThan(String value) {
            addCriterion("unique_id <", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdLessThanOrEqualTo(String value) {
            addCriterion("unique_id <=", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdLike(String value) {
            addCriterion("unique_id like", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdNotLike(String value) {
            addCriterion("unique_id not like", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdIn(List<String> values) {
            addCriterion("unique_id in", values, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdNotIn(List<String> values) {
            addCriterion("unique_id not in", values, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdBetween(String value1, String value2) {
            addCriterion("unique_id between", value1, value2, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdNotBetween(String value1, String value2) {
            addCriterion("unique_id not between", value1, value2, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andCommentatorIsNull() {
            addCriterion("commentator is null");
            return (Criteria) this;
        }

        public Criteria andCommentatorIsNotNull() {
            addCriterion("commentator is not null");
            return (Criteria) this;
        }

        public Criteria andCommentatorEqualTo(String value) {
            addCriterion("commentator =", value, "commentator");
            return (Criteria) this;
        }

        public Criteria andCommentatorNotEqualTo(String value) {
            addCriterion("commentator <>", value, "commentator");
            return (Criteria) this;
        }

        public Criteria andCommentatorGreaterThan(String value) {
            addCriterion("commentator >", value, "commentator");
            return (Criteria) this;
        }

        public Criteria andCommentatorGreaterThanOrEqualTo(String value) {
            addCriterion("commentator >=", value, "commentator");
            return (Criteria) this;
        }

        public Criteria andCommentatorLessThan(String value) {
            addCriterion("commentator <", value, "commentator");
            return (Criteria) this;
        }

        public Criteria andCommentatorLessThanOrEqualTo(String value) {
            addCriterion("commentator <=", value, "commentator");
            return (Criteria) this;
        }

        public Criteria andCommentatorLike(String value) {
            addCriterion("commentator like", value, "commentator");
            return (Criteria) this;
        }

        public Criteria andCommentatorNotLike(String value) {
            addCriterion("commentator not like", value, "commentator");
            return (Criteria) this;
        }

        public Criteria andCommentatorIn(List<String> values) {
            addCriterion("commentator in", values, "commentator");
            return (Criteria) this;
        }

        public Criteria andCommentatorNotIn(List<String> values) {
            addCriterion("commentator not in", values, "commentator");
            return (Criteria) this;
        }

        public Criteria andCommentatorBetween(String value1, String value2) {
            addCriterion("commentator between", value1, value2, "commentator");
            return (Criteria) this;
        }

        public Criteria andCommentatorNotBetween(String value1, String value2) {
            addCriterion("commentator not between", value1, value2, "commentator");
            return (Criteria) this;
        }

        public Criteria andContentDateIsNull() {
            addCriterion("content_date is null");
            return (Criteria) this;
        }

        public Criteria andContentDateIsNotNull() {
            addCriterion("content_date is not null");
            return (Criteria) this;
        }

        public Criteria andContentDateEqualTo(String value) {
            addCriterion("content_date =", value, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentDateNotEqualTo(String value) {
            addCriterion("content_date <>", value, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentDateGreaterThan(String value) {
            addCriterion("content_date >", value, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentDateGreaterThanOrEqualTo(String value) {
            addCriterion("content_date >=", value, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentDateLessThan(String value) {
            addCriterion("content_date <", value, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentDateLessThanOrEqualTo(String value) {
            addCriterion("content_date <=", value, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentDateLike(String value) {
            addCriterion("content_date like", value, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentDateNotLike(String value) {
            addCriterion("content_date not like", value, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentDateIn(List<String> values) {
            addCriterion("content_date in", values, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentDateNotIn(List<String> values) {
            addCriterion("content_date not in", values, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentDateBetween(String value1, String value2) {
            addCriterion("content_date between", value1, value2, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentDateNotBetween(String value1, String value2) {
            addCriterion("content_date not between", value1, value2, "contentDate");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andProcessorIsNull() {
            addCriterion("processor is null");
            return (Criteria) this;
        }

        public Criteria andProcessorIsNotNull() {
            addCriterion("processor is not null");
            return (Criteria) this;
        }

        public Criteria andProcessorEqualTo(String value) {
            addCriterion("processor =", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorNotEqualTo(String value) {
            addCriterion("processor <>", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorGreaterThan(String value) {
            addCriterion("processor >", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorGreaterThanOrEqualTo(String value) {
            addCriterion("processor >=", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorLessThan(String value) {
            addCriterion("processor <", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorLessThanOrEqualTo(String value) {
            addCriterion("processor <=", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorLike(String value) {
            addCriterion("processor like", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorNotLike(String value) {
            addCriterion("processor not like", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorIn(List<String> values) {
            addCriterion("processor in", values, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorNotIn(List<String> values) {
            addCriterion("processor not in", values, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorBetween(String value1, String value2) {
            addCriterion("processor between", value1, value2, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorNotBetween(String value1, String value2) {
            addCriterion("processor not between", value1, value2, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessDateIsNull() {
            addCriterion("process_date is null");
            return (Criteria) this;
        }

        public Criteria andProcessDateIsNotNull() {
            addCriterion("process_date is not null");
            return (Criteria) this;
        }

        public Criteria andProcessDateEqualTo(String value) {
            addCriterion("process_date =", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotEqualTo(String value) {
            addCriterion("process_date <>", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateGreaterThan(String value) {
            addCriterion("process_date >", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateGreaterThanOrEqualTo(String value) {
            addCriterion("process_date >=", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateLessThan(String value) {
            addCriterion("process_date <", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateLessThanOrEqualTo(String value) {
            addCriterion("process_date <=", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateLike(String value) {
            addCriterion("process_date like", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotLike(String value) {
            addCriterion("process_date not like", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateIn(List<String> values) {
            addCriterion("process_date in", values, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotIn(List<String> values) {
            addCriterion("process_date not in", values, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateBetween(String value1, String value2) {
            addCriterion("process_date between", value1, value2, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotBetween(String value1, String value2) {
            addCriterion("process_date not between", value1, value2, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessResIsNull() {
            addCriterion("process_res is null");
            return (Criteria) this;
        }

        public Criteria andProcessResIsNotNull() {
            addCriterion("process_res is not null");
            return (Criteria) this;
        }

        public Criteria andProcessResEqualTo(String value) {
            addCriterion("process_res =", value, "processRes");
            return (Criteria) this;
        }

        public Criteria andProcessResNotEqualTo(String value) {
            addCriterion("process_res <>", value, "processRes");
            return (Criteria) this;
        }

        public Criteria andProcessResGreaterThan(String value) {
            addCriterion("process_res >", value, "processRes");
            return (Criteria) this;
        }

        public Criteria andProcessResGreaterThanOrEqualTo(String value) {
            addCriterion("process_res >=", value, "processRes");
            return (Criteria) this;
        }

        public Criteria andProcessResLessThan(String value) {
            addCriterion("process_res <", value, "processRes");
            return (Criteria) this;
        }

        public Criteria andProcessResLessThanOrEqualTo(String value) {
            addCriterion("process_res <=", value, "processRes");
            return (Criteria) this;
        }

        public Criteria andProcessResLike(String value) {
            addCriterion("process_res like", value, "processRes");
            return (Criteria) this;
        }

        public Criteria andProcessResNotLike(String value) {
            addCriterion("process_res not like", value, "processRes");
            return (Criteria) this;
        }

        public Criteria andProcessResIn(List<String> values) {
            addCriterion("process_res in", values, "processRes");
            return (Criteria) this;
        }

        public Criteria andProcessResNotIn(List<String> values) {
            addCriterion("process_res not in", values, "processRes");
            return (Criteria) this;
        }

        public Criteria andProcessResBetween(String value1, String value2) {
            addCriterion("process_res between", value1, value2, "processRes");
            return (Criteria) this;
        }

        public Criteria andProcessResNotBetween(String value1, String value2) {
            addCriterion("process_res not between", value1, value2, "processRes");
            return (Criteria) this;
        }

        public Criteria andRejectResIsNull() {
            addCriterion("reject_res is null");
            return (Criteria) this;
        }

        public Criteria andRejectResIsNotNull() {
            addCriterion("reject_res is not null");
            return (Criteria) this;
        }

        public Criteria andRejectResEqualTo(String value) {
            addCriterion("reject_res =", value, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectResNotEqualTo(String value) {
            addCriterion("reject_res <>", value, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectResGreaterThan(String value) {
            addCriterion("reject_res >", value, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectResGreaterThanOrEqualTo(String value) {
            addCriterion("reject_res >=", value, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectResLessThan(String value) {
            addCriterion("reject_res <", value, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectResLessThanOrEqualTo(String value) {
            addCriterion("reject_res <=", value, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectResLike(String value) {
            addCriterion("reject_res like", value, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectResNotLike(String value) {
            addCriterion("reject_res not like", value, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectResIn(List<String> values) {
            addCriterion("reject_res in", values, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectResNotIn(List<String> values) {
            addCriterion("reject_res not in", values, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectResBetween(String value1, String value2) {
            addCriterion("reject_res between", value1, value2, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectResNotBetween(String value1, String value2) {
            addCriterion("reject_res not between", value1, value2, "rejectRes");
            return (Criteria) this;
        }

        public Criteria andRejectDateIsNull() {
            addCriterion("reject_date is null");
            return (Criteria) this;
        }

        public Criteria andRejectDateIsNotNull() {
            addCriterion("reject_date is not null");
            return (Criteria) this;
        }

        public Criteria andRejectDateEqualTo(String value) {
            addCriterion("reject_date =", value, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andRejectDateNotEqualTo(String value) {
            addCriterion("reject_date <>", value, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andRejectDateGreaterThan(String value) {
            addCriterion("reject_date >", value, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andRejectDateGreaterThanOrEqualTo(String value) {
            addCriterion("reject_date >=", value, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andRejectDateLessThan(String value) {
            addCriterion("reject_date <", value, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andRejectDateLessThanOrEqualTo(String value) {
            addCriterion("reject_date <=", value, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andRejectDateLike(String value) {
            addCriterion("reject_date like", value, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andRejectDateNotLike(String value) {
            addCriterion("reject_date not like", value, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andRejectDateIn(List<String> values) {
            addCriterion("reject_date in", values, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andRejectDateNotIn(List<String> values) {
            addCriterion("reject_date not in", values, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andRejectDateBetween(String value1, String value2) {
            addCriterion("reject_date between", value1, value2, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andRejectDateNotBetween(String value1, String value2) {
            addCriterion("reject_date not between", value1, value2, "rejectDate");
            return (Criteria) this;
        }

        public Criteria andFinalResIsNull() {
            addCriterion("final_res is null");
            return (Criteria) this;
        }

        public Criteria andFinalResIsNotNull() {
            addCriterion("final_res is not null");
            return (Criteria) this;
        }

        public Criteria andFinalResEqualTo(String value) {
            addCriterion("final_res =", value, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalResNotEqualTo(String value) {
            addCriterion("final_res <>", value, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalResGreaterThan(String value) {
            addCriterion("final_res >", value, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalResGreaterThanOrEqualTo(String value) {
            addCriterion("final_res >=", value, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalResLessThan(String value) {
            addCriterion("final_res <", value, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalResLessThanOrEqualTo(String value) {
            addCriterion("final_res <=", value, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalResLike(String value) {
            addCriterion("final_res like", value, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalResNotLike(String value) {
            addCriterion("final_res not like", value, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalResIn(List<String> values) {
            addCriterion("final_res in", values, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalResNotIn(List<String> values) {
            addCriterion("final_res not in", values, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalResBetween(String value1, String value2) {
            addCriterion("final_res between", value1, value2, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalResNotBetween(String value1, String value2) {
            addCriterion("final_res not between", value1, value2, "finalRes");
            return (Criteria) this;
        }

        public Criteria andFinalDateIsNull() {
            addCriterion("final_date is null");
            return (Criteria) this;
        }

        public Criteria andFinalDateIsNotNull() {
            addCriterion("final_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDateEqualTo(String value) {
            addCriterion("final_date =", value, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalDateNotEqualTo(String value) {
            addCriterion("final_date <>", value, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalDateGreaterThan(String value) {
            addCriterion("final_date >", value, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalDateGreaterThanOrEqualTo(String value) {
            addCriterion("final_date >=", value, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalDateLessThan(String value) {
            addCriterion("final_date <", value, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalDateLessThanOrEqualTo(String value) {
            addCriterion("final_date <=", value, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalDateLike(String value) {
            addCriterion("final_date like", value, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalDateNotLike(String value) {
            addCriterion("final_date not like", value, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalDateIn(List<String> values) {
            addCriterion("final_date in", values, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalDateNotIn(List<String> values) {
            addCriterion("final_date not in", values, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalDateBetween(String value1, String value2) {
            addCriterion("final_date between", value1, value2, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalDateNotBetween(String value1, String value2) {
            addCriterion("final_date not between", value1, value2, "finalDate");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorIsNull() {
            addCriterion("final_processor is null");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorIsNotNull() {
            addCriterion("final_processor is not null");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorEqualTo(String value) {
            addCriterion("final_processor =", value, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorNotEqualTo(String value) {
            addCriterion("final_processor <>", value, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorGreaterThan(String value) {
            addCriterion("final_processor >", value, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorGreaterThanOrEqualTo(String value) {
            addCriterion("final_processor >=", value, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorLessThan(String value) {
            addCriterion("final_processor <", value, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorLessThanOrEqualTo(String value) {
            addCriterion("final_processor <=", value, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorLike(String value) {
            addCriterion("final_processor like", value, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorNotLike(String value) {
            addCriterion("final_processor not like", value, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorIn(List<String> values) {
            addCriterion("final_processor in", values, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorNotIn(List<String> values) {
            addCriterion("final_processor not in", values, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorBetween(String value1, String value2) {
            addCriterion("final_processor between", value1, value2, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andFinalProcessorNotBetween(String value1, String value2) {
            addCriterion("final_processor not between", value1, value2, "finalProcessor");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNull() {
            addCriterion("process_status is null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNotNull() {
            addCriterion("process_status is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusEqualTo(String value) {
            addCriterion("process_status =", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotEqualTo(String value) {
            addCriterion("process_status <>", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThan(String value) {
            addCriterion("process_status >", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThanOrEqualTo(String value) {
            addCriterion("process_status >=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThan(String value) {
            addCriterion("process_status <", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThanOrEqualTo(String value) {
            addCriterion("process_status <=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLike(String value) {
            addCriterion("process_status like", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotLike(String value) {
            addCriterion("process_status not like", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIn(List<String> values) {
            addCriterion("process_status in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotIn(List<String> values) {
            addCriterion("process_status not in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusBetween(String value1, String value2) {
            addCriterion("process_status between", value1, value2, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotBetween(String value1, String value2) {
            addCriterion("process_status not between", value1, value2, "processStatus");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
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