package com.vivo.pojo;

import java.util.ArrayList;
import java.util.List;

public class JobCnvdUrlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobCnvdUrlExample() {
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

        public Criteria andCnvdUrlIsNull() {
            addCriterion("cnvd_url is null");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlIsNotNull() {
            addCriterion("cnvd_url is not null");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlEqualTo(String value) {
            addCriterion("cnvd_url =", value, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlNotEqualTo(String value) {
            addCriterion("cnvd_url <>", value, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlGreaterThan(String value) {
            addCriterion("cnvd_url >", value, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cnvd_url >=", value, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlLessThan(String value) {
            addCriterion("cnvd_url <", value, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlLessThanOrEqualTo(String value) {
            addCriterion("cnvd_url <=", value, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlLike(String value) {
            addCriterion("cnvd_url like", value, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlNotLike(String value) {
            addCriterion("cnvd_url not like", value, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlIn(List<String> values) {
            addCriterion("cnvd_url in", values, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlNotIn(List<String> values) {
            addCriterion("cnvd_url not in", values, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlBetween(String value1, String value2) {
            addCriterion("cnvd_url between", value1, value2, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andCnvdUrlNotBetween(String value1, String value2) {
            addCriterion("cnvd_url not between", value1, value2, "cnvdUrl");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIsNull() {
            addCriterion("url_type is null");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIsNotNull() {
            addCriterion("url_type is not null");
            return (Criteria) this;
        }

        public Criteria andUrlTypeEqualTo(String value) {
            addCriterion("url_type =", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNotEqualTo(String value) {
            addCriterion("url_type <>", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeGreaterThan(String value) {
            addCriterion("url_type >", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("url_type >=", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeLessThan(String value) {
            addCriterion("url_type <", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeLessThanOrEqualTo(String value) {
            addCriterion("url_type <=", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeLike(String value) {
            addCriterion("url_type like", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNotLike(String value) {
            addCriterion("url_type not like", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIn(List<String> values) {
            addCriterion("url_type in", values, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNotIn(List<String> values) {
            addCriterion("url_type not in", values, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeBetween(String value1, String value2) {
            addCriterion("url_type between", value1, value2, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNotBetween(String value1, String value2) {
            addCriterion("url_type not between", value1, value2, "urlType");
            return (Criteria) this;
        }

        public Criteria andDeFlagIsNull() {
            addCriterion("de_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeFlagIsNotNull() {
            addCriterion("de_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeFlagEqualTo(String value) {
            addCriterion("de_flag =", value, "deFlag");
            return (Criteria) this;
        }

        public Criteria andDeFlagNotEqualTo(String value) {
            addCriterion("de_flag <>", value, "deFlag");
            return (Criteria) this;
        }

        public Criteria andDeFlagGreaterThan(String value) {
            addCriterion("de_flag >", value, "deFlag");
            return (Criteria) this;
        }

        public Criteria andDeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("de_flag >=", value, "deFlag");
            return (Criteria) this;
        }

        public Criteria andDeFlagLessThan(String value) {
            addCriterion("de_flag <", value, "deFlag");
            return (Criteria) this;
        }

        public Criteria andDeFlagLessThanOrEqualTo(String value) {
            addCriterion("de_flag <=", value, "deFlag");
            return (Criteria) this;
        }

        public Criteria andDeFlagLike(String value) {
            addCriterion("de_flag like", value, "deFlag");
            return (Criteria) this;
        }

        public Criteria andDeFlagNotLike(String value) {
            addCriterion("de_flag not like", value, "deFlag");
            return (Criteria) this;
        }

        public Criteria andDeFlagIn(List<String> values) {
            addCriterion("de_flag in", values, "deFlag");
            return (Criteria) this;
        }

        public Criteria andDeFlagNotIn(List<String> values) {
            addCriterion("de_flag not in", values, "deFlag");
            return (Criteria) this;
        }

        public Criteria andDeFlagBetween(String value1, String value2) {
            addCriterion("de_flag between", value1, value2, "deFlag");
            return (Criteria) this;
        }

        public Criteria andDeFlagNotBetween(String value1, String value2) {
            addCriterion("de_flag not between", value1, value2, "deFlag");
            return (Criteria) this;
        }

        public Criteria andFocusNumIsNull() {
            addCriterion("focus_num is null");
            return (Criteria) this;
        }

        public Criteria andFocusNumIsNotNull() {
            addCriterion("focus_num is not null");
            return (Criteria) this;
        }

        public Criteria andFocusNumEqualTo(String value) {
            addCriterion("focus_num =", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumNotEqualTo(String value) {
            addCriterion("focus_num <>", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumGreaterThan(String value) {
            addCriterion("focus_num >", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumGreaterThanOrEqualTo(String value) {
            addCriterion("focus_num >=", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumLessThan(String value) {
            addCriterion("focus_num <", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumLessThanOrEqualTo(String value) {
            addCriterion("focus_num <=", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumLike(String value) {
            addCriterion("focus_num like", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumNotLike(String value) {
            addCriterion("focus_num not like", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumIn(List<String> values) {
            addCriterion("focus_num in", values, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumNotIn(List<String> values) {
            addCriterion("focus_num not in", values, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumBetween(String value1, String value2) {
            addCriterion("focus_num between", value1, value2, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumNotBetween(String value1, String value2) {
            addCriterion("focus_num not between", value1, value2, "focusNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumIsNull() {
            addCriterion("commont_num is null");
            return (Criteria) this;
        }

        public Criteria andCommontNumIsNotNull() {
            addCriterion("commont_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommontNumEqualTo(String value) {
            addCriterion("commont_num =", value, "commontNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumNotEqualTo(String value) {
            addCriterion("commont_num <>", value, "commontNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumGreaterThan(String value) {
            addCriterion("commont_num >", value, "commontNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumGreaterThanOrEqualTo(String value) {
            addCriterion("commont_num >=", value, "commontNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumLessThan(String value) {
            addCriterion("commont_num <", value, "commontNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumLessThanOrEqualTo(String value) {
            addCriterion("commont_num <=", value, "commontNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumLike(String value) {
            addCriterion("commont_num like", value, "commontNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumNotLike(String value) {
            addCriterion("commont_num not like", value, "commontNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumIn(List<String> values) {
            addCriterion("commont_num in", values, "commontNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumNotIn(List<String> values) {
            addCriterion("commont_num not in", values, "commontNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumBetween(String value1, String value2) {
            addCriterion("commont_num between", value1, value2, "commontNum");
            return (Criteria) this;
        }

        public Criteria andCommontNumNotBetween(String value1, String value2) {
            addCriterion("commont_num not between", value1, value2, "commontNum");
            return (Criteria) this;
        }

        public Criteria andUrlHitsIsNull() {
            addCriterion("url_hits is null");
            return (Criteria) this;
        }

        public Criteria andUrlHitsIsNotNull() {
            addCriterion("url_hits is not null");
            return (Criteria) this;
        }

        public Criteria andUrlHitsEqualTo(String value) {
            addCriterion("url_hits =", value, "urlHits");
            return (Criteria) this;
        }

        public Criteria andUrlHitsNotEqualTo(String value) {
            addCriterion("url_hits <>", value, "urlHits");
            return (Criteria) this;
        }

        public Criteria andUrlHitsGreaterThan(String value) {
            addCriterion("url_hits >", value, "urlHits");
            return (Criteria) this;
        }

        public Criteria andUrlHitsGreaterThanOrEqualTo(String value) {
            addCriterion("url_hits >=", value, "urlHits");
            return (Criteria) this;
        }

        public Criteria andUrlHitsLessThan(String value) {
            addCriterion("url_hits <", value, "urlHits");
            return (Criteria) this;
        }

        public Criteria andUrlHitsLessThanOrEqualTo(String value) {
            addCriterion("url_hits <=", value, "urlHits");
            return (Criteria) this;
        }

        public Criteria andUrlHitsLike(String value) {
            addCriterion("url_hits like", value, "urlHits");
            return (Criteria) this;
        }

        public Criteria andUrlHitsNotLike(String value) {
            addCriterion("url_hits not like", value, "urlHits");
            return (Criteria) this;
        }

        public Criteria andUrlHitsIn(List<String> values) {
            addCriterion("url_hits in", values, "urlHits");
            return (Criteria) this;
        }

        public Criteria andUrlHitsNotIn(List<String> values) {
            addCriterion("url_hits not in", values, "urlHits");
            return (Criteria) this;
        }

        public Criteria andUrlHitsBetween(String value1, String value2) {
            addCriterion("url_hits between", value1, value2, "urlHits");
            return (Criteria) this;
        }

        public Criteria andUrlHitsNotBetween(String value1, String value2) {
            addCriterion("url_hits not between", value1, value2, "urlHits");
            return (Criteria) this;
        }

        public Criteria andBugLevelIsNull() {
            addCriterion("bug_level is null");
            return (Criteria) this;
        }

        public Criteria andBugLevelIsNotNull() {
            addCriterion("bug_level is not null");
            return (Criteria) this;
        }

        public Criteria andBugLevelEqualTo(String value) {
            addCriterion("bug_level =", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelNotEqualTo(String value) {
            addCriterion("bug_level <>", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelGreaterThan(String value) {
            addCriterion("bug_level >", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelGreaterThanOrEqualTo(String value) {
            addCriterion("bug_level >=", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelLessThan(String value) {
            addCriterion("bug_level <", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelLessThanOrEqualTo(String value) {
            addCriterion("bug_level <=", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelLike(String value) {
            addCriterion("bug_level like", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelNotLike(String value) {
            addCriterion("bug_level not like", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelIn(List<String> values) {
            addCriterion("bug_level in", values, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelNotIn(List<String> values) {
            addCriterion("bug_level not in", values, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelBetween(String value1, String value2) {
            addCriterion("bug_level between", value1, value2, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelNotBetween(String value1, String value2) {
            addCriterion("bug_level not between", value1, value2, "bugLevel");
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

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(String value) {
            addCriterion("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(String value) {
            addCriterion("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(String value) {
            addCriterion("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(String value) {
            addCriterion("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(String value) {
            addCriterion("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(String value) {
            addCriterion("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLike(String value) {
            addCriterion("publish_date like", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotLike(String value) {
            addCriterion("publish_date not like", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<String> values) {
            addCriterion("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<String> values) {
            addCriterion("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(String value1, String value2) {
            addCriterion("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(String value1, String value2) {
            addCriterion("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(String value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(String value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(String value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(String value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLike(String value) {
            addCriterion("update_date like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotLike(String value) {
            addCriterion("update_date not like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<String> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<String> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(String value1, String value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(String value1, String value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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